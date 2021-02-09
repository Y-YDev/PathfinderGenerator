package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Reward.CustomRewardActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.custom_treasure.CustomTreasureRecyclerViewAdapter;

import generator.TreasureElement;

/**
 * Activité de création custom de trésor
 */
public class CustomTreasureGenerationActivity extends AppCompatActivity {

    private Button createButton;
    private RecyclerView recyclerView;
    private CustomTreasureRecyclerViewAdapter adapter;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_treasure_creation);

        createButton = findViewById(R.id.custom_gen_button);
        recyclerView = findViewById(R.id.custom_gen_recycler);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO afficher un message d'erreur clair pour l'utilisateur
                //Si tout les inputs sont correct et ne sont pas tous vides.
                if(adapter.checkIfCorrectInput() && !adapter.isEmptyInput()){
                    switchIntent();
                }
            }
        });

        adapter = new CustomTreasureRecyclerViewAdapter();
        adapter.setTreasureList(TreasureElement.generateAll());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//Flèche de retour
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

            treasureTableDialog();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void treasureTableDialog(){
        final Dialog treasureDialog = new Dialog(this);
        treasureDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        treasureDialog.setContentView(R.layout.treasure_table_layout);
        //Fond transparant
        treasureDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        Button closeButton = treasureDialog.findViewById(R.id.close_treasure_table);

        closeButton.setEnabled(true);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treasureDialog.cancel();
            }
        });

        treasureDialog.show();
    }


    /**
     * Changement d'intent
     */
    public void switchIntent(){

        Intent intent = new Intent(CustomTreasureGenerationActivity.this, CustomRewardActivity.class);

        intent.putExtra("treasureList",adapter.getTreasureList());

        startActivity(intent);
    }
}
