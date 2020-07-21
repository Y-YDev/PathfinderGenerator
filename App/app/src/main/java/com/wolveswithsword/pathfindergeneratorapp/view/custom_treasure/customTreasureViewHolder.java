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

public class customTreasureViewHolder extends RecyclerView.ViewHolder {

    private TextView typeField;
    private TextView nameField;
    private EditText poInuput;
    private Spinner probability;
    private Context context;

    public customTreasureViewHolder(@NonNull View itemView) {
        super(itemView);
        poInuput = itemView.findViewById(R.id.po_input);
        typeField = itemView.findViewById(R.id.type_field);
        nameField = itemView.findViewById(R.id.name_field);
        probability = itemView.findViewById(R.id.probability_input);
        context = itemView.getContext();

    }

    public void setNameField(String nameField) {
        this.nameField.setText(nameField);
    }

    public void setTypeField(String type){
        this.typeField.setText(type);
    }

    public void setSpinner(List<String> probabilityList){
        this.probability.setAdapter(new ArrayAdapter<String>(context,android.R.layout.simple_spinner_item, probabilityList));
    }

    public int getPoInput(){
        return Integer.valueOf(poInuput.getText().toString());
    }

    public ProbabilityType getProbabilitySelected(){
        return ProbabilityType.getType(probability.getSelectedItem().toString());
    }
}
