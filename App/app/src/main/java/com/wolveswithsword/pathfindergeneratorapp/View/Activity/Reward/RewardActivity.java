package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Reward;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Dialog.SaveNameDialog;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.RewardRecyclerViewAdapter;

import java.util.ArrayList;

import generator.TreasureBuilder;
import generator.TreasurePreview;
import item.Item;
import save.HandlerTreasureSave;

public abstract class RewardActivity extends AppCompatActivity implements SaveNameDialog.SaveNameDialogListener {

    private Button rerollButton;
    private Button saveButton;

    protected RecyclerView rewardRecyclerView;
    protected ArrayList<Item> rewards;
    protected TreasureBuilder treasureBuilder;
    protected RewardRecyclerViewAdapter rewardRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward_layout);

        rerollButton = findViewById(R.id.reroll);
        rerollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                roll();
            }
        });

        saveButton = findViewById(R.id.save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });

        treasureBuilder = new TreasureBuilder();

        //Mise en place de l'adapter pour les récompenses
        rewardRecyclerView = findViewById(R.id.rewardView);
        rewardRecyclerViewAdapter = new RewardRecyclerViewAdapter();
        rewardRecyclerView.setAdapter(rewardRecyclerViewAdapter);
        rewardRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * Lance/Relance les récompenses générées
     */
    public abstract void roll();

    /**
     * Fenetre de dialogue du nom de la sauvegarde
     */
    public void save(){
        if(rewardRecyclerViewAdapter.getItemCount() != 0) {//Inutile de save une liste vide...CQFD
            SaveNameDialog saveNameDialog = new SaveNameDialog();

            saveNameDialog.show(getSupportFragmentManager()," save name dialog ");
        }
    }

    /**
     * Sauvegarde un trésor.
     * @param saveName
     */
    @Override
    public void saveTreasure(String saveName) {
        TreasurePreview treasurePreview = new TreasurePreview();
        treasurePreview.setName(saveName);
        treasurePreview.setPo(rewardRecyclerViewAdapter.getTotalPriceOfItems());
        treasurePreview.setNbItem(rewardRecyclerViewAdapter.getItemCount());

        HandlerTreasureSave.getInstance().saveTreasure(
                rewardRecyclerViewAdapter.getRewardList(),
                treasurePreview
        );
    }
}
