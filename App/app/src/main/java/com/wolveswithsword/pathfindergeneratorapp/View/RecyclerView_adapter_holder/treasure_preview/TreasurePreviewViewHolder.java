package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import generator.TreasurePreview;
import save.HandlerTreasureSave;

public class TreasurePreviewViewHolder extends RecyclerView.ViewHolder  {

    TextView name;
    TextView price;
    TextView nbItem;

    ImageButton deleteButton;

    public TreasurePreviewViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.save_name);
        price = itemView.findViewById(R.id.save_value);
        nbItem = itemView.findViewById(R.id.save_nb_item);
        deleteButton = itemView.findViewById(R.id.save_delete_button);
    }

    public void initView(TreasurePreview treasurePreview, HandlerTreasureSave handlerTreasureSave){
        name.setText(treasurePreview.getName());
        price.setText(Double.toString(treasurePreview.getPo()));
        nbItem.setText(Integer.toString(treasurePreview.getNbItem()));
    }

    public void setDeleteButtonListener(final TreasurePreviewRecyclerViewAdapter treasurePreviewRecyclerViewAdapter){
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treasurePreviewRecyclerViewAdapter.deleteSave(getAdapterPosition());
            }
        });
    }
}
