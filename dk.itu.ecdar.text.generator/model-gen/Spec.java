

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3574ba5b (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 1 extends IOutputEdge {
   	    	 
		public 1() {
			//super(A, B, "grant");

			// Edge properties

			
			End
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3c985bf9 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 2 extends IOutputEdge {
   	    	 
		public 2() {
			//super(A, B, "grant");

			// Edge properties

			
			End
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@f46cd29 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 3 extends IOutputEdge {
   	    	 
		public 3() {
			//super(A, B, "grant");

			// Edge properties

			
			Grant
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@18b5797a (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 4 extends IOutputEdge {
   	    	 
		public 4() {
			//super(A, B, "grant");

			// Edge properties

			
			[dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl@7b81e761 (value: 0), dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl@220ed406]
			
			Start
			
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3a442579 (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7b97ab3 (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4a81512 (urgent: false, universal: false, name: Start)]

/* Generating all locations */

   	/* 	Number: 1 
   		Name: Start */
   		
	class Start extends ILocation {
		public Start(University parent) {
			super("Start", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@34aab7bc (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@231b98ae (controllable: false)
										
				
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
   		Name: Grant */
   		
	class Grant extends ILocation {
		public Grant(University parent) {
			super("Grant", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@f46cd29 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@18b5797a (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				20;
				
						
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
   		Name: End */
   		
	class End extends ILocation {
		public End(University parent) {
			super("End", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3574ba5b (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3c985bf9 (controllable: false)
										
				
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
