package com.example.pallavi.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class DiceRollerActivity extends AppCompatActivity {

    private ImageView mDice;
    private Random mRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roller);

        loadView();
    }

    private void loadView() {
        mRandom = new Random();

        mDice = (ImageView) findViewById(R.id.dice);
        mDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollTheDice();
            }
        });
    }

    private void rollTheDice() {
        int diceFace = mRandom.nextInt(6) + 1;

        switch (diceFace) {
            case 1 : mDice.setImageResource(R.drawable.dice1);
                     break;

            case 2 : mDice.setImageResource(R.drawable.dice2);
                     break;

            case 3 : mDice.setImageResource(R.drawable.dice3);
                     break;

            case 4 : mDice.setImageResource(R.drawable.dice4);
                     break;

            case 5 : mDice.setImageResource(R.drawable.dice5);
                     break;

            case 6 : mDice.setImageResource(R.drawable.dice6);
                     break;
        }
    }
}
