package com.wolveswithsword.pathfindergeneratorapp.listener;

import android.view.View;

import com.wolveswithsword.pathfindergeneratorapp.view.Activity.RewardActivity;

public class RerollClickListener implements View.OnClickListener {
    RewardActivity activity;

    public RerollClickListener(RewardActivity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        activity.reroll();
    }
}
