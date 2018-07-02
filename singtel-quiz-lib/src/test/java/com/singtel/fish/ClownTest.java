package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class ClownTest {
	private Animal clown;
	
	@Before
	public void setUp() {
		clown = new Animal(Constants.TYPE_CLOWN);
		clown.setProperty(Constants.SWIM, "I am swimming");
		clown.setProperty(Constants.CHARACTERISTIC, "I am small and colorful");
		clown.setProperty(Constants.JOKE, "I am joking");
		
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", clown.getProperty(Constants.SWIM));
	}
	
	@Test
	public void testCharacteristic() {
		assertEquals("I am small and colorful", clown.getProperty(Constants.CHARACTERISTIC));
	}
	
	@Test
	public void testEat() {
		assertEquals("I am joking", clown.getProperty(Constants.JOKE));
	}
}
