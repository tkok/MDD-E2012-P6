package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IEdgeControllable;
import dk.itu.ecdar.text.generator.framework.IEdgeUncontrollable;
import dk.itu.ecdar.text.generator.framework.ILocation;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class Spec1 extends ITIOA {

	// Controllable edges
	class Start_GRANT_Grant extends IEdgeControllable {

		public Start_GRANT_Grant() {
			super(start, grant, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time);
		}

		@Override
		public void onTraverse() {
			resetTime();
			
		}
		
	}
	
	class Grant_GRANT_Grant extends IEdgeControllable {

		public Grant_GRANT_Grant() {
			super(grant, grant, "grant");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
		}

		@Override
		public void onTraverse() {
			
		}
		
	}
		
	// Uncontrollable edges
	class Grant_PATENT_Start extends IEdgeUncontrollable {

		public Grant_PATENT_Start() {
			super(grant, start, "patent");
		}

		@Override
		public boolean checkGuard(long time) {
			return from.checkInvariant(time) && true;
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
			outputEdges = new IEdgeUncontrollable[]{};
			
			inputEdges = new IEdgeControllable[]{
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
			outputEdges = new IEdgeUncontrollable[]{
					new Grant_PATENT_Start()
			};
			
			inputEdges = new IEdgeControllable[]{
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
