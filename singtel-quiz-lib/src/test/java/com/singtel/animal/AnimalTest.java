package com.singtel.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class AnimalTest {
	private Animal animal;
	
	@Before
	public void setUp() {
		animal = AnimalFactory.getAnimal(Constants.AnimalType.ANIMAL);
	}
	
	@Test
	public void testType() {
		assertEquals(Constants.AnimalType.ANIMAL.toString(), animal.getType());
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", animal.getProperty(Constants.AnimalAction.WALK.toString()));
	}
}
