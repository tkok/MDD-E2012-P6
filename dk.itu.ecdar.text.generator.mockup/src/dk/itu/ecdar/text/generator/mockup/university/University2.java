package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University2 extends ITIOA {

	// Controllable edges
	class A_GRANT_B extends IInputEdge {

		public A_GRANT_B() {
			super(B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
		
	}

	class A_PUB_D extends IInputEdge {

		public A_PUB_D() {
			super(D, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
		
	}

	class B_GRANT_B extends IInputEdge {

		public B_GRANT_B() {
			super(B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			
		}
		
	}

	class B_PUB_B extends IInputEdge {

		public B_PUB_B() {
			super(B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	class C_GRANT_C extends IInputEdge {
		
		public C_GRANT_C() {
			super(C, "grant");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}
		
		@Override
		public void onTraverse() {}
	}
	
	class C_PUB_D extends IInputEdge {
		
		public C_PUB_D() {
			super(D, "pub");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}
		
		@Override
		public void onTraverse(){
			resetTime();
		}
	}
	
	class D_PUB_D extends IInputEdge {
		
		
		public D_PUB_D() {
			super(D, "pub");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}
		
		@Override
		public void onTraverse(){
		}
	}

	class D_GRANT_D extends IInputEdge {
		
		
		public D_GRANT_D() {
			super(D, "grant");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}
		
		@Override
		public void onTraverse(){
		}
	}

	// Uncontrollable edges
	class B_COIN_C extends IOutputEdge {
		public B_COIN_C() {
			super(C, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
		}
	}
	
	class D_PATENT_A extends IOutputEdge {
		public D_PATENT_A() {
			super(A, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
		}
	}
	
	// Locations
	class A extends ILocation {

		public A(University2 parent) {
			super("A", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{};
			
			inputEdges = new IInputEdge[]{
					new A_GRANT_B(),
					new A_PUB_D()
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

		public B(University2 parent) {
			super("B", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new B_COIN_C()
			};
			
			inputEdges = new IInputEdge[]{
					new B_GRANT_B(),
					new B_PUB_B()
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
	
	class C extends ILocation {

		public C(University2 parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
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

		public D(University2 parent) {
			super("D", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new D_PATENT_A()
			};
			
			inputEdges = new IInputEdge[]{
					new D_GRANT_D(),
					new D_PUB_D()
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

	ILocation A, B, C, D;
	
	public University2() {
		super();
		
		A = new A(this);
		B = new B(this);
		C = new C(this);
		D = new D(this);
		
		A.setupEdges();
		B.setupEdges();
		C.setupEdges();
		D.setupEdges();
		
		current = A;
	}
}
