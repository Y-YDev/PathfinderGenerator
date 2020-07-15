package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.gemAndJewel.Gem;

public class GemViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView price;
    ImageView image;
    TextView cut;

    public GemViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.gem_name);
        price = itemView.findViewById(R.id.gem_price);
        cut = itemView.findViewById(R.id.gem_work);
        image = itemView.findViewById(R.id.gem_image);
    }

    public void setGem(Gem gem){
        name.setText(gem.getName());
        price.setText(gem.getPrice()+" po");
        cut.setText(gem.getCut().toString());
        image.setImageResource(R.drawable.gem_image);
    }
}
