package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import item.wand.Wand;

public class WandViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView price;
    TextView propPart;
    TextView nds;
    TextView nls;

    LinearLayout propPartLayout;

    ImageView image;


    public WandViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.wand_name);
        price = itemView.findViewById(R.id.wand_price);
        propPart = itemView.findViewById(R.id.wand_part);
        propPartLayout = itemView.findViewById(R.id.wand_part_layout);
        image = itemView.findViewById(R.id.wand_image);
        nds = itemView.findViewById(R.id.wand_nds);
        nls = itemView.findViewById(R.id.wand_nls);

    }

    public void setWand(Wand wand){
        name.setText(wand.getName());
        price.setText(wand.getPrice()+" po");

        if(wand.isParticularPropertie()){
            propPartLayout.setVisibility(View.VISIBLE);
            propPart.setText("Indice");
        }
        else{
            propPartLayout.setVisibility(View.GONE);
        }

        image.setImageResource(R.drawable.wand_image);
        nds.setText(Integer.toString(wand.getNds()));
        nls.setText(Integer.toString(wand.getNls()));
    }
}
