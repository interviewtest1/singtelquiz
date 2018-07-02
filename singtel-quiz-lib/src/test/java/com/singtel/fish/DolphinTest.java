package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class DolphinTest {
private Animal dolphin;
	
	@Before
	public void setUp() {
		dolphin = new Animal(Constants.TYPE_DOLPHIN);
		dolphin.setProperty(Constants.SWIM, "I am swimming");
		dolphin.removeProperty(Constants.WALK);
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", dolphin.getProperty(Constants.SWIM));
	}
	
	@Test
	public void testWalk() {
		try {
			dolphin.getProperty(Constants.WALK);
		}
		catch(RuntimeException e) {
			assertEquals("walk not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		try {
			dolphin.getProperty(Constants.SING);
		}
		catch(RuntimeException e) {
			assertEquals("sing not supported", e.getMessage());
		}
	}
	
}
