package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class HalfUni1 extends ITIOA {

	// Controllable Edges
	class A_GRANT_B extends IInputEdge {

		public A_GRANT_B() {
			super(a, b, "grant");
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
	
	class A_PUB_A extends IInputEdge {

		public A_PUB_A() {
			super(a, a, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class B_PUB_B extends IInputEdge {

		public B_PUB_B() {
			super(b, b, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class B_GRANT_B extends IInputEdge {

		public B_GRANT_B() {
			super(b, b, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	// Uncontrollable Edges
	class A_PATENT_A extends IOutputEdge {

		public A_PATENT_A() {
			super(a, a, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class B_PATENT_B extends IOutputEdge {

		public B_PATENT_B() {
			super(b, b, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class B_COIN_A extends IOutputEdge {

		public B_COIN_A() {
			super(b, a, "coin");
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
	class A extends ILocation {

		public A(HalfUni1 parent) {
			super("a", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new A_PATENT_A()
			};
			
			inputEdges = new IInputEdge[]{
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
			
		}
	}
	
	class B extends ILocation {

		public B(HalfUni1 parent) {
			super("b", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new B_PATENT_B(),
					new B_COIN_A()
			};
			
			inputEdges = new IInputEdge[]{
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