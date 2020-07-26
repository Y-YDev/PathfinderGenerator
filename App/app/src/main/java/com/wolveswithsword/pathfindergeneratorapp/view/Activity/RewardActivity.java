package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.listener.RerollClickListener;
import com.wolveswithsword.pathfindergeneratorapp.view.RewardRecyclerView;

import java.util.ArrayList;

import generator.MonsterType;
import generator.ProbabilityType;
import generator.TreasureBuilder;
import item.Item;
import item.smartItem.SmartItem;
import utility.Debug;

public class RewardActivity extends AppCompatActivity {

    private MonsterType monsterType;
    private ProbabilityType probabilityType;
    private double po;
    private boolean bonusType;

    ArrayList<Item> rewards;
    TreasureBuilder treasureBuilder;
    RecyclerView rewardView;
    RewardRecyclerView rewardRecyclerView;

    Button rerollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rewardlayout);

        monsterType = (MonsterType) getIntent().getSerializableExtra("monsterType");
        probabilityType = (ProbabilityType) getIntent().getSerializableExtra("probaType");
        po = getIntent().getDoubleExtra("po",0);
        bonusType = getIntent().getBooleanExtra("bonus",false);

        rerollButton = findViewById(R.id.reroll);
        rerollButton.setOnClickListener(new RerollClickListener(this));

        treasureBuilder = new TreasureBuilder();

        rewards = treasureBuilder.createRandomRewardWithMonster(monsterType,bonusType,probabilityType,po);
    }

    @Override
    protected void onResume() {
        super.onResume();

        rewardRecyclerView = new RewardRecyclerView(rewards);

        rewardView = findViewById(R.id.rewardView);
        rewardView.setAdapter(rewardRecyclerView);
        rewardView.setLayoutManager(new LinearLayoutManager(this));

        Debug.printReward(rewards);
    }

    public void reroll(){

        rewards = treasureBuilder.createRandomRewardWithMonster(monsterType,bonusType,probabilityType,po);
        rewardRecyclerView.updateData(rewards);

        Debug.printReward(rewards);
    }

    public void smartItemIntent(SmartItem smartItem){
        Intent intent = new Intent(RewardActivity.this, SmartItemActivity.class);
        intent.putExtra("smartItem",smartItem);
        startActivity(intent);
    }
}
