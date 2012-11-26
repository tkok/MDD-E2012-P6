

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class MachineRef extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1925fa1a (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@70d109de (controllable: false) of edge
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1006bed5 (urgent: false, universal: false, name: Serving), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@47a6e825 (urgent: false, universal: false, name: Idle)]

/* Generating all locations */

   	/* 	Number: 1 
   		Name: Idle */
   		
	class Idle extends ILocation {
		public Idle(University parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d13b5e4 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3d80fbe2 (controllable: false)
										
				
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
   		Name: Serving */
   		
	class Serving extends ILocation {
		public Serving(University parent) {
			super("Serving", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1925fa1a (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@70d109de (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				5;
				
						
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
	
	public MachineRef() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		Serving = new Serving(this);
		Serving.setupEdges();
		
		current = Idle;
	}
}
