package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.Custom_treasure;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import generator.ProbabilityType;
import generator.TreasureElement;

public class CustomTreasureViewHolder extends RecyclerView.ViewHolder {

    private LinearLayout itemLinearLayout;

    private TextView nameField;
    private EditText poInput;
    private Spinner probability;
    private Context context;
    private TextView error;

    private TreasureElement treasureElement;

    public CustomTreasureViewHolder(@NonNull View itemView) {
        super(itemView);
        itemLinearLayout = itemView.findViewById(R.id.main_item_lin_layout);
        poInput = itemView.findViewById(R.id.po_input);
        nameField = itemView.findViewById(R.id.name_field);
        probability = itemView.findViewById(R.id.probability_input);
        context = itemView.getContext();
        error = itemView.findViewById(R.id.errorCustomGen);

        this.probability.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_spinner_item, ProbabilityType.toArray()));
        error.setVisibility(View.GONE);

        //auto update treasureElement avec la nouvelle probabilité selectionner
        probability.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                treasureElement.setProba(ProbabilityType.getType(probability.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        poInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().isEmpty()) treasureElement.setPo(0);
                else if(s.charAt(0)=='.') s.insert(0,"0") ;
                else treasureElement.setPo(Double.parseDouble(s.toString()));
                checkInput();
            }
        });

    }

    @SuppressWarnings("unchecked")
    public void initView(TreasureElement treasureElement){
        this.treasureElement = treasureElement;
        this.nameField.setText(this.treasureElement.getTreasureType().toString());
        poInput.setText((treasureElement.getPo() != 0  ? Double.toString(treasureElement.getPo()) : ""));
        probability.setSelection(((ArrayAdapter<CharSequence>) probability.getAdapter()).getPosition(treasureElement.getProba().toString()));
        checkInput();
    }

    public void checkInput(){
        if(treasureElement.checkCorrectValue()){
            error.setVisibility(View.GONE);

            if(treasureElement.getPo() != 0) itemLinearLayout.setBackgroundColor(Color.WHITE);
            else itemLinearLayout.setBackgroundColor(Color.LTGRAY);
        }
        else {
            setError("La somme d'argent doit être inférieure à 1 000 000 po...");
            itemLinearLayout.setBackgroundColor(0x77FF0000);
        }
    }


    public void setError(String errorMsg){
        error.setVisibility(View.VISIBLE);
        error.setText(errorMsg);
    }

}




