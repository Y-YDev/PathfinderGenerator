package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.view.RewardRecyclerViewAdapter;

import java.util.ArrayList;

import generator.TreasureBuilder;
import item.Item;
import item.smartItem.SmartItem;

public abstract class RewardActivity extends AppCompatActivity {

    private Button rerollButton;

    protected RecyclerView rewardRecyclerView;
    protected ArrayList<Item> rewards;
    protected TreasureBuilder treasureBuilder;
    protected RewardRecyclerViewAdapter rewardRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rewardlayout);

        rerollButton = findViewById(R.id.reroll);
        rerollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                roll();
            }
        });

        treasureBuilder = new TreasureBuilder();

        //Mise en place de l'adapter pour les récompenses
        rewardRecyclerView = findViewById(R.id.rewardView);
        rewardRecyclerViewAdapter = new RewardRecyclerViewAdapter();
        rewardRecyclerView.setAdapter(rewardRecyclerViewAdapter);
        rewardRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * Lance/Relance les récompenses générées
     */
    public abstract void roll();


    /**
     * Créer un intent vers la page d'affichage de smart item
     * @param smartItem : l'objet intelligent
     */
    public void smartItemIntent(SmartItem smartItem){
        Intent intent = new Intent(RewardActivity.this, SmartItemActivity.class);
        intent.putExtra("smartItem",smartItem);
        startActivity(intent);
    }
}
