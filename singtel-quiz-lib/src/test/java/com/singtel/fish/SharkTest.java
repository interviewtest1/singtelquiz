package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class SharkTest {
	private Animal shark;
	
	@Before
	public void setUp() {
		shark = AnimalFactory.getAnimal(Constants.AnimalType.SHARK);
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", shark.getProperty(Constants.AnimalAction.SWIM.toString()));
	}
	
	@Test
	public void testCharacteristic() {
		assertEquals("I am large and grey", shark.getProperty(Constants.CHARACTERISTIC));
	}
	
	@Test
	public void testEat() {
		assertEquals("I eat other fishes", shark.getProperty(Constants.AnimalAction.EAT.toString()));
	}
	
	@Test
	public void testWalk() {
		try {
			shark.getProperty(Constants.AnimalAction.WALK.toString());
		}
		catch(RuntimeException e) {
			assertEquals("walk not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		try {
			shark.getProperty(Constants.AnimalAction.SING.toString());
		}
		catch(RuntimeException e) {
			assertEquals("sing not supported", e.getMessage());
		}
	}
	
}
