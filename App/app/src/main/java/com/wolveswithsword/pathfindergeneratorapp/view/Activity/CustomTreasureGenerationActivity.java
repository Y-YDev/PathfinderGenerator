package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.view.custom_treasure.CustomTreasureRecyclerView;

import java.util.ArrayList;

import generator.ProbabilityType;
import generator.Treasure;
import generator.TreasureType;

public class CustomTreasureGenerationActivity extends AppCompatActivity {

    private Button createButton;
    private RecyclerView recyclerView;
    private CustomTreasureRecyclerView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_generate_treasure);
    }

    @Override
    protected void onResume() {
        super.onResume();

        createButton = findViewById(R.id.custom_gen_button);
        recyclerView = findViewById(R.id.custom_gen_recycler);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(adapter.checkIfCorrectInput()){
                    switchIntent();
                }
            }
        });

        adapter = new CustomTreasureRecyclerView(Treasure.getAllTreasure());


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void switchIntent(){
        ArrayList<Double> prices = adapter.getPrices();
        ArrayList<ProbabilityType> probabilityTypes = adapter.getProbabilityTypes();

        Intent intent = new Intent(CustomTreasureGenerationActivity.this, CustomRewardActivity.class);
        intent.putExtra("prices",prices);
        intent.putExtra("probabilityTypes",probabilityTypes);
        startActivity(intent);
    }
}
