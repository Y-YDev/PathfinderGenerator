package com.wolveswithsword.pathfindergeneratorapp.listener;

import android.view.View;

import com.wolveswithsword.pathfindergeneratorapp.view.StandartGenerationActivity;

public class StdGenClickListener implements View.OnClickListener {

    StandartGenerationActivity activity;

    public StdGenClickListener(StandartGenerationActivity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        if(activity.checkField()){
            activity.switchIntent();
        }
    }
}
