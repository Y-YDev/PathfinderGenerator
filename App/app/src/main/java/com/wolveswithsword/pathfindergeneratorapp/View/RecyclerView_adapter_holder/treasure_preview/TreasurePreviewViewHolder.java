package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import generator.TreasurePreview;

public class TreasurePreviewViewHolder extends RecyclerView.ViewHolder  {

    TextView name;
    TextView price;
    TextView nbItem;

    ImageButton deleteButton;
    ImageButton editButton;
    ImageButton renameButton;

    public TreasurePreviewViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.save_name);
        price = itemView.findViewById(R.id.save_value);
        nbItem = itemView.findViewById(R.id.save_nb_item);
        deleteButton = itemView.findViewById(R.id.save_delete_button);
        editButton = itemView.findViewById(R.id.save_edit_button);
        renameButton = itemView.findViewById(R.id.save_rename_button);
    }

    public void initView(TreasurePreview treasurePreview){
        name.setText(treasurePreview.getName());
        price.setText(Double.toString(treasurePreview.getPo()));
        nbItem.setText(Integer.toString(treasurePreview.getNbItem()));
    }

    public void setButtonsListeners(final TreasurePreviewRecyclerViewAdapter treasurePreviewRecyclerViewAdapter){
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treasurePreviewRecyclerViewAdapter.deleteSave(getAdapterPosition());
            }
        });

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treasurePreviewRecyclerViewAdapter.editSave(getAdapterPosition());
            }
        });

        renameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treasurePreviewRecyclerViewAdapter.renameSave(getAdapterPosition());
            }
        });
    }
}
