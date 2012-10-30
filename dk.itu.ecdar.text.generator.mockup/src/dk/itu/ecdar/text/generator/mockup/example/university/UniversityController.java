package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.framework.IController;
import dk.itu.ecdar.text.generator.framework.ITIOA;

public class UniversityController extends IController {

	public UniversityController() {
		super(new ITIOA[]{new HalfUni1(),
				new HalfUni2(),
				new Machine(),
				new Researcher(),
				new Spec(),
				new Spec1(),
				new University(),
				new University2()});
	}

}
