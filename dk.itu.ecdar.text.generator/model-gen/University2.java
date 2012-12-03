

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University2 extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@19e0b0ed (urgent: false, universal: false, name: id2), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@6897f7ca (urgent: true, universal: false, name: Inconsistent), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@35d2165f (urgent: false, universal: false, name: id4), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2a8b5b48 (urgent: false, universal: false, name: Universal), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@69f5b714 (urgent: false, universal: false, name: id6), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@665570e2 (urgent: false, universal: false, name: id7)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21b9ae75 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: id2
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id2, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6ba2507 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: id2
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id2, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@61c059ea (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: id7
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id7, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2388c8b6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: id4
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id4, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5abffe59 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: id4
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id4, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@61d39d3d (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge6 extends IOutputEdge {
   	    	 
		public Edge6() {
			//Target: id6
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id6, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73a7dec4 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge7 extends IOutputEdge {
   	    	 
		public Edge7() {
			//Target: Universal
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Universal, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@68776165 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge8 extends IInputEdge {
   	    	 
		public Edge8() {
			//Target: Universal
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Universal, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@10c3db68 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge9 extends IInputEdge {
   	    	 
		public Edge9() {
			//Target: Universal
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Universal, "SIGNAL");
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

   	/*	Number: 10
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3171ce5d (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge10 extends IOutputEdge {
   	    	 
		public Edge10() {
			//Target: Universal
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Universal, "SIGNAL");
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

   	/*	Number: 11
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4473f04f (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge11 extends IInputEdge {
   	    	 
		public Edge11() {
			//Target: id6
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id6, "SIGNAL");
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

   	/*	Number: 12
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7edf564 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge12 extends IInputEdge {
   	    	 
		public Edge12() {
			//Target: id2
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id2, "SIGNAL");
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

   	/*	Number: 13
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3c646cd6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge13 extends IInputEdge {
   	    	 
		public Edge13() {
			//Target: id2
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id2, "SIGNAL");
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

   	/*	Number: 14
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@356076ed (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge14 extends IInputEdge {
   	    	 
		public Edge14() {
			//Target: id4
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id4, "SIGNAL");
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
   		Name: id7
   		Name: ecdarText::ETLocation */
   		
	class Id7 extends ILocation {
		public Id7(University2 parent) {
			super("Id7", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3c646cd6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3c646cd6 (controllable: false)
								new Edge13(),
							
							
										
				
						
							
							
							
							
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@356076ed (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@356076ed (controllable: false)
								new Edge14()
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.University2Id7();
		}	
	}

   	/* 	Number: 2 
   		Name: id6
   		Name: ecdarText::ETLocation */
   		
	class Id6 extends ILocation {
		public Id6(University2 parent) {
			super("Id6", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4473f04f (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4473f04f (controllable: false)
								new Edge11(),
							
							
							
							
										
				
						
							
							
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7edf564 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7edf564 (controllable: false)
								new Edge12()
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.University2Id6();
		}	
	}

   	/* 	Number: 3 
   		Name: Universal
   		Name: ecdarText::ETLocation */
   		
	class Universal extends ILocation {
		public Universal(University2 parent) {
			super("Universal", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73a7dec4 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@73a7dec4 (controllable: false)
								new Edge7(),
							
							
							
							
							
							
							
							
											
				
						
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3171ce5d (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3171ce5d (controllable: false)
								new Edge10()
							
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@68776165 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@68776165 (controllable: false)
								new Edge8(),
							
							
							
							
							
							
							
										
				
						
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@10c3db68 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@10c3db68 (controllable: false)
								new Edge9()
							
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.University2Universal();
		}	
	}

   	/* 	Number: 4 
   		Name: id4
   		Name: ecdarText::ETLocation */
   		
	class Id4 extends ILocation {
		public Id4(University2 parent) {
			super("Id4", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@61d39d3d (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@61d39d3d (controllable: false)
								new Edge6()
							
							
							
							
							
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2388c8b6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2388c8b6 (controllable: false)
								new Edge4(),
							
							
							
							
							
							
							
							
							
							
							
										
				
						
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5abffe59 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5abffe59 (controllable: false)
								new Edge5()
							
							
							
							
							
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=2;
					
				
				
						
		}

		@Override
		public void task() {
			Controller.University2Id4();
		}	
	}

   	/* 	Number: 5 
   		Name: Inconsistent
   		Name: ecdarText::ETLocation */
   		
	class Inconsistent extends ILocation {
		public Inconsistent(University2 parent) {
			super("Inconsistent", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
				
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
		public void task() {
			Controller.University2Inconsistent();
		}	
	}

   	/* 	Number: 6 
   		Name: id2
   		Name: ecdarText::ETLocation */
   		
	class Id2 extends ILocation {
		public Id2(University2 parent) {
			super("Id2", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@61c059ea (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@61c059ea (controllable: false)
								new Edge3()
							
							
							
							
							
							
							
							
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21b9ae75 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@21b9ae75 (controllable: false)
								new Edge1(),
							
							
							
							
							
							
							
							
							
							
							
							
							
							
										
				
						
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6ba2507 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6ba2507 (controllable: false)
								new Edge2()
							
							
							
							
							
							
							
							
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=2;
					
				
				
						
		}

		@Override
		public void task() {
			Controller.University2Id2();
		}	
	}

	
	ILocation id2, Inconsistent, id4, Universal, id6, id7;
	
	public University2() {
		super();
		
		id7 = new id7(this);
		id7.setupEdges();
		
		id6 = new id6(this);
		id6.setupEdges();
		
		Universal = new Universal(this);
		Universal.setupEdges();
		
		id4 = new id4(this);
		id4.setupEdges();
		
		Inconsistent = new Inconsistent(this);
		Inconsistent.setupEdges();
		
		id2 = new id2(this);
		id2.setupEdges();
		
		current = id7;
	}
}
