

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@72a77b84 (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@486de08b (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1684e343 (urgent: false, universal: false, name: Start)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@71140382 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge1 extends IOutputEdge {
   	    	 
		public Edge1() {
			//Target: End
			//Will be rewritten to match super(TargetEdge, Signal)
			super(End, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@63b19723 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: End
			//Will be rewritten to match super(TargetEdge, Signal)
			super(End, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6080e4c6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge3 extends IInputEdge {
   	    	 
		public Edge3() {
			//Target: Grant
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Grant, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@796c1a02 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge4 extends IOutputEdge {
   	    	 
		public Edge4() {
			//Target: Start
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Start, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7b8f6d05 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: End
			//Will be rewritten to match super(TargetEdge, Signal)
			super(End, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >2;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1465d8d2 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge6 extends IInputEdge {
   	    	 
		public Edge6() {
			//Target: Grant
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Grant, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time <=2;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 




/* Generating all locations */

   	/* 	Number: 1 
   		Name: Start
   		Name: ecdarText::ETLocation */
   		
	class Start extends ILocation {
		public Start(Spec parent) {
			super("Start", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7b8f6d05 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7b8f6d05 (controllable: false)
								new Edge5(),
							
							
										
				
						
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1465d8d2 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1465d8d2 (controllable: false)
								new Edge6()
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.SpecStart();
		}	
	}

   	/* 	Number: 2 
   		Name: Grant
   		Name: ecdarText::ETLocation */
   		
	class Grant extends ILocation {
		public Grant(Spec parent) {
			super("Grant", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@796c1a02 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@796c1a02 (controllable: false)
								new Edge4()
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6080e4c6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6080e4c6 (controllable: false)
								new Edge3()
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=20;
					
				
				
						
		}

		@Override
		public void task() {
			Controller.SpecGrant();
		}	
	}

   	/* 	Number: 3 
   		Name: End
   		Name: ecdarText::ETLocation */
   		
	class End extends ILocation {
		public End(Spec parent) {
			super("End", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@71140382 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@71140382 (controllable: false)
								new Edge1()
							
							
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@63b19723 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@63b19723 (controllable: false)
								new Edge2()
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.SpecEnd();
		}	
	}

	
	ILocation End, Grant, Start;
	
	public Spec() {
		super();
		
		Start = new Start(this);
		Start.setupEdges();
		
		Grant = new Grant(this);
		Grant.setupEdges();
		
		End = new End(this);
		End.setupEdges();
		
		current = Start;
	}
}
