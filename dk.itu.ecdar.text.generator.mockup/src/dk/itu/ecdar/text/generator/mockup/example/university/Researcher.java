package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {

	// Controllable edges
	class Idle_COF_Coffee extends IEdgeControllable {

		public Idle_COF_Coffee(ILocation to, ITIOA parent) {
			super(to, "cof", parent);
		}

		@Override
		public boolean checkGuard() {
			return true;
		}

		@Override
		public ILocation traverse() {
			parent.timer.reset();
			return to;
		}
	}
	
	class Idle_TEA_Tea extends IEdgeControllable {

		public Idle_TEA_Tea(ILocation to, ITIOA parent) {
			super(to, "tea", parent);
		}
		
		@Override
		public boolean checkGuard() {
			return parent.timer.getTime() <= 15;
		}
		
		@Override
		public ILocation traverse() {
			parent.timer.reset();
			return to;
		}
	}
	
	class Idle_PUB_Stuck extends IEdgeControllable {

		public Idle_PUB_Stuck(ILocation to, ITIOA parent) {
			super(to, "tea", parent);
		}

		@Override
		public boolean checkGuard() {
			return parent.timer.getTime() > 15;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}

	class Stuck_TEA_Stuck extends IEdgeControllable {

		public Stuck_TEA_Stuck(ILocation to, ITIOA parent) {
			super(to, "tea", parent);
		}

		@Override
		public boolean checkGuard() {
			return true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	class Stuck_COF_Stuck extends IEdgeControllable {

		public Stuck_COF_Stuck(ILocation to, ITIOA parent) {
			super(to, "cof", parent);
		}

		@Override
		public boolean checkGuard() {
			return true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}

	// Uncontrollable edges
	class Coffe_PUB_Idle extends IEdgeUncontrollable {

		public Coffe_PUB_Idle(ILocation to, ITIOA parent) {
			super(to, "pub", parent);
		}

		@Override
		public boolean checkGuard() {
			return parent.timer.getTime() >= 2;
		}

		@Override
		public ILocation traverse() {
			parent.timer.reset();
			return to;
		}
	}
	
	class Tea_PUB_Idle extends IEdgeUncontrollable {

		public Tea_PUB_Idle(ILocation to, ITIOA parent) {
			super(to, "pub", parent);
		}

		@Override
		public boolean checkGuard() {
			return parent.timer.getTime() >= 4;
		}

		@Override
		public ILocation traverse() {
			parent.timer.reset();
			return to;
		}
	}

	class Stuck_PUB_Stuck extends IEdgeUncontrollable {

		public Stuck_PUB_Stuck(ILocation to, ITIOA parent) {
			super(to, "pub", parent);
		}

		@Override
		public boolean checkGuard() {
			return true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}

	// Locations
	class Idle extends ILocation {

		public Idle(Researcher parent) {
			super("Idle", parent);
			
			outputEdges = new IEdgeUncontrollable[0];
			
			inputEdges = new IEdgeControllable[3];
			inputEdges[0] = new Idle_COF_Coffee(parent.coffee, parent);
			inputEdges[1] = new Idle_TEA_Tea(parent.tea, parent);
			inputEdges[2] = new Idle_PUB_Stuck(parent.stuck, parent);
		}

		@Override
		public boolean checkInvariant() {
			return true;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			// TODO Auto-generated method stub
		}
		
	}

	class Coffee extends ILocation {

		public Coffee(Researcher parent) {
			super("Coffee", parent);
			
			outputEdges = new IEdgeUncontrollable[1];
			outputEdges[0] = new Coffe_PUB_Idle(parent.idle, parent);
			
			inputEdges = new IEdgeControllable[0];
		}

		@Override
		public boolean checkInvariant() {
			return parent.timer.getTime() <= 4;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			// TODO Auto-generated method stub
		}
	}

	class Tea extends ILocation {

		public Tea(Researcher parent) {
			super("Tea", parent);
			
			outputEdges = new IEdgeUncontrollable[1];
			outputEdges[0] = new Tea_PUB_Idle(parent.idle, parent);
			
			inputEdges = new IEdgeControllable[0];
		}

		@Override
		public boolean checkInvariant() {
			return parent.timer.getTime() <= 8;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			// TODO Auto-generated method stub
		}
		
	}

	class Stuck extends ILocation {

		public Stuck(Researcher parent) {
			super("Stuck", parent);
			
			outputEdges = new IEdgeUncontrollable[1];
			outputEdges[0] = new Stuck_PUB_Stuck(parent.stuck, parent);
			
			inputEdges = new IEdgeControllable[2];
			inputEdges[0] = new Stuck_COF_Stuck(parent.stuck, parent);
			inputEdges[0] = new Stuck_TEA_Stuck(parent.stuck, parent);
		}

		@Override
		public boolean checkInvariant() {
			return true;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			// TODO Auto-generated method stub
		}
		
	}
	
	ILocation idle, coffee, tea, stuck;
	
	public Researcher () {
		super();
		
		idle = new Idle(this);
		coffee = new Coffee(this);
		tea = new Tea(this);
		stuck = new Stuck(this);
		
		current = idle;
	}
}
