package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.custom_treasure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;

import generator.ProbabilityType;
import generator.TreasureElement;

public class CustomTreasureViewHolder extends RecyclerView.ViewHolder {

    private RelativeLayout itemLinearLayout;

    private TextView nameField;
    private EditText poInput;
    private Spinner probability;
    private Context context;
    private TextView error;
    private ImageView image;

    private TreasureElement treasureElement;

    public CustomTreasureViewHolder(@NonNull View itemView) {
        super(itemView);
        itemLinearLayout = itemView.findViewById(R.id.main_item_lin_layout);
        poInput = itemView.findViewById(R.id.po_input);
        nameField = itemView.findViewById(R.id.name_field);
        probability = itemView.findViewById(R.id.probability_input);
        context = itemView.getContext();
        error = itemView.findViewById(R.id.errorCustomGen);
        image = itemView.findViewById(R.id.treasure_img);

        this.probability.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_spinner_item, ProbabilityType.toArray()));
        error.setVisibility(View.GONE);

        //auto update treasureElement avec la nouvelle probabilité selectionner
        probability.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //SET FONT AND COLOR OF SELECTED ITEM
                TextView selectedItemTV = (TextView) parent.getSelectedView();
                if(selectedItemTV != null)
                    selectedItemTV.setTextAppearance(R.style.SpinnerSelectedItem);

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

        switch (this.treasureElement.getTreasureType()){
            case A:
                this.image.setImageResource(R.drawable.item_gold_image);
                break;
            case B:
                this.image.setImageResource(R.drawable.item_gem_image);
                break;
            case C:
                this.image.setImageResource(R.drawable.item_artitem_image);
                break;
            case D:
                this.image.setImageResource(R.drawable.treasure_jewels);
                break;
            case E:
                this.image.setImageResource(R.drawable.treasure_armor_weap);
                break;
            case F:
                this.image.setImageResource(R.drawable.treasure_warrior);
                break;
            case G:
                this.image.setImageResource(R.drawable.treasure_wizard);
                break;
            case H:
                this.image.setImageResource(R.drawable.treasure_dragon);
                break;
            default:
                this.image.setImageResource(R.drawable.treasure_treasure);
                break;
        }

        poInput.setText((treasureElement.getPo() != 0  ? Double.toString(treasureElement.getPo()) : ""));
        probability.setSelection(((ArrayAdapter<CharSequence>) probability.getAdapter()).getPosition(treasureElement.getProba().toString()));
        checkInput();
    }

    /**
     * On check l'input du prix donné.
     */
    public void checkInput(){
        if(treasureElement.checkCorrectValue()){
            error.setVisibility(View.GONE);

            if(treasureElement.getPo() != 0) itemLinearLayout.setBackgroundResource(R.color.theme_color_5);
            else itemLinearLayout.setBackgroundResource(R.color.theme_color_1);
        }
        else {
            setError(context.getString(R.string.error_money_toobig));
            itemLinearLayout.setBackgroundResource(R.color.theme_error_opacity);
        }
    }

    /**
     * Affiche l'erreur
     * @param errorMsg : le message d'erreur
     */
    public void setError(String errorMsg){
        error.setVisibility(View.VISIBLE);
        error.setText(errorMsg);
    }

}




