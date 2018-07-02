package com.singtel.main;

import com.singtel.animal.Animal;
import com.singtel.utils.Constants;

public class Solution {
	public static void main(String[] args) {
        Animal bird = new Animal(Constants.TYPE_BIRD);
        bird.setProperty(Constants.WALK, "I am walking");
        bird.setProperty(Constants.FLY, "I am flying");
        bird.setProperty(Constants.SING, "I am singing");
        bird.getProperty(Constants.WALK);
        bird.getProperty(Constants.FLY);
        bird.getProperty(Constants.SING);
}
}
