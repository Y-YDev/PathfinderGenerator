package com.wolveswithsword.pathfindergeneratorapp.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.CustomItemGenerationActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.CustomTreasureGenerationActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.StandartGenerationActivity;

public class MainMenuActivity extends AppCompatActivity {
    Button standardCreation;//Bouton de création standard
    Button customTreasureGeneration;//Bouton de création personnalisé par trésor
    Button customItemGeneration;//Bouton de création d'objet personnalisé
    Button saveManager;//Bouton de gestion des sauvegardes.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);

        standardCreation = findViewById(R.id.creation_standard);
        customTreasureGeneration = findViewById(R.id.creation_treasure);
        customItemGeneration = findViewById(R.id.creation_item);
        saveManager = findViewById(R.id.save_manager);

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

        customItemGeneration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customItemIntent();
            }
        });

        saveManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveManagerIntent();
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

    private void customItemIntent(){
        Intent intent = new Intent(MainMenuActivity.this, CustomItemGenerationActivity.class);
        startActivity(intent);
    }

    private void saveManagerIntent(){
        Intent intent = new Intent(MainMenuActivity.this, SaveMenuActivity.class);
        startActivity(intent);
    }
}
