package com.wolveswithsword.pathfindergeneratorapp.view.Activity;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wolveswithsword.pathfindergeneratorapp.R;

public class CustomTreasureGeneationActivity extends AppCompatActivity {

    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_generate_treasure);
    }
}
