package com.wolveswithsword.pathfindergeneratorapp.listener;

import android.view.View;

import com.wolveswithsword.pathfindergeneratorapp.view.RewardActivity;

import item.smartItem.SmartItem;

public class SmartItemShowButton implements View.OnClickListener {

    RewardActivity rewardActivity;
    SmartItem smartItem;

    public SmartItemShowButton(RewardActivity rewardActivity, SmartItem smartItem){
        this.rewardActivity =rewardActivity;
        this.smartItem = smartItem;
    }

    @Override
    public void onClick(View v) {
        rewardActivity.smartItemIntent(smartItem);
    }
}
