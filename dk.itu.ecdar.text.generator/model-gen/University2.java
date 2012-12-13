
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class University2 extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@55e63761 (urgent: false, universal: false, name: id2), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2a811e2b (urgent: true, universal: false, name: Inconsistent), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@31ec6bb1 (urgent: false, universal: false, name: id4), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@73d55dd (urgent: false, universal: false, name: Universal), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@a15eef9 (urgent: false, universal: false, name: id6), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@3d3d67a1 (urgent: false, universal: false, name: id7)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3bd320f5 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge1 extends IInputEdge {
   	    	 
		public Edge1() {
			//Target: id2
				super(id2, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 2
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2c72bd07 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: id2
				super(id2, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 3
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@25d9c4c4 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge3 extends IOutputEdge {
   	    	 
		public Edge3() {
			//Target: id7
				super(id7, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 4
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1684342c (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: id4
				super(id4, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 5
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@45953fd7 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: id4
				super(id4, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 6
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@39ac5a78 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge6 extends IOutputEdge {
   	    	 
		public Edge6() {
			//Target: id6
				super(id6, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4de3afa9 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge7 extends IOutputEdge {
   	    	 
		public Edge7() {
			//Target: Universal
				super(Universal, "coin");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 8
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2caefab3 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge8 extends IInputEdge {
   	    	 
		public Edge8() {
			//Target: Universal
				super(Universal, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 9
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@687b2042 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge9 extends IInputEdge {
   	    	 
		public Edge9() {
			//Target: Universal
				super(Universal, "pub");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 10
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@682af542 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge10 extends IOutputEdge {
   	    	 
		public Edge10() {
			//Target: Universal
				super(Universal, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 11
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4c440198 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge11 extends IInputEdge {
   	    	 
		public Edge11() {
			//Target: id6
				super(id6, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			
			return to.checkInvariant(time);
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 12
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@33ffeb41 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge12 extends IInputEdge {
   	    	 
		public Edge12() {
			//Target: id2
				super(id2, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@48ed3461 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge13 extends IInputEdge {
   	    	 
		public Edge13() {
			//Target: id2
				super(id2, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5e295101 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge14 extends IInputEdge {
   	    	 
		public Edge14() {
			//Target: id4
				super(id4, "grant");
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
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@48ed3461 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@48ed3461 (controllable: false)
								new Edge13(),																																				
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5e295101 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5e295101 (controllable: false)
								new Edge14()																								};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4c440198 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4c440198 (controllable: false)
								new Edge11(),																																																														
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@33ffeb41 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@33ffeb41 (controllable: false)
								new Edge12()																																																		};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4de3afa9 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4de3afa9 (controllable: false)
								new Edge7(),																																																																																																																										
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@682af542 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@682af542 (controllable: false)
								new Edge10()																																																																																	};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2caefab3 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2caefab3 (controllable: false)
								new Edge8(),																																																																																																					
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@687b2042 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@687b2042 (controllable: false)
								new Edge9()																																																																																									};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@39ac5a78 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@39ac5a78 (controllable: false)
								new Edge6()																																																																																																																																									};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1684342c (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1684342c (controllable: false)
								new Edge4(),																																																																																																																																																									
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@45953fd7 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@45953fd7 (controllable: false)
								new Edge5()																																																																																																																																													};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=2;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@25d9c4c4 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@25d9c4c4 (controllable: false)
								new Edge3()																																																																																																																																																																																			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3bd320f5 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3bd320f5 (controllable: false)
								new Edge1(),																																																																																																																																																																																																
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2c72bd07 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2c72bd07 (controllable: false)
								new Edge2()																																																																																																																																																																																				};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=2;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			Controller.University2Id2();
		}	
	}

	
	ILocation id2, Inconsistent, id4, Universal, id6, id7;
	
	public University2() {
		super();
		id7 = new Id7(this);
		id6 = new Id6(this);
		Universal = new Universal(this);
		id4 = new Id4(this);
		Inconsistent = new Inconsistent(this);
		id2 = new Id2(this);
		
		current = id7;
		
		id7.setupEdges();
		id6.setupEdges();
		Universal.setupEdges();
		id4.setupEdges();
		Inconsistent.setupEdges();
		id2.setupEdges();
	}
}
