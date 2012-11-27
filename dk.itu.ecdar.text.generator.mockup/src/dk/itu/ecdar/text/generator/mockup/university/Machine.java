package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Machine extends ITIOA {
	
	// Controllable edges
	class Idle_COIN_Serving extends IInputEdge {

		public Idle_COIN_Serving() {
			super(idle, serving, "coin");
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
	
	class Serving_COIN_Serving extends IInputEdge {

		public Serving_COIN_Serving() {
			super(serving, serving, "coin");
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
	class Idle_TEA_Idle extends IOutputEdge {

		public Idle_TEA_Idle() {
			super(idle, idle, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time >= 2;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class Serving_TEA_Idle extends IOutputEdge {

		public Serving_TEA_Idle() {
			super(serving, idle, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	class Serving_COF_Idle extends IOutputEdge {

		public Serving_COF_Idle() {
			super(serving, idle, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time >= 4;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	// Locations
	class Idle extends ILocation {

		public Idle(Machine parent) {
			super("idle", parent);
		}
		
		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new Idle_TEA_Idle()
			};
			
			inputEdges = new IInputEdge[]{
					new Idle_COIN_Serving()
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
	
	class Serving extends ILocation {
		
		public Serving(Machine parent) {
			super("serving", parent);
		}
		
		@Override
		public void setupEdges() {

			outputEdges = new IOutputEdge[]{
					new Serving_TEA_Idle(),
					new Serving_COF_Idle()
			};
			
			inputEdges = new IInputEdge[]{
					new Serving_COIN_Serving()
			};
			
		}

		@Override
		public boolean checkInvariant(long time) {
			return time <= 6;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}		
	}
	
	ILocation idle, serving;
	
	public Machine() {
		super();
		
		idle = new Idle(this);
		serving = new Serving(this);
		
		idle.setupEdges();
		serving.setupEdges();
		
		current = idle;
	}
		
}
