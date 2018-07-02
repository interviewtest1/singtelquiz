package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class RoosterTest {
	private Animal rooster;
	
	@Before
	public void setUp() {
		rooster = new Animal(Constants.TYPE_ROOSTER);
		rooster.setProperty(Constants.SING, "Cock-a-doodle-doo");
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", rooster.getProperty(Constants.WALK));
	}
	
	@Test
	public void testFly() {
		try {
			rooster.getProperty(Constants.FLY);
		}
		catch(RuntimeException e) {
			assertEquals("fly not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		assertEquals("Cock-a-doodle-doo", rooster.getProperty(Constants.SING));
	}
}
