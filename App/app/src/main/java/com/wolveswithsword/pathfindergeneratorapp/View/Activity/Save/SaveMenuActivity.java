package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Save;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Dialog.SaveNameDialog;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview.TreasurePreviewRecyclerViewAdapter;

import java.util.ArrayList;

import generator.TreasurePreview;
import item.Item;
import save.HandlerTreasureSave;

public class SaveMenuActivity extends AppCompatActivity implements SaveNameDialog.SaveNameDialogListener {

    ArrayList<TreasurePreview> saveList;

    RecyclerView saveRecyclerView;
    TreasurePreviewRecyclerViewAdapter saveRecyclerViewAdapter;

    private TreasurePreview currentTreasurePreview;
    private ArrayList<Item> currentItemList;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_loader);

        saveRecyclerView = findViewById(R.id.save_list);

        saveRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        toolbar = findViewById(R.id.reward_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//Flèche de retour
    }

    @Override
    protected void onResume() {
        super.onResume();

        saveList = HandlerTreasureSave.getInstance().getPreviewList();

        saveRecyclerViewAdapter = new TreasurePreviewRecyclerViewAdapter(saveList,this);
        saveRecyclerView.setAdapter(saveRecyclerViewAdapter);
    }

    //Permet de récupérer des informations sur la sauvegarde renommée
    public void getRenamedFile(ArrayList<Item> items, TreasurePreview treasurePreview){
        this.currentItemList = items;
        this.currentTreasurePreview = treasurePreview;
    }


    /**
     * Renommage de la sauvegarde
     * @param saveName : le nouveau nom de la sauvegarde
     */
    @Override
    public void saveTreasure(String saveName) {
        //On supprime l'ancienne et créer la nouvelle sauvegarde
        if(HandlerTreasureSave.getInstance().deleteSaveFile(currentTreasurePreview)){
            currentTreasurePreview.setName(saveName);
            HandlerTreasureSave.getInstance().saveTreasure(currentItemList,currentTreasurePreview);

            saveRecyclerViewAdapter.notifyDataSetChanged();
        }
    }
}
