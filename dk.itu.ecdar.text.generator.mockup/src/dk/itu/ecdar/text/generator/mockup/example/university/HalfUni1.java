package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.environment.QuickLog;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class HalfUni1 extends ITIOA {

	// Controllable Edges
	class A_GRANT_B extends IEdgeControllable {

		public A_GRANT_B() {
			super(a, b, "grant");
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
	
	class A_PUB_A extends IEdgeControllable {

		public A_PUB_A() {
			super(a, a, "pub");
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
	
	class B_PUB_B extends IEdgeControllable {

		public B_PUB_B() {
			super(b, b, "pub");
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
	
	class B_GRANT_B extends IEdgeControllable {

		public B_GRANT_B() {
			super(b, b, "grant");
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
	
	// Uncontrollable Edges
	class A_PATENT_A extends IEdgeUncontrollable {

		public A_PATENT_A() {
			super(a, a, "patent");
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
	
	class B_PATENT_B extends IEdgeUncontrollable {

		public B_PATENT_B() {
			super(b, b, "patent");
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
	
	class B_COIN_A extends IEdgeUncontrollable {

		public B_COIN_A() {
			super(b, a, "coin");
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
	
	// Locations
	class A extends ILocation {

		public A(HalfUni1 parent) {
			super("a", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
					new A_PATENT_A()
			};
			
			inputEdges = new IEdgeControllable[]{
					new A_PUB_A(),
					new A_GRANT_B()
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
			QuickLog.log("Executing task at " + name + " in HalfUni1", 10);
		}
	}
	
	class B extends ILocation {

		public B(HalfUni1 parent) {
			super("b", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
					new B_PATENT_B(),
					new B_COIN_A()
			};
			
			inputEdges = new IEdgeControllable[]{
					new B_PUB_B(),
					new B_GRANT_B()
			};
		}
		
		@Override
		public boolean checkInvariant(long time) {
			return time <= 2;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			QuickLog.log("Executing task at " + name + " in HalfUni1", 10);
		}
	}
	
	ILocation a, b;
	
	public HalfUni1() {
		super();
		
		a = new A(this);
		b = new B(this);
		
		a.setupEdges();
		b.setupEdges();
		
		current = a;
	}
}