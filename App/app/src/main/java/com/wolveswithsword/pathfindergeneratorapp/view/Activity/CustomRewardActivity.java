package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.os.Bundle;

import java.util.ArrayList;

import generator.ProbabilityType;

public class CustomRewardActivity extends RewardActivity {

    ArrayList<Double> prices;
    ArrayList<ProbabilityType> probabilityTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setExtraValue();
        roll();
    }

    @SuppressWarnings("unchecked")
    private void setExtraValue(){
        prices = (ArrayList<Double>) getIntent().getSerializableExtra("prices");
        probabilityTypes = (ArrayList<ProbabilityType>) getIntent().getSerializableExtra("probabilityTypes");
    }

    @Override
    public void roll() {
        //TODO generate and update

    }
}
