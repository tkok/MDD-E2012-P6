package dk.itu.ecdar.text.generator.environment;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Scanner;

import dk.itu.ecdar.text.generator.framework.*;

/**
 * Base class for environment implementations.
 * 
 * Use this to test the implemented ECDAR specifications.
 * A text file provided can specify the input the environment
 * receives while executing.
 */
public abstract class IEnvironment {
	
	/**
	 * This thread class executes the controller separately 
	 */
	public class ControllerThread extends Thread{
		IController controller;
		
		public ControllerThread(IController c) {
			super();
			controller = c;
		}
		
		public void run() {
			controller.run();
		}
	}
	
	IController controller;
	AutomatonTimer timer;
    ArrayList<SimpleEntry<Long, String>> inputs;
	
    /**
     * Needs to be implemented for every implemented ECDAR specification.
     */
    public abstract void generateController();
    
	public IEnvironment() {
		generateController();
		timer = new AutomatonTimer();
		inputs = new ArrayList<SimpleEntry<Long, String>>();
	}
    
	/**
	 * Parses a file that specifies a number of timed inputs in the format
	 * 
	 * 1  COF
	 * 9  PUB
	 * 20 TEA
	 * 
	 * where the number of spaces between time and
	 * input can be greater than one. The instructions
	 * will be handled top to bottom. It is therefore
	 * required, that the instructions are ordered after
	 * time. Otherwise, the environment will end up in
	 * a deadlock.
	 * 
	 * @param file Path to the file to parse.
	 */
	public void parse(String file) {
		Scanner scanner = new Scanner(file);

		String[] splitLine;
		while (scanner.hasNext()) {
			splitLine = scanner.next().split("\\s+");

			long time = Long.parseLong(splitLine[0]);
			String input = splitLine[1];
			
			inputs.add(new SimpleEntry<Long, String>(time, input));
		}
		scanner.close();
	}
	
	/**
	 * Executes the environment.
	 */
	public void run() {
		
		ControllerThread thread = new ControllerThread(controller);
		thread.run();
		
		timer.reset();
		
		while(!inputs.isEmpty()) {
			if (inputs.get(0).getKey() == timer.getTime()) {
				controller.notify(inputs.get(0).getValue());
				inputs.remove(0);
			}
		}
		
		try {
			thread.join();
			
			
			/**
			 * Log whatever...
			 */
			
			Log.log("Log something...");
			
			
		} catch (InterruptedException e) {
			System.err.print("Error: " + e.getMessage());
		}
	}
}
