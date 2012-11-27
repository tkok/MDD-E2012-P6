package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class HalfUni2 extends ITIOA {

	// Controllable Edges
	class C_GRANT_C extends IInputEdge {

		public C_GRANT_C() {
			super(c, c, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class C_PUB_D extends IInputEdge {

		public C_PUB_D() {
			super(c, d, "pub");
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
	
	class D_GRANT_D extends IInputEdge {

		public D_GRANT_D() {
			super(d, d, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class D_PUB_D extends IInputEdge {

		public D_PUB_D() {
			super(d, d, "pub");
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
	class C_COIN_C extends IOutputEdge {

		public C_COIN_C() {
			super(c, c, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class D_COIN_D extends IOutputEdge {

		public D_COIN_D() {
			super(d, d, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
	}
	
	class D_PATENT_C extends IOutputEdge {

		public D_PATENT_C() {
			super(d, c, "patent");
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
	class C extends ILocation {

		public C(HalfUni2 parent) {
			super("c", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new C_COIN_C()
			};
			
			inputEdges = new IInputEdge[]{
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
			
		}
	}
	
	class D extends ILocation {

		public D(HalfUni2 parent) {
			super("d", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new D_COIN_D(),
					new D_PATENT_C()
				};
				
				inputEdges = new IInputEdge[]{
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
