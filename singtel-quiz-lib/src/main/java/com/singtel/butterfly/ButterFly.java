package com.singtel.butterfly;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class ButterFly extends Animal {
	private int age, metomorphosisAge;//in months

	public ButterFly() {
		super(Constants.TYPE_BUTTERFLY);
		setProperty(Constants.WALK, "I am crawling");
		setProperty(Constants.FLY, "I am flying");
	}
	
	public void walk() {
		if(age < metomorphosisAge)
			getProperty(Constants.WALK);
		
		throw new RuntimeException(Constants.WALK + "not supported");
	}
	
	public void fly() {
		if(age >= metomorphosisAge)
			getProperty(Constants.FLY);
		
		throw new RuntimeException(Constants.FLY + "not supported");
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setMetomorphosisAge(int metomorphosisAge) {
		this.metomorphosisAge = metomorphosisAge;
	}
}
