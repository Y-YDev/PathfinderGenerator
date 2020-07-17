package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.parchment.Parchment;

public class ParchmentViewHolder extends ItemViewHolder{

    TextView name;
    TextView price;
    TextView type;
    TextView nls;
    TextView nds;


    public ParchmentViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.par_name);
        price = itemView.findViewById(R.id.par_price);
        type = itemView.findViewById(R.id.par_type);
        nls = itemView.findViewById(R.id.par_nls);
        nds = itemView.findViewById(R.id.par_nds);

        image = itemView.findViewById(R.id.par_image);
        delete = itemView.findViewById(R.id.parchment_delete);
    }

    public void setParchment(Parchment parchment){
        name.setText(parchment.getName());
        price.setText(parchment.getPrice()+" po");

        if(parchment.isDivine()){
            type.setText("Divin");
        }
        else{
            type.setText("Profane");
        }

        nls.setText(Integer.toString(parchment.getNls()));
        nds.setText(Integer.toString(parchment.getNds()));

        image.setImageResource(R.drawable.parchment_image);
    }
}
