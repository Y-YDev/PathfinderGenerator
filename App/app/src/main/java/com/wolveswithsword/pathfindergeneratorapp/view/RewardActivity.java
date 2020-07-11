package com.wolveswithsword.pathfindergeneratorapp.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.wolveswithsword.pathfindergeneratorapp.R;

import generator.MonsterType;
import generator.ProbabilityType;

public class RewardActivity extends AppCompatActivity {

    MonsterType monsterType;
    ProbabilityType probabilityType;
    double po;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rewardlayout);

        monsterType = (MonsterType) getIntent().getSerializableExtra("monsterType");
        probabilityType = (ProbabilityType) getIntent().getSerializableExtra("probaType");
        po = getIntent().getDoubleExtra("po",0);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //TODO
        System.out.println("############################################## "+po+" "+monsterType+" "+probabilityType);
    }
}
