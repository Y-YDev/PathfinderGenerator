package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.potion.Potion;

public class PotionViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView price;
    TextView nds;
    TextView nls;

    ImageView image;

    public PotionViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.pot_name);
        price = itemView.findViewById(R.id.pot_price);
        nds = itemView.findViewById(R.id.pot_nds);
        nls = itemView.findViewById(R.id.pot_nls);
        image = itemView.findViewById(R.id.pot_image);
    }

    public void setPotion(Potion potion){
        name.setText(potion.getName());
        price.setText(potion.getPrice()+ "po");

        nds.setText(Integer.toString(potion.getNds()));
        nls.setText(Integer.toString(potion.getNls()));

        image.setImageResource(R.drawable.potion_image);
    }
}
