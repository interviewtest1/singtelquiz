package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class DolphinTest {
private Animal fish;
	
	@Before
	public void setUp() {
		fish = new Animal(Constants.TYPE_DOLPHIN);
		fish.setProperty(Constants.SWIM, "I am swimming");
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", fish.getProperty(Constants.SWIM));
	}
}
