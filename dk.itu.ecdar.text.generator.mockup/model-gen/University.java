

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@43e01252 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 1 extends IEdgeUncontrollable {
   	    	 
		public 1() {
			//super(A, B, "grant");
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

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21261342 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 2 extends IEdgeUncontrollable {
   	    	 
		public 2() {
			//super(A, B, "grant");
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

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4b70ca96 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 3 extends IEdgeUncontrollable {
   	    	 
		public 3() {
			//super(A, B, "grant");
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

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@36ff5321 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 4 extends IEdgeUncontrollable {
   	    	 
		public 4() {
			//super(A, B, "grant");
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

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@206d0c9f (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 5 extends IEdgeUncontrollable {
   	    	 
		public 5() {
			//super(A, B, "grant");
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

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11575ea3 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 6 extends IEdgeUncontrollable {
   	    	 
		public 6() {
			//super(A, B, "grant");
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

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3a442579 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 7 extends IEdgeUncontrollable {
   	    	 
		public 7() {
			//super(A, B, "grant");
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

   	/*	Number: 8
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@276c7c8 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 8 extends IEdgeUncontrollable {
   	    	 
		public 8() {
			//super(A, B, "grant");
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@23d582a7 (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4f35a38 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@68c4d983 (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@41bf358f (urgent: false, universal: false, name: A)]

/* Generating all locations */

   	/* 	Number: 1 
   		Name: A */
   		
	class A extends ILocation {
		public A(University parent) {
			super("A", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7553c244 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@71c88986 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public boolean isPreemptive() {
			//Is always false atm
			return false;
		}

		@Override
		public void task() {
			//Is empty??
		}	
	}

   	/* 	Number: 2 
   		Name: B */
   		
	class B extends ILocation {
		public B(University parent) {
			super("B", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11575ea3 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3a442579 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@276c7c8 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				2;
				
						
		}

		@Override
		public boolean isPreemptive() {
			//Is always false atm
			return false;
		}

		@Override
		public void task() {
			//Is empty??
		}	
	}

   	/* 	Number: 3 
   		Name: C */
   		
	class C extends ILocation {
		public C(University parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@36ff5321 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@206d0c9f (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public boolean isPreemptive() {
			//Is always false atm
			return false;
		}

		@Override
		public void task() {
			//Is empty??
		}	
	}

   	/* 	Number: 4 
   		Name: D */
   		
	class D extends ILocation {
		public D(University parent) {
			super("D", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@43e01252 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21261342 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4b70ca96 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				2;
				
						
		}

		@Override
		public boolean isPreemptive() {
			//Is always false atm
			return false;
		}

		@Override
		public void task() {
			//Is empty??
		}	
	}

	
	ILocation D, C, B, A;
	
	public University() {
		super();
		
		A = new A(this);
		A.setupEdges();
		
		B = new B(this);
		B.setupEdges();
		
		C = new C(this);
		C.setupEdges();
		
		D = new D(this);
		D.setupEdges();
		
		current = A;
	}
}
