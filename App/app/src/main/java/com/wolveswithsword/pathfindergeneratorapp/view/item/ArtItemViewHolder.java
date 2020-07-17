package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.artItem.ArtItem;

public class ArtItemViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;

    public ArtItemViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.art_name);
        price = itemView.findViewById(R.id.art_price);

        image = itemView.findViewById(R.id.art_image);
        delete = itemView.findViewById(R.id.artitem_delete);
    }

    public void setArtItem(ArtItem artItem){
        name.setText(artItem.getName());
        price.setText(artItem.getPrice()+" po");

        image.setImageResource(R.drawable.artitem_image);
    }
}
