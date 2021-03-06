package com.rossanamenezes.myapplication;

import java.util.Random;
import android.graphics.Color;

public class Background {

    String [] background =  {

            "#39add1", // light blue
            "#3079ab", // dark blue
            "#880061", // dark pink
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#26C6DA", // turquoise
            "#f092b0", // pink
            "#00897B"  // green

    };

    int getColor () {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(background.length);
        int color = Color.parseColor(background[randomNumber]);
        return color;

    }

}




