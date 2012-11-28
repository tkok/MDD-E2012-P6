

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@42e3f9e3 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 1 extends IOutputEdge {
   	    	 
		public 1() {
			//super(A, B, "grant");

			// Edge properties

			
			D
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52f34d18 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 2 extends IOutputEdge {
   	    	 
		public 2() {
			//super(A, B, "grant");

			// Edge properties

			
			D
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@22ddfb06 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 3 extends IOutputEdge {
   	    	 
		public 3() {
			//super(A, B, "grant");

			// Edge properties

			
			A
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@19e43b5e (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 4 extends IOutputEdge {
   	    	 
		public 4() {
			//super(A, B, "grant");

			// Edge properties

			
			C
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@e1bce78 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 5 extends IOutputEdge {
   	    	 
		public 5() {
			//super(A, B, "grant");

			// Edge properties

			
			[dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl@4f8e0de7, dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl@7732e17e (value: 0)]
			
			D
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1ed2f9e3 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 6 extends IOutputEdge {
   	    	 
		public 6() {
			//super(A, B, "grant");

			// Edge properties

			
			B
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3949cc16 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 7 extends IOutputEdge {
   	    	 
		public 7() {
			//super(A, B, "grant");

			// Edge properties

			
			B
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73b05494 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 8 extends IOutputEdge {
   	    	 
		public 8() {
			//super(A, B, "grant");

			// Edge properties

			
			C
			
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4d6d7d9e (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7e7454cc (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2d725455 (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3b971ee3 (urgent: false, universal: false, name: A)]

/* Generating all locations */

   	/* 	Number: 1 
   		Name: A */
   		
	class A extends ILocation {
		public A(University parent) {
			super("A", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5fdc21a7 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
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
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1ed2f9e3 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3949cc16 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73b05494 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
										
				
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
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@19e43b5e (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@e1bce78 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
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
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@42e3f9e3 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52f34d18 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@22ddfb06 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
										
				
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
