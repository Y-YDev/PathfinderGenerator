package com.wolveswithsword.pathfindergeneratorapp.view.Activity.Reward;

import android.os.Bundle;

import java.util.ArrayList;

import generator.ProbabilityType;
import generator.TreasureElement;
import utility.Debug;

/**
 * Activité pour afficher une récompense créée avec une génération custom de trésor.
 */
public class CustomRewardActivity extends RewardActivity {

    ArrayList<TreasureElement> treasureList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getExtraValue();
        roll();
    }

    @SuppressWarnings("unchecked")
    private void getExtraValue(){
        treasureList = (ArrayList<TreasureElement>) getIntent().getSerializableExtra("treasureList");

    }

    @Override
    public void roll() {
        rewards = treasureBuilder.createCustomReward(treasureList);
        rewardRecyclerViewAdapter.updateData(rewards);
        //Affichage textuel du trésor pour débug.
        Debug.printReward(rewards);
    }
}
