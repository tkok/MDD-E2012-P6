
import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class ResearcherImpl extends ITIOA {



//[dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@25c08997 (urgent: false, universal: false, name: lu), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@477b86d (urgent: false, universal: false, name: id21), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@4fa20baa (urgent: false, universal: false, name: id22), dk.itu.ecdar.text.ecdarText.impl.ETLocationImpl@2b031ae9 (urgent: false, universal: false, name: Idle)]

/* Generating all edges - NOTE: Edges with IO type "!" is OutputEdge, "?" is InputEdge	 */

   	/*	Number: 1
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@229efda2 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge1 extends IOutputEdge {
   	    	 
		public Edge1() {
			//Target: lu
				super(lu, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5424c29a (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge2 extends IInputEdge {
   	    	 
		public Edge2() {
			//Target: lu
				super(lu, "cof");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2192bcac (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge3 extends IInputEdge {
   	    	 
		public Edge3() {
			//Target: lu
				super(lu, "tea");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1cdfe890 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge4 extends IInputEdge {
   	    	 
		public Edge4() {
			//Target: id21
				super(id21, "cof");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3ece3f98 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge5 extends IInputEdge {
   	    	 
		public Edge5() {
			//Target: id21
				super(id21, "tea");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@74aad738 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge6 extends IOutputEdge {
   	    	 
		public Edge6() {
			//Target: Idle
				super(Idle, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@549776b9 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge7 extends IInputEdge {
   	    	 
		public Edge7() {
			//Target: id22
				super(id22, "tea");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7651eaa2 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge8 extends IInputEdge {
   	    	 
		public Edge8() {
			//Target: id22
				super(id22, "cof");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2849f430 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: !	*/ 
 		
   	
   	class Edge9 extends IOutputEdge {
   	    	 
		public Edge9() {
			//Target: Idle
				super(Idle, "pub");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@46737fb5 (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge10 extends IInputEdge {
   	    	 
		public Edge10() {
			//Target: lu
				super(lu, "tea");
		}

		@Override
		public boolean checkGuard(long time) {
			
			
			
					return to.checkInvariant(time) && time >16;
					
			
			
			
		}

		@Override
		public void onTraverse() {
			
		}
	} 

   	/*	Number: 11
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3ea6f12c (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge11 extends IInputEdge {
   	    	 
		public Edge11() {
			//Target: id22
				super(id22, "tea");
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
 		Name: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6b4b649d (controllable: false) of edge
 		Controllable: false
 		Edge IO Type: ?	*/ 
 		
   	
   	class Edge12 extends IInputEdge {
   	    	 
		public Edge12() {
			//Target: id21
				super(id21, "cof");
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
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@46737fb5 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@46737fb5 (controllable: false)
								new Edge10(),																																																	
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3ea6f12c (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3ea6f12c (controllable: false)
								new Edge11(),																																				
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6b4b649d (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@6b4b649d (controllable: false)
								new Edge12()																								};
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2849f430 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2849f430 (controllable: false)
								new Edge9()																																																																			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@549776b9 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@549776b9 (controllable: false)
								new Edge7(),																																																																																								
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7651eaa2 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@7651eaa2 (controllable: false)
								new Edge8()																																																																												};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=6;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@74aad738 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@74aad738 (controllable: false)
								new Edge6()																																																																																																													};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1cdfe890 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@1cdfe890 (controllable: false)
								new Edge4(),																																																																																																																															
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3ece3f98 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@3ece3f98 (controllable: false)
								new Edge5()																																																																																																																			};
		}

		@Override
		public boolean checkInvariant(long time) {
			//IS NOT EMPTY
					return time<=3;
					
		}
		
		@Override
		public boolean isPreemptive() {
			return false;
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
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@229efda2 (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@229efda2 (controllable: false)
								new Edge1()																																																																																																																																																																																			};
			
			inputEdges = new IInputEdge[]{
				
						
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5424c29a (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@5424c29a (controllable: false)
								new Edge2(),																																																																																																																																																									
								//Matching: dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2192bcac (controllable: false) = dk.itu.ecdar.text.ecdarText.impl.ETEdgeImpl@2192bcac (controllable: false)
								new Edge3()																																																																																																																																													};
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
			Controller.ResearcherImplLu();
		}	
	}

	
	ILocation lu, id21, id22, Idle;
	
	public ResearcherImpl() {
		super();
		Idle = new Idle(this);
		id22 = new Id22(this);
		id21 = new Id21(this);
		lu = new Lu(this);
		
		current = Idle;
		
		Idle.setupEdges();
		id22.setupEdges();
		id21.setupEdges();
		lu.setupEdges();
	}
}
