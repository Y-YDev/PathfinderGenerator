package com.wolveswithsword.pathfindergeneratorapp.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.CustomTreasureGenerationActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.StandartGenerationActivity;

public class MainMenuActivity extends AppCompatActivity {
    Button standardCreation;//Bouton de création standard
    Button customTreasureGeneration;//Bouton de création personnalisé par trésor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);

        standardCreation = findViewById(R.id.creation_standard);
        customTreasureGeneration = findViewById(R.id.creation_treasure);

        //Mise en place des listeners
        standardCreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                standardIntent();
            }
        });

        customTreasureGeneration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTreasureIntent();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void standardIntent(){
        Intent intent = new Intent(MainMenuActivity.this, StandartGenerationActivity.class);
        startActivity(intent);
    }

    private void customTreasureIntent(){
        Intent intent = new Intent(MainMenuActivity.this, CustomTreasureGenerationActivity.class);
        startActivity(intent);
    }
}
