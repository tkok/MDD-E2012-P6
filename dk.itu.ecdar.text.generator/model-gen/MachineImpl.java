
pakage dk.itu.ecdar.text.generator.generated;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class MachineImpl extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1925fa1a (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@21ac8e20 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3f7188a9 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4fcd93bd (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge2 extends IOutputEdge {
   	    	 
		public Edge2() {
			//Target: Idle
				super(Idle, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=5;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3949cc16 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: Idle
				super(Idle, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=10;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e94e021 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
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
		public Idle(MachineImpl parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3949cc16 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3949cc16 (controllable: false)
								new Edge3()																																							};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e94e021 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e94e021 (controllable: false)
								new Edge4()																								};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=10;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.MachineImplIdle();
		}	
	}

   	/* 	Number: 2 
   		Name: Serving
   		Name: ecdarText::ETLocation */
   		
	class Serving extends ILocation {
		public Serving(MachineImpl parent) {
			super("Serving", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4fcd93bd (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4fcd93bd (controllable: false)
								new Edge2()																																																					};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3f7188a9 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3f7188a9 (controllable: false)
								new Edge1()																																																															};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=5;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.MachineImplServing();
		}	
	}

	
	ILocation Serving, Idle;
	
	public MachineImpl() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		Serving = new Serving(this);
		Serving.setupEdges();
		
		current = Idle;
	}
}
