package com.wolveswithsword.pathfindergeneratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import generator.MonsterType;
import generator.ProbabilityType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standardcreation);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Spinner monsterType = (Spinner) findViewById(R.id.monstertype);
        monsterType.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, MonsterType.toArray()));

        Spinner probabilityType = (Spinner) findViewById(R.id.proba);
        probabilityType.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, ProbabilityType.toArray()));
    }
}
