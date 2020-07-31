package com.wolveswithsword.pathfindergeneratorapp.listener;

import android.view.View;

import com.wolveswithsword.pathfindergeneratorapp.view.Activity.RewardActivity;

import item.smartItem.SmartItem;

/**
 * Listener du bouton pour afficher un objet intelligent.
 */
public class SmartItemButtonListener implements View.OnClickListener {

    RewardActivity rewardActivity;
    SmartItem smartItem;

    public SmartItemButtonListener(RewardActivity rewardActivity, SmartItem smartItem){
        this.rewardActivity =rewardActivity;
        this.smartItem = smartItem;
    }

    @Override
    public void onClick(View v) {
        rewardActivity.smartItemIntent(smartItem);
    }
}
