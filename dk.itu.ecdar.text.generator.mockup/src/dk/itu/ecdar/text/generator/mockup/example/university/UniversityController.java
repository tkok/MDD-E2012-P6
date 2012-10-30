package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IController;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class UniversityController extends IController {

	public UniversityController(ITIOA[] automata) {
		super(automata);
	}
	
	public static UniversityController
	system_Machine_Researcher_University_HalfUni1_HalfUni2_Spec() {
		return new UniversityController(new ITIOA[]{new Machine(),
				new Researcher(),
				new University(),
				new HalfUni1(),
				new HalfUni2(),
				new Spec()});
	}
	
	public static UniversityController
	system_Machine_Researcher_HalfUni1_HalfUni2_Spec() {
		return new UniversityController(new ITIOA[]{new Machine(),
				new Researcher(),
				new HalfUni1(),
				new HalfUni2(),
				new Spec()});
	}
	
	public static UniversityController
	system_Machine_Researcher_University2_Spec() {
		return new UniversityController(new ITIOA[]{new Machine(),
				new Researcher(),
				new University2(),
				new Spec()});
	}
	
	public static UniversityController
	system_Machine_Researcher_University_Spec() {
		return new UniversityController(new ITIOA[]{new Machine(),
				new Researcher(),
				new University(),
				new Spec()});
	}
	
	public static UniversityController
	system_Machine_Researcher_University() {
		return new UniversityController(new ITIOA[]{new Machine(),
				new Researcher(),
				new University()});
	}
	
	public static UniversityController
	system_Spec() {
		return new UniversityController(new ITIOA[]{new Spec()});
	}
}
