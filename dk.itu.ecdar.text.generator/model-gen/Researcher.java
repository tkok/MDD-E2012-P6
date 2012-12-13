
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@597547ad (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@285df6f6 (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3967ed85 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@430e0ad7 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@10080e18 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge1 extends IOutputEdge {
   	    	 
		public Edge1() {
			//Target: UNIV
				super(UNIV, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f911e14 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: UNIV
				super(UNIV, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5a5e119c (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge3 extends IInputEdge {
   	    	 
		public Edge3() {
			//Target: UNIV
				super(UNIV, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5dd8dbf6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: T
				super(T, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@45f0b44 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: T
				super(T, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@210bcae0 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge6 extends IOutputEdge {
   	    	 
		public Edge6() {
			//Target: Idle
				super(Idle, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5a9b32ce (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge7 extends IInputEdge {
   	    	 
		public Edge7() {
			//Target: C
				super(C, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 8
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6968e2f5 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge8 extends IInputEdge {
   	    	 
		public Edge8() {
			//Target: C
				super(C, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 9
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3f2dea31 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge9 extends IOutputEdge {
   	    	 
		public Edge9() {
			//Target: Idle
				super(Idle, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5738e61c (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge10 extends IInputEdge {
   	    	 
		public Edge10() {
			//Target: UNIV
				super(UNIV, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >15;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 11
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2028bbf6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge11 extends IInputEdge {
   	    	 
		public Edge11() {
			//Target: T
				super(T, "tea");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@985d2e0 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge12 extends IInputEdge {
   	    	 
		public Edge12() {
			//Target: C
				super(C, "cof");
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
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5738e61c (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5738e61c (controllable: false)
								new Edge10(),																																																	
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2028bbf6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2028bbf6 (controllable: false)
								new Edge11(),																																				
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@985d2e0 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@985d2e0 (controllable: false)
								new Edge12()																								};
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3f2dea31 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3f2dea31 (controllable: false)
								new Edge9()																																																																			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5a9b32ce (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5a9b32ce (controllable: false)
								new Edge7(),																																																																																								
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6968e2f5 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6968e2f5 (controllable: false)
								new Edge8()																																																																												};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=4;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@210bcae0 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@210bcae0 (controllable: false)
								new Edge6()																																																																																																													};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5dd8dbf6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5dd8dbf6 (controllable: false)
								new Edge4(),																																																																																																																															
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@45f0b44 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@45f0b44 (controllable: false)
								new Edge5()																																																																																																																			};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=8;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@10080e18 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@10080e18 (controllable: false)
								new Edge1()																																																																																																																																																																																			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f911e14 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1f911e14 (controllable: false)
								new Edge2(),																																																																																																																																																									
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5a5e119c (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5a5e119c (controllable: false)
								new Edge3()																																																																																																																																													};
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
			Controller.ResearcherUNIV();
		}	
	}

	
	ILocation UNIV, T, C, Idle;
	
	public Researcher() {
		super();
		Idle = new Idle(this);
		C = new C(this);
		T = new T(this);
		UNIV = new UNIV(this);
		
		current = Idle;
		
		Idle.setupEdges();
		C.setupEdges();
		T.setupEdges();
		UNIV.setupEdges();
	}
}
