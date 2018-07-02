package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class FishTest {
	private Animal fish;
	
	@Before
	public void setUp() {
		fish = AnimalFactory.getAnimal(Constants.AnimalType.FISH);
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", fish.getProperty(Constants.AnimalAction.SWIM.toString()));
	}
	
	@Test
	public void testWalk() {
		try {
			fish.getProperty(Constants.AnimalAction.WALK.toString());
		}
		catch(RuntimeException e) {
			assertEquals("walk not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		try {
			fish.getProperty(Constants.AnimalAction.SING.toString());
		}
		catch(RuntimeException e) {
			assertEquals("sing not supported", e.getMessage());
		}
	}
	
	
}
