package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.framework.IInputEdge;
import dk.itu.ecdar.text.generator.framework.IOutputEdge;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec1 extends ITIOA {

	// Controllable edges
	class Start_GRANT_Grant extends IInputEdge {

		public Start_GRANT_Grant() {
			super(grant, "grant");
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
	
	class Grant_GRANT_Grant extends IInputEdge {

		public Grant_GRANT_Grant() {
			super(grant, "grant");
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
			super(start, "patent");
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
		
	// Locations
	class Start extends ILocation {

		public Start(Spec1 parent) {
			super("start", parent);
		}

		@Override
		public void setupEdges() {
			outputEdges = new IOutputEdge[]{};
			
			inputEdges = new IInputEdge[]{
					new Start_GRANT_Grant()
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

		public Grant(Spec1 parent) {
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
	
	ILocation start, grant;
	
	public Spec1() {
		super();
		
		start = new Start(this);
		grant = new Grant(this);
		
		start.setupEdges();
		grant.setupEdges();
		
		current = start;
	}
}
