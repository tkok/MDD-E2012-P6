package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {

	// Controllable edges
	class Idle_COF_Coffee extends IInputEdge {

		public Idle_COF_Coffee() {
			super(coffee, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}
	
	class Idle_TEA_Tea extends IInputEdge {

		public Idle_TEA_Tea() {
			super(tea, "tea");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time <= 15;
		}
		
		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}
	
	class Idle_PUB_Stuck extends IInputEdge {

		public Idle_PUB_Stuck() {
			super(stuck, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time > 15;
		}

		@Override
		public void onTraverse() {
			
		}
	}

	class Stuck_TEA_Stuck extends IInputEdge {

		public Stuck_TEA_Stuck() {
			super(stuck, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class Stuck_COF_Stuck extends IInputEdge {

		public Stuck_COF_Stuck() {
			super(stuck, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}

	// Uncontrollable edges
	class Coffe_PUB_Idle extends IOutputEdge {

		public Coffe_PUB_Idle() {
			super(idle, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time >= 2;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}
	
	class Tea_PUB_Idle extends IOutputEdge {

		public Tea_PUB_Idle() {
			super(idle, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time >= 4;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}

	class Stuck_PUB_Stuck extends IOutputEdge {

		public Stuck_PUB_Stuck() {
			super(stuck, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}

	// Locations
	class Idle extends ILocation {

		public Idle(Researcher parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{};
			
			inputEdges = new IInputEdge[]{
					new Idle_COF_Coffee(),
					new Idle_TEA_Tea(),
					new Idle_PUB_Stuck()
			};
		}
		
		@Override
		public boolean checkInvariant(long time) {
			return true;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
	}

	class Coffee extends ILocation {

		public Coffee(Researcher parent) {
			super("Coffee", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new Coffe_PUB_Idle()	
			};
			
			inputEdges = new IInputEdge[]{};
		}
		
		@Override
		public boolean checkInvariant(long time) {
			return time <= 4;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
	}

	class Tea extends ILocation {

		public Tea(Researcher parent) {
			super("Tea", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new Tea_PUB_Idle()
			};
			
			inputEdges = new IInputEdge[]{};
		}
		
		@Override
		public boolean checkInvariant(long time) {
			return time <= 8;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
	}

	class Stuck extends ILocation {

		public Stuck(Researcher parent) {
			super("Stuck", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new Stuck_PUB_Stuck()
			};
			
			inputEdges = new IInputEdge[]{
					new Stuck_COF_Stuck(),
					new Stuck_TEA_Stuck()
			};
		}
		
		@Override
		public boolean checkInvariant(long time) {
			return true;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
	}
	
	ILocation idle, coffee, tea, stuck;
	
	public Researcher () {
		super();
		
		idle = new Idle(this);
		coffee = new Coffee(this);
		tea = new Tea(this);
		stuck = new Stuck(this);
		
		idle.setupEdges();
		coffee.setupEdges();
		tea.setupEdges();
		stuck.setupEdges();
		
		current = idle;
	}
}
