package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.environment.Log;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class HalfUni2 extends ITIOA {

	// Controllable Edges
	class C_GRANT_C extends IEdgeControllable {

		public C_GRANT_C() {
			super(c, c, "grant");
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

		public C_PUB_D() {
			super(c, d, "pub");
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
	
	class D_GRANT_D extends IEdgeControllable {

		public D_GRANT_D() {
			super(d, d, "grant");
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

		public D_PUB_D() {
			super(d, d, "pub");
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

		public C_COIN_C() {
			super(c, c, "coin");
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

		public D_COIN_D() {
			super(d, d, "coin");
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

		public D_PATENT_C() {
			super(d, c, "patent");
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
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
					new C_COIN_C()
			};
			
			inputEdges = new IEdgeControllable[]{
				new C_GRANT_C(),
				new C_PUB_D()
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
			Log.log("Executing task at " + name + " in HalfUni2");
		}
	}
	
	class D extends ILocation {

		public D(HalfUni2 parent) {
			super("d", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
					new D_COIN_D(),
					new D_PATENT_C()
				};
				
				inputEdges = new IEdgeControllable[]{
						new D_PUB_D(),
						new D_GRANT_D()
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
			Log.log("Executing task at " + name + " in HalfUni2");
		}
	}
	
	ILocation c, d;
	public HalfUni2 () {
		super();
		
		c = new C(this);
		d = new D(this);

		c.setupEdges();
		d.setupEdges();
		
		current = c;
	}
}
