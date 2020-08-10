package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.TypeItem;

public class CustomItemGenerationActivity extends AppCompatActivity {

    RecyclerView rewardRecyclerView;

    Button addButton;
    Spinner objectSpinner;
    Spinner raritySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_item_creation);

        addButton = findViewById(R.id.add_button);
        objectSpinner = findViewById(R.id.object_spinner);
        objectSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, TypeItem.nameToArray()));

        raritySpinner = findViewById(R.id.rarity_spinner);
        raritySpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[0]));
    }

}
