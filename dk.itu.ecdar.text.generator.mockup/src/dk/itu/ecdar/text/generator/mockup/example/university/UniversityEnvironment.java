package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.environment.IEnvironment;

public class UniversityEnvironment extends IEnvironment {

	@Override
	public void generateController() {
		controller = UniversityController.system_Machine_Researcher_University_HalfUni1_HalfUni2_Spec();
	}

	public static void main(String[] args) {
		IEnvironment universityEnvironment = new UniversityEnvironment();
		universityEnvironment.parse(args[0]);
		universityEnvironment.run();
		
		while(true) {
			// keeps the program alive
		}
	}

}
