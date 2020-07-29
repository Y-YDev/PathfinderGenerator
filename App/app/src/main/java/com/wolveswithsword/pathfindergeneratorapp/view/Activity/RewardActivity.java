package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.view.RewardRecyclerView;

import java.util.ArrayList;

import generator.TreasureBuilder;
import item.Item;
import item.smartItem.SmartItem;
import utility.Debug;

public abstract class RewardActivity extends AppCompatActivity {

    ArrayList<Item> rewards;
    TreasureBuilder treasureBuilder;
    RecyclerView rewardView;
    protected RewardRecyclerView rewardRecyclerView;

    Button rerollButton;

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

        //set adapter reward
        rewardRecyclerView = new RewardRecyclerView();
        rewardView = findViewById(R.id.rewardView);
        rewardView.setAdapter(rewardRecyclerView);
        rewardView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    public abstract void roll();


    /**
     * Create intent for resume a smart item
     * @param smartItem smart item concerned
     */
    public void smartItemIntent(SmartItem smartItem){
        Intent intent = new Intent(RewardActivity.this, SmartItemActivity.class);
        intent.putExtra("smartItem",smartItem);
        startActivity(intent);
    }
}
