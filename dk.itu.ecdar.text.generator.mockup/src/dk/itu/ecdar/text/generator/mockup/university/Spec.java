package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec extends ITIOA {

	// Controllable edges
	class Start_GRANT_Grant extends IInputEdge {

		public Start_GRANT_Grant() {
			super(start, grant, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time <= 2;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
		
	}
	
	class Grant_GRANT_Grant extends IInputEdge {

		public Grant_GRANT_Grant() {
			super(grant, grant, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	class Start_GRANT_End extends IInputEdge {

		public Start_GRANT_End() {
			super(start, end, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && time > 2;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	class End_GRANT_End extends IInputEdge {

		public End_GRANT_End() {
			super(end, end, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	// Uncontrollable edges
	class Grant_PATENT_Start extends IOutputEdge {

		public Grant_PATENT_Start() {
			super(grant, start, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
		
	}
	
	class End_PATENT_End extends IOutputEdge {

		public End_PATENT_End() {
			super(end, end, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			return to.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
	
	// Locations
	class Start extends ILocation {

		public Start(Spec parent) {
			super("start", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{};
			
			inputEdges = new IInputEdge[]{
					new Start_GRANT_Grant(),
					new Start_GRANT_End()
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			return true;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
		
	}
	
	class End extends ILocation {

		public End(Spec parent) {
			super("end", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new End_PATENT_End()
			};
			
			inputEdges = new IInputEdge[]{
					new End_GRANT_End()
			};			
		}

		@Override
		public boolean checkInvariant(long time) {
			return true;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
		
	}
	
	class Grant extends ILocation {

		public Grant(Spec parent) {
			super("grant", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{
					new Grant_PATENT_Start()
			};
			
			inputEdges = new IInputEdge[]{
					new Grant_GRANT_Grant()
			};
		}

		@Override
		public boolean checkInvariant(long time) {
			return time <= 20;
		}

		@Override
		public boolean isPreemptive() {
			return false;
		}

		@Override
		public void task() {
			
		}
		
	}
	
	ILocation start, end, grant;
	
	public Spec() {
		super();
		
		start = new Start(this);
		end = new End(this);
		grant = new Grant(this);
		
		start.setupEdges();
		end.setupEdges();
		grant.setupEdges();
		
		current = start;
	}
}
