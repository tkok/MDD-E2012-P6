package dk.itu.ecdar.text.generator.analyzer;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UniversityLogAnalyzer {
	
	class Event {
		public String sender;
		public int time;
		public boolean lookedAt;
		
		public Event(String sender, int time) {
			this.sender = sender;
			this.time = time;
			lookedAt = false;
		}
		
		public String toString() {
			return sender + " at " + time;
		}
	}
	
	class Signal extends Event {
		String signal;
		
		public Signal(String signal, String sender, int time) {
			super(sender, time);
			this.signal = signal;
		}
		
		public String toString() {
			return signal + " from " + super.toString();
		}
	}
	
	ArrayList<Signal> log;
	Signal currentSignal;
	
	@Before
	public void setUp() throws Exception {
		log = new ArrayList<Signal>();
		
		Pattern signalPattern = Pattern.compile("^\\d+,([^,]+),(\\d+),\\d+,Signaling\\s([^,]+)$");
		Scanner logScanner = new Scanner(new File(System.getenv("UNIVERSITY_LOGFILE")));
		
		while (logScanner.hasNext()) {
			String line = logScanner.nextLine();
			
			if (line.matches(".*\\bSignaling\\b.*")) {
				Matcher logMatcher = signalPattern.matcher(line);
				logMatcher.find();
				Signal signal = new Signal(logMatcher.group(3),
						logMatcher.group(1),
						Integer.valueOf(logMatcher.group(2)));
				
				log.add(signal);
			}
		}
		
		logScanner.close();
		
	}

	@After
	public void tearDown() throws Exception {
		log.clear();
		currentSignal = null;
	}

	@Test
	public void checkLog() {
		int current = 0;
		
		while (current < log.size()) {
			currentSignal = log.get(current);
			
			switch(currentSignal.signal) {
			case "grant":
				checkGrantCoin(current);
				break;
			case "coin":
				checkCoinCofTea(current);
				break;
			case "cof":
				checkCofPub(current);
				break;
			case "tea":
				checkTeaPub(current);
				break;
			case "pub":
				if (checkPubPatent(current))
					return;
			default:
			}
			
			current++;
		}
	}
	
	public void checkGrantCoin(int pos) {
		assertTrue("grant -> coin", lookFor("coin", -1, pos));
	}
	
	public void checkCoinCofTea(int pos) {
		assertTrue("coin -> cof || tea", lookFor("cof", -1, pos) || lookFor("tea", -1, pos));
	}
	
	public void checkCofPub(int pos) {
		assertTrue("cof -> pub", lookFor("pub", -1, pos));
	}
	
	public void checkTeaPub(int pos) {
		assertTrue("tea -> pub", lookFor("pub", -1, pos));
	}
	
	public boolean checkPubPatent(int pos) {
		boolean hasPatent = lookFor("patent", -1, pos);
		assertTrue("pub -> patent", hasPatent);
		return hasPatent;
	}
	
	public boolean lookFor(String signal, int time, int pos) {
		for (int i = pos; i < log.size(); i++) {
			Signal future = log.get(i);

			// false if time has been exceeded, check only if time is positive
			if (time >= 0 && future.time - currentSignal.time > time)
				return false;
			
			// true if follow-up signal is found
			if (future.signal.equals(signal))
				return true;
		}
		return false;
	}
}
