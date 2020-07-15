package com.wolveswithsword.pathfindergeneratorapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.listener.MonsterSpinnerSelectedListener;
import com.wolveswithsword.pathfindergeneratorapp.listener.StdGenClickListener;

import generator.MonsterType;
import generator.ProbabilityType;

public class StandartGenerationActivity extends AppCompatActivity {

    private Button createButton;
    private Spinner monsterTypeSpinner;
    private Spinner probabilityTypeSpinner;
    private EditText poInput;
    private CheckBox bonusBox;
    private TextView error;

    private MonsterType monsterType;
    private ProbabilityType probabilityType;
    private double po;
    private boolean bonusType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standardcreation);
    }

    @Override
    protected void onResume() {
        super.onResume();

        bonusBox = findViewById(R.id.checkbox_bonus);

        monsterTypeSpinner = (Spinner) findViewById(R.id.monstertype);
        monsterTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, MonsterType.toArray()));
        monsterTypeSpinner.setOnItemSelectedListener(new MonsterSpinnerSelectedListener(bonusBox));

        probabilityTypeSpinner = (Spinner) findViewById(R.id.proba);
        probabilityTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, ProbabilityType.toArray()));

        poInput = findViewById(R.id.po);

        error = findViewById(R.id.errorStdGen);
        error.setVisibility(View.INVISIBLE);

        //Mise en place du listener
        createButton = findViewById(R.id.generate);
        createButton.setOnClickListener(new StdGenClickListener(this));
    }


    public boolean checkField(){
        if(poInput.getText().toString().equals("")){
            error.setVisibility(View.VISIBLE);
            return false;
        }
        else{
            return true;
        }

    }

    /**
     * Permet de passer à la page de l'affichage du butin.
     */
    public void switchIntent(){

        monsterType = MonsterType.getType(monsterTypeSpinner.getSelectedItem().toString());
        probabilityType = ProbabilityType.getType(probabilityTypeSpinner.getSelectedItem().toString());
        po = Double.valueOf(poInput.getText().toString());
        bonusType = bonusBox.isChecked();

        //on lance l'intent
        Intent intent = new Intent(StandartGenerationActivity.this, RewardActivity.class);
        intent.putExtra("po",po);
        intent.putExtra("monsterType",monsterType);
        intent.putExtra("probaType",probabilityType);
        intent.putExtra("bonus",bonusType);
        startActivity(intent);
    }
}
