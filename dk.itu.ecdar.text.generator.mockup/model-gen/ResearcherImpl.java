

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class ResearcherImpl extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@327cbbd9 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@68360655 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@578d88c3 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6c1b4e69 (controllable: false) of edge
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

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3a929ed6 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 5 extends IEdgeUncontrollable {
   	    	 
		public 5() {
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

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@203c6f3e (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 6 extends IEdgeUncontrollable {
   	    	 
		public 6() {
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

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@fc98c94 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 7 extends IEdgeUncontrollable {
   	    	 
		public 7() {
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

   	/*	Number: 8
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56056a5b (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 8 extends IEdgeUncontrollable {
   	    	 
		public 8() {
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

   	/*	Number: 9
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7618cace (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 9 extends IEdgeUncontrollable {
   	    	 
		public 9() {
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@11f05dde (urgent: false, universal: false, name: lu), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@7468ba71 (urgent: false, universal: false, name: id21), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@9fd589a (urgent: false, universal: false, name: id22), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@12990849 (urgent: false, universal: false, name: Idle)]

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
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d69982c (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@510de23b (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@a3b5cba (controllable: false)
										
				
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
   		Name: id22 */
   		
	class id22 extends ILocation {
		public id22(University parent) {
			super("id22", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@fc98c94 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56056a5b (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7618cace (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
										
				
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

   	/* 	Number: 3 
   		Name: id21 */
   		
	class id21 extends ILocation {
		public id21(University parent) {
			super("id21", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6c1b4e69 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3a929ed6 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@203c6f3e (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				3;
				
						
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

   	/* 	Number: 4 
   		Name: lu */
   		
	class lu extends ILocation {
		public lu(University parent) {
			super("lu", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@327cbbd9 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@68360655 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@578d88c3 (controllable: false)
										
				
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

	
	ILocation lu, id21, id22, Idle;
	
	public ResearcherImpl() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		id22 = new id22(this);
		id22.setupEdges();
		
		id21 = new id21(this);
		id21.setupEdges();
		
		lu = new lu(this);
		lu.setupEdges();
		
		current = Idle;
	}
}
