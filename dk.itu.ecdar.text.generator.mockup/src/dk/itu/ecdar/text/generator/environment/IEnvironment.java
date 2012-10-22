package dk.itu.ecdar.text.generator.environment;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Scanner;

import dk.itu.ecdar.text.generator.framework.*;

public abstract class IEnvironment {
	
	public class ControllerThread extends Thread{
		IController controller;
		
		public ControllerThread(IController c) {
			controller = c;
		}
		
		public void run() {
			controller.run();
		}
	}
	
	IController controller;
	AutomatonTimer timer;
    ArrayList<AbstractMap.SimpleEntry<Long, IInput.IInputEnum>> inputs;
	
    public abstract void generateController();
    
	public IEnvironment() {
		generateController();
		timer = new AutomatonTimer();
		inputs = new ArrayList<AbstractMap.SimpleEntry<Long, IInput.IInputEnum>>();
	}
    
	public void parse(String file) {
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNext()) {
			String line = scanner.next();
			String[] timeInput = line.split("\\s+");
			
			Long time = Long.parseLong(timeInput[0]);
			IInput.IInputEnum input = IInput.IInputEnum.valueOf(timeInput[1]);
			
			inputs.add(new SimpleEntry<Long, IInput.IInputEnum>(time, input));
		}
	}
	
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
		} catch (Exception e) {
			System.err.print("Error: " + e.getMessage());
		}
	}
}
