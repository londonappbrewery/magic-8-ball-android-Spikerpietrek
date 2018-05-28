package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };

        Button  askButton = (Button) findViewById(R.id.ask_button);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("8ball", "Nacisnąłeś guzik!!!");

                Random random_number_gen = new Random();

                int number = random_number_gen.nextInt(5);

                Log.d("8ball","Wylosowana liczba to " + number);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}
