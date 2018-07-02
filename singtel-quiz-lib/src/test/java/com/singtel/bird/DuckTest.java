package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class DuckTest {
	private Animal duck;
	
	@Before
	public void setUp() {
		duck = new Animal(Constants.TYPE_DUCK);
		duck.setProperty(Constants.SING, "Quack, quack");
		duck.setProperty(Constants.SWIM, "I am swimming");
		duck.setProperty(Constants.FLY, "I am flying");
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", duck.getProperty(Constants.WALK));
	}
	
	@Test
	public void testFly() {
		assertEquals("I am flying", duck.getProperty(Constants.FLY));
	}
	
	@Test
	public void testSing() {
		assertEquals("Quack, quack", duck.getProperty(Constants.SING));
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", duck.getProperty(Constants.SWIM));
	}
}
