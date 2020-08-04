package com.wolveswithsword.pathfindergeneratorapp.View.Listener;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;

import generator.MonsterType;

/**
 * Listener du spinner pour selectionner le type de monstre.
 */
public class MonsterSpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

    CheckBox bonusBox;

    public MonsterSpinnerSelectedListener(CheckBox bonusBox){
        this.bonusBox = bonusBox;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        MonsterType type = MonsterType.getType(parent.getItemAtPosition(position).toString());

        //En fonction du type du monstre on affiche la checkBox pour activer le bonus
        if(type == MonsterType.Aberration){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText("Créature rusée ?");
        }
        else if(type == MonsterType.Artificial_creature){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText("Garde un trésor ?");
        }
        else if(type == MonsterType.Humanoid){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText("Communauté entière ?");
        }
        else if(type == MonsterType.Undead){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText("Morts-vivants intelligents ?");
        }
        else {
            bonusBox.setVisibility(View.GONE);
        }

        bonusBox.setChecked(false);//On ne laisse pas coché
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Ne rien faire
    }
}
