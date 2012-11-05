package dk.itu.ecdar.text.generator.environment;

public class QuickLog {

	private static int logLevel = 0;
	
	public static void setLogLevel(int level) {
		logLevel = level;
	}
	
	public static void log(String message) {
		log(message, 0);
	}
	
	public static void log(String message, int level) {
		if (level <= logLevel)
			System.out.println(message);
	}
	
	public static void error(String message) {
		error(message, 0);
	}
	public static void error(String message, int level) {
		if (level <= logLevel)
			System.err.println(message);
	}
	
}
