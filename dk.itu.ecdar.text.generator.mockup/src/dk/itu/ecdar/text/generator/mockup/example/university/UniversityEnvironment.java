package dk.itu.ecdar.text.generator.mockup.example.university;

import dk.itu.ecdar.text.generator.environment.IEnvironment;
import dk.itu.ecdar.text.generator.environment.QuickLog;

public class UniversityEnvironment extends IEnvironment {

	@Override
	public void generateController() {
		controller = UniversityController.system_Machine_Researcher_University_Spec();
	}

	public static void main(String[] args) {
		QuickLog.setLogLevel(20);
		QuickLog.logToFile();
		
		IEnvironment universityEnvironment = new UniversityEnvironment();
		universityEnvironment.parse(args[0]);
		universityEnvironment.run();
		
		QuickLog.writeToFile("university");
		System.exit(0);
	}

}
