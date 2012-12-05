
pakage dk.itu.ecdar.text.generator.generated;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Machine extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@10c3db68 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2388c8b6 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@69f5b714 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: Serving
				super(Serving, "coin");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@17a5f5a5 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge2 extends IOutputEdge {
   	    	 
		public Edge2() {
			//Target: Idle
				super(Idle, "tea");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@17897c4d (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: Idle
				super(Idle, "cof");
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

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4c0df5f8 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge4 extends IOutputEdge {
   	    	 
		public Edge4() {
			//Target: Idle
				super(Idle, "tea");
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

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2315e9ca (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: Serving
				super(Serving, "coin");
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
		public Idle(Machine parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4c0df5f8 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4c0df5f8 (controllable: false)
								new Edge4()																																							};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2315e9ca (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2315e9ca (controllable: false)
								new Edge5()																								};
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
			Controller.MachineIdle();
		}	
	}

   	/* 	Number: 2 
   		Name: Serving
   		Name: ecdarText::ETLocation */
   		
	class Serving extends ILocation {
		public Serving(Machine parent) {
			super("Serving", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@17a5f5a5 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@17a5f5a5 (controllable: false)
								new Edge2(),																																																																		
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@17897c4d (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@17897c4d (controllable: false)
								new Edge3()																																																					};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@69f5b714 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@69f5b714 (controllable: false)
								new Edge1()																																																																												};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=6;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.MachineServing();
		}	
	}

	
	ILocation Serving, Idle;
	
	public Machine() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		Serving = new Serving(this);
		Serving.setupEdges();
		
		current = Idle;
	}
}
