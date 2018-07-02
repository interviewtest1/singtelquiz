package com.singtel.butterfly;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class ButterflyTest {
	private ButterFly butterFly;
	
	@Before
	public void setUp() {
		butterFly = (ButterFly) AnimalFactory.getAnimal(Constants.AnimalType.BUTTERFLY);
	}
	
	@Test
	public void testWalkAndFly() {
		//caterpillar, age 2 months
		butterFly.setAge(2);
		
		assertEquals("I am crawling", butterFly.getProperty(Constants.AnimalAction.WALK.toString()));
		
		try {
			butterFly.getProperty(Constants.AnimalAction.FLY.toString());
		}
		catch(RuntimeException e) {
			assertEquals("fly not supported", e.getMessage());
		}
		
		//butterfly, age 14 months
		butterFly.setAge(14);
		
		try {
			butterFly.getProperty(Constants.AnimalAction.WALK.toString());
		}
		catch(RuntimeException e) {
			assertEquals("walk not supported", e.getMessage());
		}
		
		assertEquals("I am flying", butterFly.getProperty(Constants.AnimalAction.FLY.toString()));
	}
}
