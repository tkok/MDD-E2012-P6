
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class MachineImpl extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7393358c (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@679e900a (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@19675d97 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: Serving
				super(Serving, "coin");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@15a2c346 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge2 extends IOutputEdge {
   	    	 
		public Edge2() {
			//Target: Idle
				super(Idle, "cof");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return /*to.checkInvariant(time) &&*/ time >=5;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@689ac6da (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: Idle
				super(Idle, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return /*to.checkInvariant(time) &&*/ time >=10;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			  
			resetTime();
			
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@f00cb1e (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: Serving
				super(Serving, "coin");
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@689ac6da (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@689ac6da (controllable: false)
								new Edge3()																																							};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@f00cb1e (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@f00cb1e (controllable: false)
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@15a2c346 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@15a2c346 (controllable: false)
								new Edge2()																																																					};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@19675d97 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@19675d97 (controllable: false)
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
		Serving = new Serving(this);
		
		current = Idle;
		
		Idle.setupEdges();
		Serving.setupEdges();
	}
}
