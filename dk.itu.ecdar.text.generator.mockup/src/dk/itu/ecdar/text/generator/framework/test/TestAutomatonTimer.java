package dk.itu.ecdar.text.generator.framework.test;

import dk.itu.ecdar.text.generator.framework.AutomatonTimer;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestAutomatonTimer extends TestCase {

	AutomatonTimer timer;
	
	protected void setUp() throws Exception {
		timer = new AutomatonTimer();
	}

	public void testReset() {
		for(int i = 0; i < 9999; i++);
		
		long a = timer.getTime();
		timer.reset();
		Assert.assertTrue(a != timer.getTime());
	}
	
	public void testPause() {
		long a, b;
		
		timer.pause();
		a = timer.getTime();
		for(int i = 0; i < 9999; i++);
		
		b = timer.getTime();
		Assert.assertEquals(a, b);
		timer.resume();
	}
	
	public void testPauseAndReset() {
		timer.pause();
		for(int i = 0; i < 999; i++);
		
		timer.reset();
		Assert.assertEquals(0, timer.getTime());
		for(int i = 0; i < 9999; i++);
		
		timer.resume();
		Assert.assertTrue(timer.getTime() < 10);
		
	}
	
}
