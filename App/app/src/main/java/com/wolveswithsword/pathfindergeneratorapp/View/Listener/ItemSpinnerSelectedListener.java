package com.wolveswithsword.pathfindergeneratorapp.View.Listener;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import item.TypeItem;

public class ItemSpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

    LinearLayout poField;
    EditText poInput;
    Spinner raritySpinner;

    public ItemSpinnerSelectedListener(LinearLayout poField, EditText poInput, Spinner raritySpinner){
        this.poField = poField;
        this.poInput = poInput;
        this.raritySpinner = raritySpinner;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TypeItem type = TypeItem.getTypeItem(parent.getItemAtPosition(position).toString());

        if(type == TypeItem.COIN){
            poField.setVisibility(View.VISIBLE);
            raritySpinner.setEnabled(false);
        }
        else {
            poField.setVisibility(View.INVISIBLE);
            raritySpinner.setEnabled(true);
        }

        //On réinitialise quand on change de selection
        poInput.setText("");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Ne rien faire
    }
}
