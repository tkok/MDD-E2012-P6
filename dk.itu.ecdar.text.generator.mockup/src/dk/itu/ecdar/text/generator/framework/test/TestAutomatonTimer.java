package dk.itu.ecdar.text.generator.framework.test;

import junit.framework.Assert;
import junit.framework.TestCase;
import dk.itu.ecdar.text.generator.framework.AutomatonTimer;

public class TestAutomatonTimer extends TestCase {

	AutomatonTimer timer;
	
	@Override
	protected void setUp() throws Exception {
		timer = new AutomatonTimer();
	}

	public void testReset() {
		for(int i = 0; i < 99999; i++);
		
		long a = timer.getTime();
		timer.reset();
		Assert.assertTrue(a != timer.getTime());
	}	
}
