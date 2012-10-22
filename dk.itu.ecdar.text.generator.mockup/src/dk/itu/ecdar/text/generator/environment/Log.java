package dk.itu.ecdar.text.generator.environment;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Log {

    // Singleton
	
    private Log(){   }

    public enum LogWhat{ALL, IMPORTANT, NONE};
    public enum Output{CONSOLE, FILE};

    private LogWhat logwhat;
    private Output output;

    private static Log _instance = null;
    
    public static synchronized Log getInstance() {
	if (_instance == null) {
                _instance = new Log();
                _instance.output = Output.FILE;
                _instance.logwhat = LogWhat.ALL;
	}
	return _instance;
    }
    
    // Log message to a file
    
    public static void log(String s) {
	try {
	    
            // Create file if it does not exist and make sure to not overwrite data

	    FileWriter fileWriter = new FileWriter("Log.txt", true);
	    BufferedWriter outBuffer = new BufferedWriter(fileWriter);
	    
            
	    String newLine = System.getProperty("line.separator");
	    outBuffer.write(s+newLine);
	    
            
	    outBuffer.close();
            
	} catch (Exception e) {
	}
    }

    public void log(String s, LogWhat level, Output output) {
	if (this.logwhat != LogWhat.NONE && level != null) {
	    if (this.logwhat == LogWhat.ALL) {
		
	    }else if (level == LogWhat.IMPORTANT ) {
		
	    }else{
		
		return;
	    }
		
	}
	if (output == Output.CONSOLE || this.output == Output.CONSOLE) {
		    logToConsole(s);
		} else {
		    logToFile(s);
		}
    }

    public void setLogWhat(LogWhat level){
	this.logwhat = level;
    }

    public void setOutput(Output output) {
	this.output = output;
    }

    private void logToFile(String s) {
	try {
            
            // Create file if it does not exist and make sure to not overwrite data
            
	    FileWriter fileWriter = new FileWriter("Log.txt", true);
	    BufferedWriter outBuffer = new BufferedWriter(fileWriter);
	    
	    String newLine = System.getProperty("line.separator");
	    outBuffer.write(s+newLine);
	    
	    outBuffer.close();
	} catch (Exception e) {
	}
    }

    private void logToConsole(String s){
	System.out.println(s);
    }

}