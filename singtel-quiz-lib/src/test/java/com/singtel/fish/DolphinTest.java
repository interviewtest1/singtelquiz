package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class DolphinTest {
private Animal dolphin;
	
	@Before
	public void setUp() {
		dolphin = AnimalFactory.getAnimal(Constants.AnimalType.DOLPHIN);
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", dolphin.getProperty(Constants.AnimalAction.SWIM.toString()));
	}
	
	@Test
	public void testWalk() {
		try {
			dolphin.getProperty(Constants.AnimalAction.WALK.toString());
		}
		catch(RuntimeException e) {
			assertEquals("walk not supported", e.getMessage());
		}
	}
	
	@Test
	public void testSing() {
		try {
			dolphin.getProperty(Constants.AnimalAction.SING.toString());
		}
		catch(RuntimeException e) {
			assertEquals("sing not supported", e.getMessage());
		}
	}
	
}
