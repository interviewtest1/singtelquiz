package com.singtel.main;

import com.singtel.animal.Animal;
import com.singtel.animalfactory.AnimalFactory;
import com.singtel.utils.Constants;

public class Solution {
	
	public void countAnimals() {
		Animal[] animals = new Animal[]{ AnimalFactory.getAnimal(Constants.AnimalType.BIRD),
				AnimalFactory.getAnimal(Constants.AnimalType.DUCK),
				AnimalFactory.getAnimal(Constants.AnimalType.CHICKEN),
				AnimalFactory.getAnimal(Constants.AnimalType.ROOSTER),
				AnimalFactory.getAnimal(Constants.AnimalType.PARROT),
				AnimalFactory.getAnimal(Constants.AnimalType.FISH),
				AnimalFactory.getAnimal(Constants.AnimalType.SHARK),
				AnimalFactory.getAnimal(Constants.AnimalType.CLOWN),
				AnimalFactory.getAnimal(Constants.AnimalType.DOLPHIN),
				AnimalFactory.getAnimal(Constants.AnimalType.FROG),
				AnimalFactory.getAnimal(Constants.AnimalType.DOG),
				AnimalFactory.getAnimal(Constants.AnimalType.BUTTERFLY),
				AnimalFactory.getAnimal(Constants.AnimalType.CAT)
		};
		
		
		int flyCount = 0, swimCount = 0, singCount = 0, walkCount = 0;
		for(Animal animal: animals) {
			if(animal.hasProperty(Constants.AnimalAction.FLY.toString())) {
				flyCount++;
			}
			if(animal.hasProperty(Constants.AnimalAction.SWIM.toString())) {
				swimCount++;
			}
			if(animal.hasProperty(Constants.AnimalAction.SING.toString())) {
				singCount++;
			}
			if(animal.hasProperty(Constants.AnimalAction.WALK.toString())) {
				walkCount++;
			}
		}
		
		System.out.println("Walk count is -- "+walkCount);
		System.out.println("Swim count is -- "+swimCount);
		System.out.println("Fly count is -- "+flyCount);
		System.out.println("Sing count is -- "+singCount);
	}
	
	public static void main(String[] args) {
        Animal bird = AnimalFactory.getAnimal(Constants.AnimalType.BIRD);
        bird.getProperty(Constants.AnimalAction.WALK.toString());
        bird.getProperty(Constants.AnimalAction.FLY.toString());
        bird.getProperty(Constants.AnimalAction.SING.toString());
        
        
        new Solution().countAnimals();
        
	}
}
