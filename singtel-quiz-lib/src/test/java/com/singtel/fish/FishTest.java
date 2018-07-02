package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class FishTest {
	private Animal fish;
	
	@Before
	public void setUp() {
		fish = new Animal(Constants.TYPE_FISH);
		fish.setProperty(Constants.SWIM, "I am swimming");
		fish.removeProperty(Constants.WALK);
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", fish.getProperty(Constants.SWIM));
	}
	
	@Test
	public void testWalk() {
		try {
			fish.getProperty(Constants.WALK);
		}
		catch(RuntimeException e) {
			assertEquals("walk not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		try {
			fish.getProperty(Constants.SING);
		}
		catch(RuntimeException e) {
			assertEquals("sing not supported", e.getMessage());
		}
	}
	
	
}
