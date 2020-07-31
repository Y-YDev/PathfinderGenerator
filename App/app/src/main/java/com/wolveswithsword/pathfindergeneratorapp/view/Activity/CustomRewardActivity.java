package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.os.Bundle;

import java.util.ArrayList;

import generator.ProbabilityType;
import utility.Debug;

/**
 * Activité pour afficher une récompense créée avec une génération custom de trésor.
 */
public class CustomRewardActivity extends RewardActivity {

    ArrayList<Double> prices;
    ArrayList<ProbabilityType> probabilityTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getExtraValue();
        roll();
    }

    @SuppressWarnings("unchecked")
    private void getExtraValue(){
        prices = (ArrayList<Double>) getIntent().getSerializableExtra("prices");
        probabilityTypes = (ArrayList<ProbabilityType>) getIntent().getSerializableExtra("probabilityTypes");
    }

    @Override
    public void roll() {
        rewards = treasureBuilder.createCustomReward(probabilityTypes,prices);
        rewardRecyclerViewAdapter.updateData(rewards);
        //Affichage textuel du trésor pour débug.
        Debug.printReward(rewards);
    }
}
