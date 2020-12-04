package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Reward.CustomRewardActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.custom_treasure.CustomTreasureRecyclerViewAdapter;

import generator.TreasureElement;

/**
 * Activité de création custom de trésor
 */
public class CustomTreasureGenerationActivity extends AppCompatActivity {

    private Button createButton;
    private RecyclerView recyclerView;
    private CustomTreasureRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_treasure_creation);

        createButton = findViewById(R.id.custom_gen_button);
        recyclerView = findViewById(R.id.custom_gen_recycler);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO afficher un message d'erreur clair pour l'utilisateur
                if(adapter.checkIfCorrectInput()){
                    switchIntent();
                }
            }
        });

        adapter = new CustomTreasureRecyclerViewAdapter();
        adapter.setTreasureList(TreasureElement.generateAll());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    public void switchIntent(){

        Intent intent = new Intent(CustomTreasureGenerationActivity.this, CustomRewardActivity.class);

        intent.putExtra("treasureList",adapter.getTreasureList());

        startActivity(intent);
    }
}
