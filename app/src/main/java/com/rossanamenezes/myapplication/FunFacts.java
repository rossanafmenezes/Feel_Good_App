package com.rossanamenezes.myapplication;

import android.graphics.RadialGradient;

import java.util.Random;

public class FunFacts {

    String [] funFacts = {

            "Ants stretch when they wake up in the morning.",
            "Humans are the only animals that blush",
            "Sea otters hold hands while they sleep",
            "There are over 10 holidays that celebrate chocolate.",
            "In some parts of Canada a group of bunnies is called a \"fluffle\", not a herd.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The voices of Mickey and Minnie Mouse got married in real life.",
            "Some penguins can leap 2-3 meters out of the water.",
            "Smiling is actually contagious.",
            "A team of six women programmed the first digital computer.",
            "Baby elephants suck their trunks for comfort.",
            "When you were born, you were, for a moment, the youngest person on earth.",
            "Cows have best friends.",
            "The Beatles used the word “love” 613 times in their songs - Love is all you need.",
            "Squirrels plant thousands of new trees each year simply by forgetting where they put their acorns."

    };

    public String getFact () {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(funFacts.length);
        return funFacts[randomNumber];

    }

}

