package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class BirdTest {
	private Animal bird;
	
	@Before
	public void setUp() {
		bird = new Animal(Constants.TYPE_BIRD);
		bird.setProperty(Constants.FLY, "I am flying");
		bird.setProperty(Constants.SING, "I am singing");
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", bird.getProperty(Constants.WALK));
	}
	
	@Test
	public void testFly() {
		assertEquals("I am flying", bird.getProperty(Constants.FLY));
	}
	
	@Test
	public void testSing() {
		assertEquals("I am singing", bird.getProperty(Constants.SING));
	}
}
