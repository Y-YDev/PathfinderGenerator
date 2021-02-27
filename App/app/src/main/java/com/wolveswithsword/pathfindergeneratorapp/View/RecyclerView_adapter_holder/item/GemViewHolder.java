package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;

import item.gemAndJewel.Gem;

public class GemViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;
    TextView cut;

    ImageView image;

    public GemViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.gem_name);
        price = itemView.findViewById(R.id.gem_price);
        cut = itemView.findViewById(R.id.gem_work);

        image = itemView.findViewById(R.id.gem_image);
        delete = itemView.findViewById(R.id.gem_delete);
    }

    public void setGem(Gem gem){
        name.setText(gem.getName());
        price.setText(gem.getPrice()+" "+ AppObject.getRessource().getString(R.string.gp));
        cut.setText(gem.getCut().toString());
        image.setImageResource(R.drawable.item_gem_image);
    }
}
