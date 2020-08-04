package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.potion.Potion;

public class PotionViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;
    TextView nds;
    TextView nls;


    public PotionViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.pot_name);
        price = itemView.findViewById(R.id.pot_price);
        nds = itemView.findViewById(R.id.pot_nds);
        nls = itemView.findViewById(R.id.pot_nls);

        image = itemView.findViewById(R.id.pot_image);
        delete = itemView.findViewById(R.id.potion_delete);
    }

    public void setPotion(Potion potion){
        name.setText(potion.getName());
        price.setText(potion.getPrice()+ " po");

        nds.setText(Integer.toString(potion.getNds()));
        nls.setText(Integer.toString(potion.getNls()));

        image.setImageResource(R.drawable.potion_image);
    }
}
