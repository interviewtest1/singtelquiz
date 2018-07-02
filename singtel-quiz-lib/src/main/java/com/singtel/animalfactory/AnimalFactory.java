package com.singtel.animalfactory;

import com.singtel.animal.Animal;
import com.singtel.butterfly.ButterFly;
import com.singtel.utils.Constants;

public class AnimalFactory {
	public static Animal getAnimal(Constants.AnimalType type) {
		Animal animal;
		switch (type) {
		case ANIMAL:
			animal = new Animal(type);
			break;
		case BIRD:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.FLY.toString(), "I am flying");
			animal.setProperty(Constants.AnimalAction.SING.toString(), "I am singing");
			break;
		case DUCK:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Quack, quack");
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.setProperty(Constants.AnimalAction.FLY.toString(), "I am flying");
			break;
		case CHICKEN:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Cluck, cluck");
			break;
		case ROOSTER:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Cock-a-doodle-doo");
			break;
		case PARROT:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Woof, woof");
			animal.setProperty(Constants.AnimalAction.FLY.toString(), "I am flying");
			break;
		case FISH:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.removeProperty(Constants.AnimalAction.WALK.toString());
			break;
		case SHARK:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.setProperty(Constants.CHARACTERISTIC, "I am large and grey");
			animal.setProperty(Constants.AnimalAction.EAT.toString(), "I eat other fishes");
			animal.removeProperty(Constants.AnimalAction.WALK.toString());
			break;
		case CLOWN:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.setProperty(Constants.CHARACTERISTIC, "I am small and colorful");
			animal.setProperty(Constants.AnimalAction.JOKE.toString(), "I am joking");
			animal.removeProperty(Constants.AnimalAction.WALK.toString());
			break;
		case DOLPHIN:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.removeProperty(Constants.AnimalAction.WALK.toString());
			break;
		case BUTTERFLY:
			animal = new ButterFly();
			((ButterFly)animal).setMetomorphosisAge(12);
			break;
		case CAT:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Meow, meow");
			break;
		case DOG:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Woof, woof");
			break;
		case FROG:
			animal = new Animal(type);
			animal.setProperty(Constants.AnimalAction.SWIM.toString(), "I am swimming");
			animal.setProperty(Constants.AnimalAction.SING.toString(), "Buck, buck");
			
			break;
		default:
			animal = new Animal(Constants.AnimalType.ANIMAL);
			break;
		}
		return animal;
	}
}
