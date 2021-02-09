package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Reward;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.ArrayList;

import generator.TreasureElement;
import utility.Debug;

/**
 * Activité pour afficher une récompense créée avec une génération custom de trésor.
 */
public class CustomRewardActivity extends RewardActivity {

    ArrayList<TreasureElement> treasureList;//On retient les paramètres de création de trésor.

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getExtraValue();
        roll();

        toolbar = findViewById(R.id.reward_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//Flèche de retour

    }

    @SuppressWarnings("unchecked")
    private void getExtraValue(){
        treasureList = (ArrayList<TreasureElement>) getIntent().getSerializableExtra("treasureList");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.empty_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();//Too keep all the informations
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void roll() {
        rewards = treasureBuilder.createCustomReward(treasureList);
        rewardRecyclerViewAdapter.updateData(rewards);
        //Affichage textuel du trésor pour débug.
        Debug.printReward(rewards);
    }
}
