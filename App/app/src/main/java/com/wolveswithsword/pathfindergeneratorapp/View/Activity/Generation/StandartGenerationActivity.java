package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Dialog.TreasureTableDialog;
import com.wolveswithsword.pathfindergeneratorapp.View.Listener.MonsterSpinnerSelectedListener;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Reward.StandartRewardActivity;

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

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard_creation);

        bonusBox = findViewById(R.id.checkbox_bonus);

        monsterTypeSpinner = (Spinner) findViewById(R.id.monstertype);
        monsterTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, MonsterType.toArray()));
        monsterTypeSpinner.setOnItemSelectedListener(new MonsterSpinnerSelectedListener(bonusBox,this));//Mise en place du listener

        probabilityTypeSpinner = (Spinner) findViewById(R.id.proba);
        probabilityTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, ProbabilityType.toArray()));
        probabilityTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //SET FONT AND COLOR OF SELECTED ITEM
                TextView selectedItemTV = (TextView) parent.getSelectedView();
                if(selectedItemTV != null)
                    selectedItemTV.setTextAppearance(R.style.SpinnerSelectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //NOTHING
            }
        });

        poInput = findViewById(R.id.po);

        error = findViewById(R.id.errorStdGen);

        //Mise en place du listener
        createButton = findViewById(R.id.generate);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkField()){
                    switchIntent();
                }
            }
        });

        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//Flèche de retour
    }

    @Override
    protected void onResume() {
        super.onResume();
        error.setVisibility(View.GONE);//L'erreur redeviens invisible
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.treasure_table){//table des trésors

            TreasureTableDialog treasureTableDialog = new TreasureTableDialog();
            treasureTableDialog.show(getSupportFragmentManager()," treasure table dialog ");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Vérifie l'argent que l'utilisateur rentre dans l'EditText
     * @return true ou false si le check est correct ou non
     */
    public boolean checkField(){
        //L'EditText est vide
        if(poInput.getText().toString().equals("")){
            error.setVisibility(View.VISIBLE);
            error.setText("Veuillez renseigner une quantité d'argent...");
            return false;
        }
        //La valeur est trop élévée (crash de l'application)
        else if(Double.parseDouble(poInput.getText().toString()) > 1000000){
            error.setVisibility(View.VISIBLE);
            error.setText("La somme d'argent doit être inférieure à 1 000 000 po...");
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
        Intent intent = new Intent(StandartGenerationActivity.this, StandartRewardActivity.class);

        intent.putExtra("po",po);
        intent.putExtra("monsterType",monsterType);
        intent.putExtra("probaType",probabilityType);
        intent.putExtra("bonus",bonusType);
        startActivity(intent);
    }
}
