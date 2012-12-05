
pakage dk.itu.ecdar.text.generator.generated;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@14a77b98 (urgent: false, universal: false, name: D), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@76cf0d8 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@25184406 (urgent: false, universal: false, name: B), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@323a4542 (urgent: false, universal: false, name: A)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@497f6a92 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: D
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

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@e82751a (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: D
				super(D, "grant");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73cf64f8 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: A
				super(A, "patent");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1a9b701 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: C
				super(C, "grant");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@22c977fc (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: D
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

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5fdc21a7 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge6 extends IInputEdge {
   	    	 
		public Edge6() {
			//Target: B
				super(B, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge7 extends IInputEdge {
   	    	 
		public Edge7() {
			//Target: B
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

   	/*	Number: 8
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7b89c9fe (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge8 extends IOutputEdge {
   	    	 
		public Edge8() {
			//Target: C
				super(C, "coin");
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

   	/*	Number: 9
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@8538057 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge9 extends IInputEdge {
   	    	 
		public Edge9() {
			//Target: A
				super(A, "pub");
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

   	/*	Number: 10
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@d7dd0a0 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge10 extends IInputEdge {
   	    	 
		public Edge10() {
			//Target: B
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




/* Generating all locations */

   	/* 	Number: 1 
   		Name: A
   		Name: ecdarText::ETLocation */
   		
	class A extends ILocation {
		public A(University parent) {
			super("A", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@8538057 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@8538057 (controllable: false)
								new Edge9(),																																				
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@d7dd0a0 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@d7dd0a0 (controllable: false)
								new Edge10()																								};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityA();
		}	
	}

   	/* 	Number: 2 
   		Name: B
   		Name: ecdarText::ETLocation */
   		
	class B extends ILocation {
		public B(University parent) {
			super("B", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7b89c9fe (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7b89c9fe (controllable: false)
								new Edge8()																																																					};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5fdc21a7 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5fdc21a7 (controllable: false)
								new Edge6(),																																																																											
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f0461f7 (controllable: false)
								new Edge7()																																																															};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=2;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityB();
		}	
	}

   	/* 	Number: 3 
   		Name: C
   		Name: ecdarText::ETLocation */
   		
	class C extends ILocation {
		public C(University parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1a9b701 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1a9b701 (controllable: false)
								new Edge4(),																																																																																																					
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@22c977fc (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@22c977fc (controllable: false)
								new Edge5()																																																																																									};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityC();
		}	
	}

   	/* 	Number: 4 
   		Name: D
   		Name: ecdarText::ETLocation */
   		
	class D extends ILocation {
		public D(University parent) {
			super("D", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73cf64f8 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73cf64f8 (controllable: false)
								new Edge3()																																																																																																																											};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@497f6a92 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@497f6a92 (controllable: false)
								new Edge1(),																																																																																																																																												
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@e82751a (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@e82751a (controllable: false)
								new Edge2()																																																																																																																																};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=2;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.UniversityD();
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
