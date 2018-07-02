package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class RoosterTest {
	private Animal rooster;
	
	@Before
	public void setUp() {
		rooster = AnimalFactory.getAnimal(Constants.AnimalType.ROOSTER);
	}
	
	@Test
	public void testType() {
		assertEquals(Constants.AnimalType.ROOSTER.toString(), rooster.getType());
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", rooster.getProperty(Constants.AnimalAction.WALK.toString()));
	}
	
	@Test
	public void testFly() {
		try {
			rooster.getProperty(Constants.AnimalAction.FLY.toString());
		}
		catch(RuntimeException e) {
			assertEquals("FLY not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		assertEquals("Cock-a-doodle-doo", rooster.getProperty(Constants.AnimalAction.SING.toString()));
	}
}
