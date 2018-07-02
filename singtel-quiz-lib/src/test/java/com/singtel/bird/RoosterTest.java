package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class RoosterTest {
	private Animal chicken;
	
	@Before
	public void setUp() {
		chicken = new Animal(Constants.TYPE_ROOSTER);
		chicken.setProperty(Constants.SING, "Cock-a-doodle-doo");
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", chicken.getProperty(Constants.WALK));
	}
	
	@Test
	public void testFly() {
		try {
			chicken.getProperty(Constants.FLY);
		}
		catch(RuntimeException e) {
			assertEquals("fly not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		assertEquals("Cock-a-doodle-doo", chicken.getProperty(Constants.SING));
	}
}
