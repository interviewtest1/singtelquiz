package com.singtel.fish;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class SharkTest {
	private Animal shark;
	
	@Before
	public void setUp() {
		shark = new Animal(Constants.TYPE_SHARK);
		shark.setProperty(Constants.SWIM, "I am swimming");
		shark.setProperty(Constants.CHARACTERISTIC, "I am large and grey");
		shark.setProperty(Constants.EAT, "I eat other fishes");
		
	}
	
	@Test
	public void testSwim() {
		assertEquals("I am swimming", shark.getProperty(Constants.SWIM));
	}
	
	@Test
	public void testCharacteristic() {
		assertEquals("I am large and grey", shark.getProperty(Constants.CHARACTERISTIC));
	}
	
	@Test
	public void testEat() {
		assertEquals("I eat other fishes", shark.getProperty(Constants.EAT));
	}
	
	
}
