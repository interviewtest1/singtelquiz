package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class ChickenTest {
	private Animal chicken;
	
	@Before
	public void setUp() {
		chicken = new Animal(Constants.TYPE_CHICKEN);
		chicken.setProperty(Constants.SING, "Cluck, cluck");
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
		assertEquals("Cluck, cluck", chicken.getProperty(Constants.SING));
	}
}
