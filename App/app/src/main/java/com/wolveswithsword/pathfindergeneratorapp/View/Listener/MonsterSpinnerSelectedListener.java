package com.wolveswithsword.pathfindergeneratorapp.View.Listener;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.wolveswithsword.pathfindergeneratorapp.R;

import generator.MonsterType;

import static androidx.core.content.ContextCompat.getColor;


/**
 * Listener du spinner pour selectionner le type de monstre.
 */
public class MonsterSpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

    CheckBox bonusBox;
    Context context;

    public MonsterSpinnerSelectedListener(CheckBox bonusBox, Context context){
        this.bonusBox = bonusBox;
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        MonsterType type = MonsterType.getType(parent.getItemAtPosition(position).toString());

        //SET FONT AND COLOR OF SELECTED ITEM
        TextView selectedItemTV = (TextView) parent.getSelectedView();
        if(selectedItemTV != null)
            selectedItemTV.setTextAppearance(R.style.SpinnerSelectedItem);

        //En fonction du type du monstre on affiche la checkBox pour activer le bonus
        if(type == MonsterType.Aberration){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText(R.string.smart_creature);
        }
        else if(type == MonsterType.Artificial_creature){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText(R.string.treasure_keeper_creature);
        }
        else if(type == MonsterType.Humanoid){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText(R.string.whole_community);
        }
        else if(type == MonsterType.Undead){
            bonusBox.setVisibility(View.VISIBLE);
            bonusBox.setText(R.string.smart_undead);
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
