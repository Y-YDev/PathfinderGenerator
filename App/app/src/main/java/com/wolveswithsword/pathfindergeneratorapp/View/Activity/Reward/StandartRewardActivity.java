package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Reward;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.wolveswithsword.pathfindergeneratorapp.R;

import generator.MonsterType;
import generator.ProbabilityType;
import utility.Debug;

public class StandartRewardActivity extends RewardActivity {

    private MonsterType monsterType;
    private ProbabilityType probabilityType;
    private double po;
    private boolean bonusType;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        monsterType = (MonsterType) getIntent().getSerializableExtra("monsterType");
        probabilityType = (ProbabilityType) getIntent().getSerializableExtra("probaType");
        po = getIntent().getDoubleExtra("po",0);
        bonusType = getIntent().getBooleanExtra("bonus",false);

        //Génère les récompense et actualise la vue.
        roll();

        toolbar = findViewById(R.id.reward_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//Flèche de retour
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
        rewards = treasureBuilder.createRandomRewardWithMonster(monsterType,bonusType,probabilityType,po);
        rewardRecyclerViewAdapter.updateData(rewards);
        //Affichage textuel du trésor pour débug.
        Debug.printReward(rewards);
    }
}
