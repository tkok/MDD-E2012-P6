package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University2 extends ITIOA {

	// Controllable edges
	class A_GRANT_B extends IEdgeControllable {

		public A_GRANT_B() {
			super(A, B, "grant");
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

	class A_PUB_D extends IEdgeControllable {

		public A_PUB_D() {
			super(A, D, "pub");
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

	class B_GRANT_B extends IEdgeControllable {

		public B_GRANT_B() {
			super(B, B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			
		}
		
	}

	class B_PUB_B extends IEdgeControllable {

		public B_PUB_B() {
			super(B, B, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	class C_GRANT_C extends IEdgeControllable {
		
		public C_GRANT_C() {
			super(C, C, "grant");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}
		
		@Override
		public void onTraverse() {}
	}
	
	class C_PUB_D extends IEdgeControllable {
		
		public C_PUB_D() {
			super(C, D, "pub");
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
	
	class D_PUB_D extends IEdgeControllable {
		
		
		public D_PUB_D() {
			super(D, D, "pub");
		}
		
		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}
		
		@Override
		public void onTraverse(){
		}
	}

	class D_GRANT_D extends IEdgeControllable {
		
		
		public D_GRANT_D() {
			super(D, D, "grant");
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
	class B_COIN_C extends IEdgeUncontrollable {
		public B_COIN_C() {
			super(B, C, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
		}
	}
	
	class D_PATENT_A extends IEdgeUncontrollable {
		public D_PATENT_A() {
			super(D, A, "patent");
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
			outputEdges = new IEdgeUncontrollable[]{};
			
			inputEdges = new IEdgeControllable[]{
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
			outputEdges = new IEdgeUncontrollable[]{
					new B_COIN_C()
			};
			
			inputEdges = new IEdgeControllable[]{
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
			outputEdges = new IEdgeUncontrollable[]{
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
			
		}
		
	}

	class D extends ILocation {

		public D(University2 parent) {
			super("D", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
					new D_PATENT_A()
			};
			
			inputEdges = new IEdgeControllable[]{
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
