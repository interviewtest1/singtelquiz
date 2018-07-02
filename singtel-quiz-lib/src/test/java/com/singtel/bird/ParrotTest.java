package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class ParrotTest {
	private Animal parrot;
	
	@Before
	public void setUp() {
		parrot = AnimalFactory.getAnimal(Constants.AnimalType.PARROT);
	}
	
	@Test
	public void testType() {
		assertEquals(Constants.AnimalType.PARROT.toString(), parrot.getType());
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", parrot.getProperty(Constants.AnimalAction.WALK.toString()));
	}
	
	@Test
	public void testFly() {
		assertEquals("I am flying", parrot.getProperty(Constants.AnimalAction.FLY.toString()));
	}
	
	@Test
	public void testSing() {
		assertEquals("Woof, woof", parrot.getProperty(Constants.AnimalAction.SING.toString()));
	}
}
