package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.environment.Log;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Machine extends ITIOA {
	
	// Controllable edges
	class Idle_COIN_Serving extends IEdgeControllable {

		public Idle_COIN_Serving() {
			super(idle, serving, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public ILocation traverse() {
			resetTime();
			return to;
		}
	}
	
	class Serving_COIN_Serving extends IEdgeControllable {

		public Serving_COIN_Serving() {
			super(serving, serving, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	// Uncontrollable edges
	class Idle_TEA_Idle extends IEdgeUncontrollable {

		public Idle_TEA_Idle() {
			super(idle, idle, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && time >= 2;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	class Serving_TEA_Idle extends IEdgeUncontrollable {

		public Serving_TEA_Idle() {
			super(serving, idle, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
		
	}
	
	class Serving_COF_Idle extends IEdgeUncontrollable {

		public Serving_COF_Idle() {
			super(serving, idle, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && time >= 4;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
		
	}
	
	// Locations
	class Idle extends ILocation {

		public Idle(Machine parent) {
			super("idle", parent);
		}
		
		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
					new Idle_TEA_Idle()
			};
			
			inputEdges = new IEdgeControllable[]{
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
			Log.log("Executing task at " + name + " in Machine");
		}
	}
	
	class Serving extends ILocation {
		
		public Serving(Machine parent) {
			super("serving", parent);
		}
		
		@Override
		public void setupEdges() {

			outputEdges = new IEdgeUncontrollable[]{
					new Serving_TEA_Idle(),
					new Serving_COF_Idle()
			};
			
			inputEdges = new IEdgeControllable[]{
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
			Log.log("Executing task at " + name + "in Machine.");
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
