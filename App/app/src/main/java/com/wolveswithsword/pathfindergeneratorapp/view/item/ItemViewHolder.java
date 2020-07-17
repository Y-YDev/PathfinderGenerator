package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.view.RewardRecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    protected ImageButton delete;//Tout les items ont un bouton de delete.
    protected ImageView image;//Image de l'item

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void setDeleteButtonListener(final RewardRecyclerView rewardRecyclerView) {
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rewardRecyclerView.removeItem(getAdapterPosition());
            }
        });
    }
}
