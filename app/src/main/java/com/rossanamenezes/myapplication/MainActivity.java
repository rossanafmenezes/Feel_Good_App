package com.rossanamenezes.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // member variables

    private final Background background = new Background();

    // View Variables

    private TextView textView;
    private Button joyButton;
    private ConstraintLayout constraintLayout;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textView = findViewById(R.id.textView);
    constraintLayout = findViewById(R.id.background);
    joyButton = findViewById(R.id.joyButton);
    ImageView imageView = findViewById(R.id.imageView);
    imageView.setImageResource(R.drawable.logo);


        View.OnClickListener listener = v -> {

            ArrayList<FunFactItem> newFunFacts =  createFunFacts();
            Random random = new Random();
            int randomIndex = random.nextInt(newFunFacts.size());

            FunFactItem newFunFactItem = newFunFacts.get(randomIndex);
            textView.setText(newFunFactItem.getFunFact());
            imageView.setImageResource(newFunFactItem.getImageResourceId());

           int color = background.getColor();
           constraintLayout.setBackgroundColor(color);
           joyButton.setTextColor(color);

        };

        joyButton.setOnClickListener(listener);
    }

    public ArrayList<FunFactItem> createFunFacts() {

        ArrayList<FunFactItem> funFacts = new ArrayList<>();
        funFacts.add(new FunFactItem("Cars Are Now Designed to Keep Dogs Safe on Hot Days", R.drawable.dogcar));
        funFacts.add(new FunFactItem("Humans are the only animals that blush", R.drawable.blush));
        funFacts.add(new FunFactItem("Sea otters hold hands while they sleep", R.drawable.otters));
        funFacts.add(new FunFactItem("There are over 10 holidays that celebrate chocolate.", R.drawable.chocolate));
        funFacts.add(new FunFactItem("In some parts of Canada a group of bunnies is called a \"fluffle\", not a herd.", R.drawable.bunny));
        funFacts.add(new FunFactItem("Some bamboo plants can grow almost a meter in just one day.", R.drawable.bamboo));
        funFacts.add(new FunFactItem("The voices of Mickey and Minnie Mouse got married in real life.", R.drawable.mickey));
        funFacts.add(new FunFactItem("Some penguins can leap 2-3 meters out of the water.", R.drawable.penguin));
        funFacts.add(new FunFactItem("Smiling is actually contagious.", R.drawable.smile));
        funFacts.add(new FunFactItem("A team of six women programmed the first digital computer. (Yeah, I know only 4 are in the pic.", R.drawable.women));
        funFacts.add(new FunFactItem("Baby elephants suck their trunks for comfort.", R.drawable.elephant));
        funFacts.add(new FunFactItem("When you were born, you were, for a moment, the youngest person on earth.", R.drawable.newborn));
        funFacts.add(new FunFactItem("The Beatles used the word “love” 613 times in their songs - Love is all you need.", R.drawable.beatles));
        funFacts.add(new FunFactItem("Squirrels plant thousands of new trees each year simply by forgetting where they put their acorns.", R.drawable.squirel));
        funFacts.add(new FunFactItem("Baby Sloths Are Addicted to Cuddling", R.drawable.sloth));
        funFacts.add(new FunFactItem("The Netherlands Gifts 20,000 Tulips to Canada Every Year", R.drawable.tulips));
        funFacts.add(new FunFactItem("Humans Are Born With the Knowledge That Sharing Really Is Caring", R.drawable.care));
        funFacts.add(new FunFactItem("Science Says Your Dog Really Loves You", R.drawable.doglove));

        return funFacts;
    }

}
