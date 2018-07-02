package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class ParrotTest {
	private Animal parrot;
	
	@Before
	public void setUp() {
		parrot = new Animal(Constants.TYPE_BIRD);
		parrot.setProperty(Constants.FLY, "I am flying");
		parrot.setProperty(Constants.SING, "Woof, woof");
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", parrot.getProperty(Constants.WALK));
	}
	
	@Test
	public void testFly() {
		assertEquals("I am flying", parrot.getProperty(Constants.FLY));
	}
	
	@Test
	public void testSing() {
		assertEquals("Woof, woof", parrot.getProperty(Constants.SING));
	}
}
