package dk.itu.ecdar.text.generator.mockup.university;

import dk.itu.ecdar.text.generator.environment.IEnvironment;
import dk.itu.ecdar.text.generator.environment.QuickLog;
import dk.itu.ecdar.text.generator.framework.AutomatonTimer;

public class UniversityEnvironment extends IEnvironment {

	@Override
	public void generateController() {
		controller = UniversityController.system_Machine_Researcher_University2_Spec();
	}

	public static void main(String[] args) {
		
		// Set timer resolution for this test to 10 milliseconds
		AutomatonTimer.setResolution(10);
		
		QuickLog.setLogLevel(20);
		QuickLog.logToFile();
		
		IEnvironment universityEnvironment = new UniversityEnvironment();
		universityEnvironment.parse(args[0]);
		universityEnvironment.run();
		
		QuickLog.writeToFile("university");
		System.exit(0);
	}

}
