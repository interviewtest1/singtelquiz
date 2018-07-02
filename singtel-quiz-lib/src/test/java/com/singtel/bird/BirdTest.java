package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class BirdTest {
	private Animal bird;
	
	@Before
	public void setUp() {
		bird = AnimalFactory.getAnimal(Constants.AnimalType.BIRD);
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", bird.getProperty(Constants.AnimalAction.WALK.toString()));
	}
	
	@Test
	public void testFly() {
		assertEquals("I am flying", bird.getProperty(Constants.AnimalAction.FLY.toString()));
	}
	
	@Test
	public void testSing() {
		assertEquals("I am singing", bird.getProperty(Constants.AnimalAction.SING.toString()));
	}
}
