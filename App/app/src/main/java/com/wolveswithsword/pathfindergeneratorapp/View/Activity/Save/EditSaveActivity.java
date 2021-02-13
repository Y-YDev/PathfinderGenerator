package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Save;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation.CustomItemGenerationActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.Dialog.YesNoDialog;

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

        hideShowMenu();//Hide for the save edition
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.empty_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                //Si il y a des changements on demande la confirmation.
                if(rewardRecyclerViewAdapter.hasChanges()){
                    YesNoDialog dialog = new YesNoDialog(-2,"Quitter ?",
                            "Il y a des changements non sauvegardés. Voulez-vous vraiment quitter ?");

                    dialog.show(getSupportFragmentManager(), " yes no dialog ");
                }
                else onBackPressed();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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

        rewardRecyclerViewAdapter.setHasChanges(false);//Plus de changements.
    }

    @Override
    public void action(boolean doAction, int position) {
        if(doAction && position == -2) {//Dialog de changements non sauvegardés
            onBackPressed();
        }
        else super.action(doAction, position);
    }
}
