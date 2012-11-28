

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4ce77577 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 1 extends IOutputEdge {
   	    	 
		public 1() {
			//super(A, B, "grant");

			// Edge properties

			
			UNIV
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@54b78bc (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 2 extends IOutputEdge {
   	    	 
		public 2() {
			//super(A, B, "grant");

			// Edge properties

			
			UNIV
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@47bdaf6 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 3 extends IOutputEdge {
   	    	 
		public 3() {
			//super(A, B, "grant");

			// Edge properties

			
			UNIV
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52af2320 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 4 extends IOutputEdge {
   	    	 
		public 4() {
			//super(A, B, "grant");

			// Edge properties

			
			T
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1c684684 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 5 extends IOutputEdge {
   	    	 
		public 5() {
			//super(A, B, "grant");

			// Edge properties

			
			T
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21976e38 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 6 extends IOutputEdge {
   	    	 
		public 6() {
			//super(A, B, "grant");

			// Edge properties

			
			[dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl@26052d28 (value: 0), dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl@4f949dd1]
			
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

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@13c2825b (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 7 extends IOutputEdge {
   	    	 
		public 7() {
			//super(A, B, "grant");

			// Edge properties

			
			C
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4d70dfac (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 8 extends IOutputEdge {
   	    	 
		public 8() {
			//super(A, B, "grant");

			// Edge properties

			
			C
			
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@196cf080 (controllable: false) of edge
 		Controllable: false 	*/
 		
   	
   	class 9 extends IOutputEdge {
   	    	 
		public 9() {
			//super(A, B, "grant");

			// Edge properties

			
			[dk.itu.ecdar.text.ecdarText.impl.ETNumberLiteralImpl@424dcf78 (value: 0), dk.itu.ecdar.text.ecdarText.impl.ETReferenceImpl@150421e7]
			
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@18f4f1da (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4d5735df (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1dd7b098 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@22f3f10b (urgent: false, universal: false, name: Idle)]

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
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@600d676b (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2a13fd05 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@250382ca (controllable: false)
										
				
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
   		Name: C */
   		
	class C extends ILocation {
		public C(University parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@13c2825b (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4d70dfac (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@196cf080 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				4;
				
						
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
   		Name: T */
   		
	class T extends ILocation {
		public T(University parent) {
			super("T", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@52af2320 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1c684684 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21976e38 (controllable: false)
										
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
										
				
										
				
										
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				return time
				
				<=
				
				8;
				
						
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
   		Name: UNIV */
   		
	class UNIV extends ILocation {
		public UNIV(University parent) {
			super("UNIV", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4ce77577 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@54b78bc (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@47bdaf6 (controllable: false)
										
				
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

	
	ILocation UNIV, T, C, Idle;
	
	public Researcher() {
		super();
		
		Idle = new Idle(this);
		Idle.setupEdges();
		
		C = new C(this);
		C.setupEdges();
		
		T = new T(this);
		T.setupEdges();
		
		UNIV = new UNIV(this);
		UNIV.setupEdges();
		
		current = Idle;
	}
}
