package com.wolveswithsword.pathfindergeneratorapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.listener.StdGenClickListener;

import generator.MonsterType;
import generator.ProbabilityType;

public class StandartGenerationActivity extends AppCompatActivity {

    Button createButton;
    Spinner monsterTypeSpinner;
    Spinner probabilityTypeSpinner;
    EditText poInput;

    MonsterType monsterType;
    ProbabilityType probabilityType;
    double po;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standardcreation);
    }

    @Override
    protected void onResume() {
        super.onResume();

        monsterTypeSpinner = (Spinner) findViewById(R.id.monstertype);
        monsterTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, MonsterType.toArray()));

        probabilityTypeSpinner = (Spinner) findViewById(R.id.proba);
        probabilityTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, ProbabilityType.toArray()));

        poInput = findViewById(R.id.po);

        //Mise en place du listener
        createButton = findViewById(R.id.generate);
        createButton.setOnClickListener(new StdGenClickListener(this));
    }

    /**
     * Permet de passer à la page de l'affichage du butin.
     */
    public void switchIntent(){

        monsterType = MonsterType.getType(monsterTypeSpinner.getSelectedItem().toString());
        probabilityType = ProbabilityType.getType(probabilityTypeSpinner.getSelectedItem().toString());
        po = Double.valueOf(poInput.getText().toString());

        //on lance l'intent
        Intent intent = new Intent(StandartGenerationActivity.this, RewardActivity.class);
        intent.putExtra("po",po);
        intent.putExtra("monsterType",monsterType);
        intent.putExtra("probaType",probabilityType);
        startActivity(intent);
    }
}
