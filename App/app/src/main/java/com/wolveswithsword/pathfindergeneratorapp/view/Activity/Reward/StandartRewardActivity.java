package com.wolveswithsword.pathfindergeneratorapp.view.Activity.Reward;

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

        //Génère les récompense et actualise la vue.
        roll();
    }


    @Override
    public void roll() {
        rewards = treasureBuilder.createRandomRewardWithMonster(monsterType,bonusType,probabilityType,po);
        rewardRecyclerViewAdapter.updateData(rewards);
        //Affichage textuel du trésor pour débug.
        Debug.printReward(rewards);
    }
}
