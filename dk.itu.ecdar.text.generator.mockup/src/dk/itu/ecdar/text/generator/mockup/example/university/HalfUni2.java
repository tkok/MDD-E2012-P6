package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class HalfUni2 extends ITIOA {

	// Controllable Edges
	class C_GRANT_C extends IEdgeControllable {

		public C_GRANT_C(HalfUni2 parent) {
			super(parent.c, parent.c, "grant", parent);
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
	
	class C_PUB_D extends IEdgeControllable {

		public C_PUB_D(HalfUni2 parent) {
			super(parent.c, parent.d, "pub", parent);
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
	
	class D_GRANT_D extends IEdgeControllable {

		public D_GRANT_D(HalfUni2 parent) {
			super(parent.d, parent.d, "grant", parent);
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
	
	class D_PUB_D extends IEdgeControllable {

		public D_PUB_D(HalfUni2 parent) {
			super(parent.d, parent.d, "pub", parent);
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
	class C_COIN_C extends IEdgeUncontrollable {

		public C_COIN_C(HalfUni2 parent) {
			super(parent.c, parent.c, "coin", parent);
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
	
	class D_COIN_D extends IEdgeUncontrollable {

		public D_COIN_D(HalfUni2 parent) {
			super(parent.d, parent.d, "coin", parent);
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
	
	class D_PATENT_C extends IEdgeUncontrollable {

		public D_PATENT_C(HalfUni2 parent) {
			super(parent.d, parent.c, "patent", parent);
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
	class C extends ILocation {

		public C(HalfUni2 parent) {
			super("c", parent);
			
			outputEdges = new IEdgeUncontrollable[]{
					new C_COIN_C(parent)
			};
			
			inputEdges = new IEdgeControllable[]{
				new C_GRANT_C(parent),
				new C_PUB_D(parent)
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
	
	class D extends ILocation {

		public D(HalfUni2 parent) {
			super("d", parent);
			
			outputEdges = new IEdgeUncontrollable[]{
				new D_COIN_D(parent),
				new D_PATENT_C(parent)
			};
			
			inputEdges = new IEdgeControllable[]{
					new D_PUB_D(parent),
					new D_GRANT_D(parent)
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
			// TODO Auto-generated method stub
			
		}
	}
	
	ILocation c, d;
	public HalfUni2 () {
		
		c = new C(this);
		d = new D(this);
		
		current = c;
	}
}
