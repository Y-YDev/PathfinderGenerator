package com.wolveswithsword.pathfindergeneratorapp.View.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview.TreasurePreviewRecyclerViewAdapter;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.Constants;

import java.util.ArrayList;

import generator.TreasurePreview;
import save.HandlerTreasureSave;

public class SaveMenuActivity extends AppCompatActivity {

    ArrayList<TreasurePreview> saveList;
    HandlerTreasureSave handler;

    RecyclerView saveRecyclerView;
    TreasurePreviewRecyclerViewAdapter saveRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_loader);

        saveRecyclerView = findViewById(R.id.save_list);

        handler = new HandlerTreasureSave(getFilesDir().getAbsolutePath()+ Constants.SAVES);
        saveList = handler.getPreviewList();

        saveRecyclerViewAdapter = new TreasurePreviewRecyclerViewAdapter(saveList);
        saveRecyclerView.setAdapter(saveRecyclerViewAdapter);

        saveRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
