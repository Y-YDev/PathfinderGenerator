package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;

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
        price.setText(parchment.getPrice()+" "+ AppObject.getRessource().getString(R.string.gp));

        if(parchment.isDivine()){
            type.setText(R.string.divine);
        }
        else{
            type.setText(R.string.profane);
        }

        nls.setText(Integer.toString(parchment.getNls()));
        nds.setText(Integer.toString(parchment.getNds()));

        image.setImageResource(R.drawable.item_parchment_image);
    }
}
