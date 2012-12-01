

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@29c50e17 (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7a5cd4b6 (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@543f8418 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4c627d22 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@346c0419 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge1 extends IOutputEdge {
   	    	 
		public Edge1() {
			//Target: UNIV
			//Will be rewritten to match super(TargetEdge, Signal)
			super(UNIV, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@77cb817b (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: UNIV
			//Will be rewritten to match super(TargetEdge, Signal)
			super(UNIV, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4ff0ed17 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge3 extends IInputEdge {
   	    	 
		public Edge3() {
			//Target: UNIV
			//Will be rewritten to match super(TargetEdge, Signal)
			super(UNIV, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4f38f663 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: T
			//Will be rewritten to match super(TargetEdge, Signal)
			super(T, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6974c520 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: T
			//Will be rewritten to match super(TargetEdge, Signal)
			super(T, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11fb7f52 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge6 extends IOutputEdge {
   	    	 
		public Edge6() {
			//Target: Idle
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Idle, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=4;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@528b376 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge7 extends IInputEdge {
   	    	 
		public Edge7() {
			//Target: C
			//Will be rewritten to match super(TargetEdge, Signal)
			super(C, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@455354c6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge8 extends IInputEdge {
   	    	 
		public Edge8() {
			//Target: C
			//Will be rewritten to match super(TargetEdge, Signal)
			super(C, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e83de2b (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge9 extends IOutputEdge {
   	    	 
		public Edge9() {
			//Target: Idle
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Idle, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=2;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 10
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7d89a87b (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge10 extends IInputEdge {
   	    	 
		public Edge10() {
			//Target: UNIV
			//Will be rewritten to match super(TargetEdge, Signal)
			super(UNIV, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >15;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 11
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4f6333f9 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge11 extends IInputEdge {
   	    	 
		public Edge11() {
			//Target: T
			//Will be rewritten to match super(TargetEdge, Signal)
			super(T, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time <=15;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 12
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2ec9cbbb (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge12 extends IInputEdge {
   	    	 
		public Edge12() {
			//Target: C
			//Will be rewritten to match super(TargetEdge, Signal)
			super(C, "SIGNAL");
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
   		Name: Idle
   		Name: ecdarText::ETLocation */
   		
	class Idle extends ILocation {
		public Idle(Researcher parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
										
				
										
				
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
					
						
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7d89a87b (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7d89a87b (controllable: false)
								new Edge10()
							
						
							
						
							
						
										
				
					
						
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4f6333f9 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4f6333f9 (controllable: false)
								new Edge11()
							
						
							
						
										
				
					
						
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2ec9cbbb (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2ec9cbbb (controllable: false)
								new Edge12()
							
						
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			
			
			Controller.ResearcherIdle();
			
			
		}	
	}

   	/* 	Number: 2 
   		Name: C
   		Name: ecdarText::ETLocation */
   		
	class C extends ILocation {
		public C(Researcher parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
										
				
										
				
					
						
							
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e83de2b (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e83de2b (controllable: false)
								new Edge9()
							
						
							
						
							
						
							
						
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
					
						
						
							
						
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@528b376 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@528b376 (controllable: false)
								new Edge7()
							
						
							
						
							
						
							
						
							
						
							
						
										
				
					
						
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@455354c6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@455354c6 (controllable: false)
								new Edge8()
							
						
							
						
							
						
							
						
							
						
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=4;
					
				
				
						
		}

		@Override
		public void task() {
			
			
			Controller.ResearcherC();
			
			
		}	
	}

   	/* 	Number: 3 
   		Name: T
   		Name: ecdarText::ETLocation */
   		
	class T extends ILocation {
		public T(Researcher parent) {
			super("T", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
										
				
										
				
					
						
							
							
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11fb7f52 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11fb7f52 (controllable: false)
								new Edge6()
							
						
							
						
							
						
							
						
							
						
							
						
							
						
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
					
						
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4f38f663 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4f38f663 (controllable: false)
								new Edge4()
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
										
				
					
						
						
							
						
							
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6974c520 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6974c520 (controllable: false)
								new Edge5()
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=8;
					
				
				
						
		}

		@Override
		public void task() {
			
			
			Controller.ResearcherT();
			
			
		}	
	}

   	/* 	Number: 4 
   		Name: UNIV
   		Name: ecdarText::ETLocation */
   		
	class UNIV extends ILocation {
		public UNIV(Researcher parent) {
			super("UNIV", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@346c0419 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@346c0419 (controllable: false)
								new Edge1()
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
										
				
										
				
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
					
						
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@77cb817b (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@77cb817b (controllable: false)
								new Edge2()
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
										
				
					
						
						
							
						
							
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4ff0ed17 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4ff0ed17 (controllable: false)
								new Edge3()
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
							
						
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			
			
			Controller.ResearcherUNIV();
			
			
		}	
	}

	
	ILocation UNIV, T, C, Idle;
	
	public Researcher() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		C = new C(this);
		C.setupEdges();
		
		T = new T(this);
		T.setupEdges();
		
		UNIV = new UNIV(this);
		UNIV.setupEdges();
		
		current = Idle;
	}
}
