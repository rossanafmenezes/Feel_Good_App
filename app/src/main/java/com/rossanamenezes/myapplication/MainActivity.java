package com.rossanamenezes.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // member variables

    private final FunFacts funFacts = new FunFacts();
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

            String fact = funFacts.getFact();

            // update the screen with a new fact
            textView.setText(fact);

           int color = background.getColor();
           constraintLayout.setBackgroundColor(color);
           joyButton.setTextColor(color);

        };

        joyButton.setOnClickListener(listener);
    }
}
