package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.environment.IEnvironment;

public class UniversityEnvironment extends IEnvironment {

	@Override
	public void generateController() {
		controller = new UniversityController();
	}

	public static void main(String[] args) {
		IEnvironment universityEnvironment = new UniversityEnvironment();
		universityEnvironment.parse(args[0]);
		universityEnvironment.run();
	}

}
