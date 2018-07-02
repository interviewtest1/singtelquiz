package com.singtel.bird;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class DuckTest {
	private Animal duck;
	
	@Before
	public void setUp() {
		duck = AnimalFactory.getAnimal(Constants.AnimalType.DUCK);
	}
	
	@Test
	public void testWalk() {
		assertEquals("I am walking", duck.getProperty(Constants.AnimalAction.WALK.toString()));
	}
	
	@Test
	public void testFly() {
		assertEquals("I am flying", duck.getProperty(Constants.AnimalAction.FLY.toString()));
	}
	
	@Test
	public void testSing() {
		assertEquals("Quack, quack", duck.getProperty(Constants.AnimalAction.SING.toString()));
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", duck.getProperty(Constants.AnimalAction.SWIM.toString()));
	}
}
