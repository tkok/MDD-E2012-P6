package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class HalfUni1 extends ITIOA {

	// Controllable Edges
	class A_GRANT_B extends IEdgeControllable {

		public A_GRANT_B(HalfUni1 parent) {
			super(parent.a, parent.b, "grant", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
		}

		@Override
		public ILocation traverse() {
			parent.timer.reset();
			return to;
		}
	}
	
	class A_PUB_A extends IEdgeControllable {

		public A_PUB_A(HalfUni1 parent) {
			super(parent.a, parent.a, "pub", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	class B_PUB_B extends IEdgeControllable {

		public B_PUB_B(HalfUni1 parent) {
			super(parent.b, parent.b, "pub", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	class B_GRANT_B extends IEdgeControllable {

		public B_GRANT_B(HalfUni1 parent) {
			super(parent.b, parent.b, "grant", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	// Uncontrollable Edges
	class A_PATENT_A extends IEdgeUncontrollable {

		public A_PATENT_A(HalfUni1 parent) {
			super(parent.a, parent.a, "patent", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	class B_PATENT_B extends IEdgeUncontrollable {

		public B_PATENT_B(HalfUni1 parent) {
			super(parent.b, parent.b, "patent", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
		}

		@Override
		public ILocation traverse() {
			return to;
		}
	}
	
	class B_COIN_A extends IEdgeUncontrollable {

		public B_COIN_A(HalfUni1 parent) {
			super(parent.b, parent.a, "coin", parent);
		}

		@Override
		public boolean checkGuard() {
			return from.checkInvariant() && true;
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
			
			outputEdges = new IEdgeUncontrollable[]{
					new A_PATENT_A(parent)
			};
			
			inputEdges = new IEdgeControllable[]{
					new A_PUB_A(parent),
					new A_GRANT_B(parent)
			};
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
	
	class B extends ILocation {

		public B(HalfUni1 parent) {
			super("b", parent);
			
			outputEdges = new IEdgeUncontrollable[]{
					new B_PATENT_B(parent),
					new B_COIN_A(parent)
			};
			
			inputEdges = new IEdgeControllable[]{
					new B_PUB_B(parent),
					new B_GRANT_B(parent)
			};
		}

		@Override
		public boolean checkInvariant() {
			return parent.timer.getTime() <= 2;
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
	
	ILocation a, b;
	
	public HalfUni1() {
		super();
		
		a = new A(this);
		b = new B(this);
		
		current = a;
	}
}
