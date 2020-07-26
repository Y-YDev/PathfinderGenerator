package com.wolveswithsword.pathfindergeneratorapp.view.custom_treasure;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.List;

import generator.ProbabilityType;

public class CustomTreasureViewHolder extends RecyclerView.ViewHolder {

    private TextView nameField;
    private EditText poInput;
    private Spinner probability;
    private Context context;
    private TextView error;

    public CustomTreasureViewHolder(@NonNull View itemView) {
        super(itemView);
        poInput = itemView.findViewById(R.id.po_input);
        nameField = itemView.findViewById(R.id.name_field);
        probability = itemView.findViewById(R.id.probability_input);
        context = itemView.getContext();
        error = itemView.findViewById(R.id.errorCustomGen);
    }

    public void setNameField(String nameField) {
        this.nameField.setText(nameField);
    }

    public void setSpinner(List<String> probabilityList){
        this.probability.setAdapter(new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item, probabilityList));
    }

    public void setError(String errorMsg){
        error.setVisibility(View.VISIBLE);
        error.setText(errorMsg);
    }

    public int getPoInput(){
        return Integer.valueOf(poInput.getText().toString());
    }

    public ProbabilityType getProbabilitySelected(){
        return ProbabilityType.getType(probability.getSelectedItem().toString());
    }
}
