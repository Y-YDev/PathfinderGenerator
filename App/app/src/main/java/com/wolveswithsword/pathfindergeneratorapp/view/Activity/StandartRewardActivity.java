package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.os.Bundle;

import generator.MonsterType;
import generator.ProbabilityType;
import utility.Debug;

public class StandartRewardActivity extends RewardActivity {

    private MonsterType monsterType;
    private ProbabilityType probabilityType;
    private double po;
    private boolean bonusType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        monsterType = (MonsterType) getIntent().getSerializableExtra("monsterType");
        probabilityType = (ProbabilityType) getIntent().getSerializableExtra("probaType");
        po = getIntent().getDoubleExtra("po",0);
        bonusType = getIntent().getBooleanExtra("bonus",false);

        //generate treasure and update view
        roll();
    }


    @Override
    public void roll() {

        rewards = treasureBuilder.createRandomRewardWithMonster(monsterType,bonusType,probabilityType,po);
        rewardRecyclerView.updateData(rewards);

        Debug.printReward(rewards);
    }
}
