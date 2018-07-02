package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class ClownTest {
	private Animal clown;
	
	@Before
	public void setUp() {
		clown = AnimalFactory.getAnimal(Constants.AnimalType.CLOWN);
	}
	
	@Test
	public void testType() {
		assertEquals(Constants.AnimalType.CLOWN.toString(), clown.getType());
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", clown.getProperty(Constants.AnimalAction.SWIM.toString()));
	}
	
	@Test
	public void testCharacteristic() {
		assertEquals("I am small and colorful", clown.getProperty(Constants.CHARACTERISTIC));
	}
	
	@Test
	public void testEat() {
		assertEquals("I am joking", clown.getProperty(Constants.AnimalAction.JOKE.toString()));
	}
	
	@Test
	public void testWalk() {
		try {
			clown.getProperty(Constants.AnimalAction.WALK.toString());
		}
		catch(RuntimeException e) {
			assertEquals("WALK not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		try {
			clown.getProperty(Constants.AnimalAction.SING.toString());
		}
		catch(RuntimeException e) {
			assertEquals("SING not supported", e.getMessage());
		}
	}
	
}
