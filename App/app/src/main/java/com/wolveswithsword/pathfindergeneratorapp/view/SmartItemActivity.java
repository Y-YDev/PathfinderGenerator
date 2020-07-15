package com.wolveswithsword.pathfindergeneratorapp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.smartItem.SmartItem;

public class SmartItemActivity extends AppCompatActivity {

    SmartItem smartItem;
    TextView alignment;
    TextView ego;

    TextView INT;
    TextView SAG;
    TextView CHA;
    TextView langage;

    RecyclerView communication;
    RecyclerView skill;
    RecyclerView trait;

    LinearLayout planLayout;
    TextView plan;
    LinearLayout dedicateLayout;
    TextView dedicatePower;

    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smartitemlayout);

        smartItem = (SmartItem) getIntent().getSerializableExtra("smartItem");
    }

    @Override
    protected void onResume() {
        super.onResume();

        alignment = findViewById(R.id.aligment);
        ego = findViewById(R.id.ego);

        INT = findViewById(R.id.int_);
        SAG = findViewById(R.id.sag);
        CHA = findViewById(R.id.cha);
        langage = findViewById(R.id.langage);

        communication = findViewById(R.id.communication);
        skill = findViewById(R.id.skills);
        trait = findViewById(R.id.traits);

        planLayout = findViewById(R.id.plan_layout);
        plan = findViewById(R.id.plan);
        dedicateLayout = findViewById(R.id.power_layout);
        dedicatePower = findViewById(R.id.power);

        exit = findViewById(R.id.buttonExitSmart);

        initView();
    }

    private void initView(){
        alignment.setText(smartItem.getAlignement());
        ego.setText(Integer.toString(smartItem.getEgo()));

        INT.setText(Integer.toString(smartItem.getInt().getStat()));
        CHA.setText(Integer.toString(smartItem.getChar().getStat()));
        SAG.setText(Integer.toString(smartItem.getSag().getStat()));
        langage.setText(Integer.toString(smartItem.getLangage()));

        //TODO les recyclerView

        if(smartItem.getPlan() != null){
            planLayout.setVisibility(View.VISIBLE);
            plan.setText(smartItem.getPlan().getPlan());

            if(smartItem.getPower() != null){
                dedicateLayout.setVisibility(View.VISIBLE);
                dedicatePower.setText(smartItem.getPower().getPower());
            }
            else{
                dedicateLayout.setVisibility(View.GONE);
            }
        }
        else{
            planLayout.setVisibility(View.GONE);
            dedicateLayout.setVisibility(View.GONE);
        }

        communication.setAdapter(new StringRecyclerView(smartItem.communicationToArray()));
        communication.setLayoutManager(new LinearLayoutManager(this));

        skill.setAdapter(new StringRecyclerView(smartItem.skillToArray()));
        skill.setLayoutManager(new LinearLayoutManager(this));

        trait.setAdapter(new StringRecyclerView(smartItem.getTraits()));
        trait.setLayoutManager(new LinearLayoutManager(this));

        //Button pour quitter
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
