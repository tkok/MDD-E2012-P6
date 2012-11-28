

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Machine extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6dd8e0c6 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 1 extends IOutputEdge {
   	    	 
		public 1() {
			//super(A, B, "grant");

			// Edge properties

			
			Serving
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1465d8d2 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 2 extends IOutputEdge {
   	    	 
		public 2() {
			//super(A, B, "grant");

			// Edge properties

			
			Idle
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@58989c7 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 3 extends IOutputEdge {
   	    	 
		public 3() {
			//super(A, B, "grant");

			// Edge properties

			
			Idle
			
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1684e343 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3c9f91aa (urgent: false, universal: false, name: Idle)]

/* Generating all locations */

   	/* 	Number: 1 
   		Name: Idle */
   		
	class Idle extends ILocation {
		public Idle(University parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1355966d (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@49d7800a (controllable: false)
										
				
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
   		Name: Serving */
   		
	class Serving extends ILocation {
		public Serving(University parent) {
			super("Serving", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6dd8e0c6 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1465d8d2 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@58989c7 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				6;
				
						
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
