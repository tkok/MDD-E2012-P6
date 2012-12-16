
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2ef7628c (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1b08f35f (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@53b646f3 (urgent: false, universal: false, name: Start)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6a6d0556 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge1 extends IOutputEdge {
   	    	 
		public Edge1() {
			//Target: End
				super(End, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56e3c97b (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: End
				super(End, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1ac0b8 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge3 extends IInputEdge {
   	    	 
		public Edge3() {
			//Target: Grant
				super(Grant, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@53c532e5 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge4 extends IOutputEdge {
   	    	 
		public Edge4() {
			//Target: Start
				super(Start, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return /*to.checkInvariant(time)*/ true;
			
		}

		@Override
		public void onTraverse() {
			  
			resetTime();
			
		}
	} 

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@24d0bcec (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: End
				super(End, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return /*to.checkInvariant(time) &&*/ time >2;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1341b138 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge6 extends IInputEdge {
   	    	 
		public Edge6() {
			//Target: Grant
				super(Grant, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return /*to.checkInvariant(time) &&*/ time <=2;
					
			
			
			
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
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@24d0bcec (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@24d0bcec (controllable: false)
								new Edge5(),																																				
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1341b138 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1341b138 (controllable: false)
								new Edge6()																								};
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@53c532e5 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@53c532e5 (controllable: false)
								new Edge4()																																																					};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1ac0b8 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1ac0b8 (controllable: false)
								new Edge3()																																																															};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=20;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6a6d0556 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6a6d0556 (controllable: false)
								new Edge1()																																																																																															};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56e3c97b (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56e3c97b (controllable: false)
								new Edge2()																																																																												};
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
			Controller.SpecEnd();
		}	
	}

	
	ILocation End, Grant, Start;
	
	public Spec() {
		super();
		Start = new Start(this);
		Grant = new Grant(this);
		End = new End(this);
		
		current = Start;
		
		Start.setupEdges();
		Grant.setupEdges();
		End.setupEdges();
	}
}
