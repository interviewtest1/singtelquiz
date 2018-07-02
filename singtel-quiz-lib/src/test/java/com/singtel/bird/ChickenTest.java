package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class ChickenTest {
	private Animal chicken;
	
	@Before
	public void setUp() {
		chicken = AnimalFactory.getAnimal(Constants.AnimalType.CHICKEN);
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", chicken.getProperty(Constants.AnimalAction.WALK.toString()));
	}
	
	@Test
	public void testFly() {
		try {
			chicken.getProperty(Constants.AnimalAction.FLY.toString());
		}
		catch(RuntimeException e) {
			assertEquals("fly not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		assertEquals("Cluck, cluck", chicken.getProperty(Constants.AnimalAction.SING.toString()));
	}
}
