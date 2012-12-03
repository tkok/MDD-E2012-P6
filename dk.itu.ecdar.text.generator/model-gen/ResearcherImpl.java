

package dk.itu.ecdar.text.generator.mockup;
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class ResearcherImpl extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@118a1a78 (urgent: false, universal: false, name: lu), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2ec0ee07 (urgent: false, universal: false, name: id21), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@1e3020fd (urgent: false, universal: false, name: id22), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4e94e021 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6fa0b93e (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge1 extends IOutputEdge {
   	    	 
		public Edge1() {
			//Target: lu
			//Will be rewritten to match super(TargetEdge, Signal)
			super(lu, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1b5d6703 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: lu
			//Will be rewritten to match super(TargetEdge, Signal)
			super(lu, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4b34a74a (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge3 extends IInputEdge {
   	    	 
		public Edge3() {
			//Target: lu
			//Will be rewritten to match super(TargetEdge, Signal)
			super(lu, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2c5f87e4 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: id21
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id21, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11cab2af (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: id21
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id21, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d69982c (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge6 extends IOutputEdge {
   	    	 
		public Edge6() {
			//Target: Idle
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Idle, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=3;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 7
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5087e6b4 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge7 extends IInputEdge {
   	    	 
		public Edge7() {
			//Target: id22
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id22, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@39b8faa6 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge8 extends IInputEdge {
   	    	 
		public Edge8() {
			//Target: id22
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id22, "SIGNAL");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e7b8f1b (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge9 extends IOutputEdge {
   	    	 
		public Edge9() {
			//Target: Idle
			//Will be rewritten to match super(TargetEdge, Signal)
			super(Idle, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >=6;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 10
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2ada9a2b (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge10 extends IInputEdge {
   	    	 
		public Edge10() {
			//Target: lu
			//Will be rewritten to match super(TargetEdge, Signal)
			super(lu, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >16;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 11
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7c752ccf (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge11 extends IInputEdge {
   	    	 
		public Edge11() {
			//Target: id22
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id22, "SIGNAL");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time <=16;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			resetTime();
		}
	} 

   	/*	Number: 12
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7cece9af (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge12 extends IInputEdge {
   	    	 
		public Edge12() {
			//Target: id21
			//Will be rewritten to match super(TargetEdge, Signal)
			super(id21, "SIGNAL");
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
   		Name: Idle
   		Name: ecdarText::ETLocation */
   		
	class Idle extends ILocation {
		public Idle(ResearcherImpl parent) {
			super("Idle", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2ada9a2b (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2ada9a2b (controllable: false)
								new Edge10(),
							
							
							
										
				
						
							
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7c752ccf (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7c752ccf (controllable: false)
								new Edge11(),
							
							
										
				
						
							
							
							
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7cece9af (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7cece9af (controllable: false)
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
			Controller.ResearcherImplIdle();
		}	
	}

   	/* 	Number: 2 
   		Name: id22
   		Name: ecdarText::ETLocation */
   		
	class Id22 extends ILocation {
		public Id22(ResearcherImpl parent) {
			super("Id22", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e7b8f1b (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4e7b8f1b (controllable: false)
								new Edge9()
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5087e6b4 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5087e6b4 (controllable: false)
								new Edge7(),
							
							
							
							
							
							
										
				
						
							
							
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@39b8faa6 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@39b8faa6 (controllable: false)
								new Edge8()
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=6;
					
				
				
						
		}

		@Override
		public void task() {
			Controller.ResearcherImplId22();
		}	
	}

   	/* 	Number: 3 
   		Name: id21
   		Name: ecdarText::ETLocation */
   		
	class Id21 extends ILocation {
		public Id21(ResearcherImpl parent) {
			super("Id21", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d69982c (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2d69982c (controllable: false)
								new Edge6()
							
							
							
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2c5f87e4 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2c5f87e4 (controllable: false)
								new Edge4(),
							
							
							
							
							
							
							
							
							
										
				
						
							
							
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11cab2af (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@11cab2af (controllable: false)
								new Edge5()
							
							
							
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS NOT EMPTY
				
				
					return time<=3;
					
				
				
						
		}

		@Override
		public void task() {
			Controller.ResearcherImplId21();
		}	
	}

   	/* 	Number: 4 
   		Name: lu
   		Name: ecdarText::ETLocation */
   		
	class Lu extends ILocation {
		public Lu(ResearcherImpl parent) {
			super("Lu", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
				
						
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6fa0b93e (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6fa0b93e (controllable: false)
								new Edge1()
							
							
							
							
							
							
							
							
							
							
							
							
											
				
				
			};
			
			inputEdges = new IInputEdge[]{
				
				
						
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1b5d6703 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1b5d6703 (controllable: false)
								new Edge2(),
							
							
							
							
							
							
							
							
							
							
							
										
				
						
							
							
							
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4b34a74a (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@4b34a74a (controllable: false)
								new Edge3()
							
							
							
							
							
							
							
							
							
							
										
				
				
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			
			//IS EMPTY
			return true;
						
		}

		@Override
		public void task() {
			Controller.ResearcherImplLu();
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
