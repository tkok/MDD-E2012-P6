package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Machine extends ITIOA {
	
	// Controllable edges
	class Idle_COIN_Serving extends IEdgeControllable {

		public Idle_COIN_Serving(Machine parent) {
			super(parent.idle, parent.serving, "coin", parent);
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public ILocation traverse() {
			parent.timer.reset();
			return to;
		}
		
	}
	
	class Serving_COIN_Serving extends IEdgeControllable {

		public Serving_COIN_Serving(Machine parent) {
			super(parent.serving, parent.serving, "coin", parent);
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

		public Idle_TEA_Idle(Machine parent) {
			super(parent.idle, parent.idle, "tea", parent);
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

		public Serving_TEA_Idle(Machine parent) {
			super(parent.serving, parent.idle, "tea", parent);
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

		public Serving_COF_Idle(Machine parent) {
			super(parent.serving, parent.idle, "cof", parent);
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
			
			outputEdges = new IEdgeUncontrollable[]{
					new Idle_TEA_Idle(parent)
			};
			
			inputEdges = new IEdgeControllable[]{
					new Idle_COIN_Serving(parent)
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
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Serving extends ILocation {

		public Serving(Machine parent) {
			super("serving", parent);

			outputEdges = new IEdgeUncontrollable[]{
					new Serving_TEA_Idle(parent),
					new Serving_COF_Idle(parent)
			};
			
			inputEdges = new IEdgeControllable[]{
					new Serving_COIN_Serving(parent)
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
			// TODO Auto-generated method stub
			
		}
		
	}
	
	ILocation idle, serving;
	
	public Machine() {
		super();
		
		idle = new Idle(this);
		serving = new Serving(this);
		
		current = idle;
	}
		
}
