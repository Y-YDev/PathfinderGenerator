package com.wolveswithsword.pathfindergeneratorapp.View.Listener;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.TypeItem;

public class ItemSpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

    LinearLayout poField;
    EditText poInput;
    Spinner raritySpinner;
    Context context;
    TextView errorText;

    public ItemSpinnerSelectedListener(Context context, LinearLayout poField, EditText poInput, Spinner raritySpinner, TextView errorText){
        this.poField = poField;
        this.poInput = poInput;
        this.raritySpinner = raritySpinner;
        this.context = context;
        this.errorText = errorText;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TypeItem type = TypeItem.getTypeItem(parent.getItemAtPosition(position).toString());

        //SET FONT AND COLOR OF SELECTED ITEM
        TextView selectedItemTV = (TextView) parent.getSelectedView();
        if(selectedItemTV != null) {
            selectedItemTV.setTextAppearance(R.style.SpinnerSelectedItem);
        }

        if(type == TypeItem.COIN){
            poField.setVisibility(View.VISIBLE);
            raritySpinner.setEnabled(false);//Pas de rareté pour les pièces.
            raritySpinner.setAlpha(0.2f);//Disabled color
        }
        else {
            poField.setVisibility(View.GONE);
            raritySpinner.setEnabled(true);
            raritySpinner.setAlpha(1);

            if(type == TypeItem.SCEPTER || type == TypeItem.STAFF){//Les premières rareté ne sont pas disponibles
                raritySpinner.setAdapter(new ArrayAdapter<Integer>(context,android.R.layout.simple_spinner_item, new Integer[]{3,4,5,6}));
            }
            else{
                raritySpinner.setAdapter(new ArrayAdapter<Integer>(context,android.R.layout.simple_spinner_item, new Integer[]{1,2,3,4,5,6}));
            }
        }
        //On réinitialise quand on change de selection
        poInput.setText("");
        errorText.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Ne rien faire
    }
}
