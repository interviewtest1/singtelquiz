package com.singtel.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.utils.Constants;

public class AnimalTest {
	private Animal animal;
	
	@Before
	public void setUp() {
		animal = new Animal(Constants.TYPE_ANIMAL);
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", animal.getProperty(Constants.WALK));
	}
}
