

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4485b66d (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 1 extends IEdgeUncontrollable {
   	    	 
		public 1() {
			//super(A, B, "grant");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@679a7ae9 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 2 extends IEdgeUncontrollable {
   	    	 
		public 2() {
			//super(A, B, "grant");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@385a5139 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 3 extends IEdgeUncontrollable {
   	    	 
		public 3() {
			//super(A, B, "grant");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@d74bf75 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 4 extends IEdgeUncontrollable {
   	    	 
		public 4() {
			//super(A, B, "grant");
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@5dfe8636 (urgent: false, universal: false, name: End), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@275e4273 (urgent: false, universal: false, name: Grant), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4e727e0e (urgent: false, universal: false, name: Start)]

/* Generating all locations */

   	/* 	Number: 1 
   		Name: Start */
   		
	class Start extends ILocation {
		public Start(University parent) {
			super("Start", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@145d727a (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1daf86ae (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
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
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@385a5139 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@d74bf75 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
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
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4485b66d (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@679a7ae9 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
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
