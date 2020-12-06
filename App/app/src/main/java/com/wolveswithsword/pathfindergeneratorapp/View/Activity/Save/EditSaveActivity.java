package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Save;

import android.os.Bundle;

import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.CustomItemGenerationActivity;
import java.util.ArrayList;

import generator.TreasurePreview;
import item.Item;
import save.HandlerTreasureSave;

public class EditSaveActivity extends CustomItemGenerationActivity {

    ArrayList<Item> rewards;
    TreasurePreview treasurePreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getExtraValue();
        this.rewardRecyclerViewAdapter.updateData(rewards);
    }

    //On recupéère les données du gestionnaires de sauvegardes.
    @SuppressWarnings("unchecked")
    private void getExtraValue(){
        rewards = (ArrayList<Item>) getIntent().getSerializableExtra("itemList");
        treasurePreview = (TreasurePreview) getIntent().getSerializableExtra("treasurePreview");
    }


    //On save les changements. On ne créer plus.
    @Override
    protected void saveTreasure() {
        treasurePreview.setPo(rewardRecyclerViewAdapter.getTotalPriceOfItems());
        treasurePreview.setNbItem(rewardRecyclerViewAdapter.getItemCount());

        HandlerTreasureSave.getInstance().saveTreasure(
                rewardRecyclerViewAdapter.getRewardList(),
                treasurePreview
        );
    }
}
