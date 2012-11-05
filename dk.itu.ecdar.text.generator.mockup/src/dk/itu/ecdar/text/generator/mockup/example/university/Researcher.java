package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {

	// Controllable edges
	class Idle_COF_Coffee extends IEdgeControllable {

		public Idle_COF_Coffee() {
			super(idle, coffee, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}
	
	class Idle_TEA_Tea extends IEdgeControllable {

		public Idle_TEA_Tea() {
			super(idle, tea, "tea");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && time <= 15;
		}
		
		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}
	
	class Idle_PUB_Stuck extends IEdgeControllable {

		public Idle_PUB_Stuck() {
			super(idle, stuck, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && time > 15;
		}

		@Override
		public void onTraverse() {
			
		}
	}

	class Stuck_TEA_Stuck extends IEdgeControllable {

		public Stuck_TEA_Stuck() {
			super(stuck, stuck, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class Stuck_COF_Stuck extends IEdgeControllable {

		public Stuck_COF_Stuck() {
			super(stuck, stuck, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}

	// Uncontrollable edges
	class Coffe_PUB_Idle extends IEdgeUncontrollable {

		public Coffe_PUB_Idle() {
			super(coffee, idle, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && time >= 2;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}
	
	class Tea_PUB_Idle extends IEdgeUncontrollable {

		public Tea_PUB_Idle() {
			super(tea, idle, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && time >= 4;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
	}

	class Stuck_PUB_Stuck extends IEdgeUncontrollable {

		public Stuck_PUB_Stuck() {
			super(stuck, stuck, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
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
			outputEdges = new IEdgeUncontrollable[]{};
			
			inputEdges = new IEdgeControllable[]{
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
			outputEdges = new IEdgeUncontrollable[]{
					new Coffe_PUB_Idle()	
			};
			
			inputEdges = new IEdgeControllable[]{};
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
			outputEdges = new IEdgeUncontrollable[]{
					new Tea_PUB_Idle()
			};
			
			inputEdges = new IEdgeControllable[]{};
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
			outputEdges = new IEdgeUncontrollable[]{
					new Stuck_PUB_Stuck()
			};
			
			inputEdges = new IEdgeControllable[]{
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
