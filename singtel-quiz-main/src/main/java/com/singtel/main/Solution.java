package com.singtel.main;

import com.singtel.animal.Animal;
import com.singtel.butterfly.ButterFly;
import com.singtel.utils.Constants;

public class Solution {
	
	public void countAnimals() {
		//These things should ideally comes from a xml and spring framework
		Animal bird = new Animal(Constants.TYPE_BIRD);
		bird.setProperty(Constants.FLY, "I am flying");
		bird.setProperty(Constants.SING, "I am singing");
		
		Animal duck = new Animal(Constants.TYPE_DUCK);
		duck.setProperty(Constants.SING, "Quack, quack");
		duck.setProperty(Constants.SWIM, "I am swimming");
		duck.setProperty(Constants.FLY, "I am flying");
		
		Animal chicken = new Animal(Constants.TYPE_CHICKEN);
		chicken.setProperty(Constants.SING, "Cluck, cluck");
		
		Animal rooster = new Animal(Constants.TYPE_ROOSTER);
		rooster.setProperty(Constants.SING, "Cock-a-doodle-doo");
		
		Animal parrot = new Animal(Constants.TYPE_BIRD);
		parrot.setProperty(Constants.FLY, "I am flying");
		parrot.setProperty(Constants.SING, "Woof, woof");
		
		Animal fish = new Animal(Constants.TYPE_FISH);
		fish.setProperty(Constants.SWIM, "I am swimming");
		fish.removeProperty(Constants.WALK);
		
		Animal shark = new Animal(Constants.TYPE_SHARK);
		shark.setProperty(Constants.SWIM, "I am swimming");
		shark.setProperty(Constants.CHARACTERISTIC, "I am large and grey");
		shark.setProperty(Constants.EAT, "I eat other fishes");
		shark.removeProperty(Constants.WALK);
		
		Animal clown = new Animal(Constants.TYPE_CLOWN);
		clown.setProperty(Constants.SWIM, "I am swimming");
		clown.setProperty(Constants.CHARACTERISTIC, "I am small and colorful");
		clown.setProperty(Constants.JOKE, "I am joking");
		clown.removeProperty(Constants.WALK);
		
		Animal dolphin = new Animal(Constants.TYPE_DOLPHIN);
		dolphin.setProperty(Constants.SWIM, "I am swimming");
		dolphin.removeProperty(Constants.WALK);
		
		ButterFly butterFly = new ButterFly();
		butterFly.setMetomorphosisAge(12);
		
		Animal dog = new Animal(Constants.TYPE_DOG);
		dog.setProperty(Constants.SWIM, "I am swimming");
		dog.setProperty(Constants.SING, "Woof, woof");

		Animal frog = new Animal(Constants.TYPE_FROG);
		dog.setProperty(Constants.SWIM, "I am swimming");
		dog.setProperty(Constants.SING, "Buck, buck");
		
		Animal cat = new Animal(Constants.TYPE_CAT);
		dog.setProperty(Constants.SING, "Meow, meow");
		
	
		Animal[] animals = new Animal[]{ bird,
		        duck,
		        chicken,
		        rooster,
		        parrot,
		        fish,
		        shark,
		        clown,
		        dolphin,
		        frog,
		        dog,
		        butterFly,
		        cat
		};
		
		
		int flyCount = 0, swimCount = 0, singCount = 0, walkCount = 0;
		for(Animal animal: animals) {
			if(animal.hasProperty(Constants.FLY)) {
				flyCount++;
			}
			if(animal.hasProperty(Constants.SWIM)) {
				swimCount++;
			}
			if(animal.hasProperty(Constants.SING)) {
				singCount++;
			}
			if(animal.hasProperty(Constants.WALK)) {
				walkCount++;
			}
		}
		
		System.out.println("Walk count is -- "+walkCount);
		System.out.println("Swim count is -- "+swimCount);
		System.out.println("Fly count is -- "+flyCount);
		System.out.println("Sing count is -- "+singCount);
	}
	
	public static void main(String[] args) {
        Animal bird = new Animal(Constants.TYPE_BIRD);
        bird.setProperty(Constants.WALK, "I am walking");
        bird.setProperty(Constants.FLY, "I am flying");
        bird.setProperty(Constants.SING, "I am singing");
        bird.getProperty(Constants.WALK);
        bird.getProperty(Constants.FLY);
        bird.getProperty(Constants.SING);
        
        
        new Solution().countAnimals();
        
	}
}
