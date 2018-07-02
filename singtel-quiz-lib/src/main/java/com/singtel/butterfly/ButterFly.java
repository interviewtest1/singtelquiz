package com.singtel.butterfly;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class ButterFly extends Animal {
	private int age, metomorphosisAge;//in months

	public ButterFly() {
		super(Constants.AnimalType.BUTTERFLY);
		setProperty(Constants.AnimalAction.WALK.toString(), "I am crawling");
		setProperty(Constants.AnimalAction.FLY.toString(), "I am flying");
	}
	
	public void walk() {
		if(age < metomorphosisAge)
			getProperty(Constants.AnimalAction.WALK.toString());
		
		throw new RuntimeException(Constants.AnimalAction.WALK + "not supported");
	}
	
	public void fly() {
		if(age >= metomorphosisAge)
			getProperty(Constants.AnimalAction.FLY.toString());
		
		throw new RuntimeException(Constants.AnimalAction.FLY + "not supported");
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setMetomorphosisAge(int metomorphosisAge) {
		this.metomorphosisAge = metomorphosisAge;
	}
}
