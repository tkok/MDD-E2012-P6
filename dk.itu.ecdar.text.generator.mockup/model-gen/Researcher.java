

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Researcher extends ITIOA {



/* Generating all edges */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@336f0152 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@67645a8 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4107e577 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@367f8672 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@65196761 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56b8ed99 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@660f2c80 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@51608d63 (controllable: false) of edge
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@49188ce3 (controllable: false) of edge
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




//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@6b4a1c3c (urgent: false, universal: false, name: UNIV), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4711b313 (urgent: false, universal: false, name: T), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4f2948c6 (urgent: false, universal: false, name: C), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2da017b6 (urgent: false, universal: false, name: Idle)]

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
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7139edf6 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5e74207c (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4838bd9d (controllable: false)
										
				
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
   		Name: C */
   		
	class C extends ILocation {
		public C(University parent) {
			super("C", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@660f2c80 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@51608d63 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@49188ce3 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
										
				
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
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@367f8672 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@65196761 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@56b8ed99 (controllable: false)
										
				
			};
			
			inputEdges = new IEdgeControllable[]{
				
				
										
				
										
				
										
				
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
			outputEdges = new IEdgeUncontrollable[]{
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@336f0152 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@67645a8 (controllable: false)
										
				
					
						
						//dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4107e577 (controllable: false)
										
				
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
