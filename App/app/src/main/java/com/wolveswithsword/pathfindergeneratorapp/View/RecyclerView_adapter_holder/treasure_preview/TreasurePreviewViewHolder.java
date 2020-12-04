package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.ArrayList;

import generator.TreasurePreview;

public class TreasurePreviewViewHolder extends RecyclerView.ViewHolder  {

    TextView name;
    TextView price;
    TextView nbItem;

    public TreasurePreviewViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.save_name);
        price = itemView.findViewById(R.id.save_value);
        nbItem = itemView.findViewById(R.id.save_nb_item);
    }

    public void initView(TreasurePreview treasurePreview){
        name.setText(treasurePreview.getName());
        price.setText(Double.toString(treasurePreview.getPo()));
        nbItem.setText(Integer.toString(treasurePreview.getNbItem()));
    }
}
