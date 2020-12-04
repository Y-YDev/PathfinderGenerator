package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.StringViewHolder;

import java.util.ArrayList;

import generator.TreasurePreview;

public class TreasurePreviewRecyclerViewAdapter extends RecyclerView.Adapter<TreasurePreviewViewHolder> {

    ArrayList<TreasurePreview> treasurePreviews;

    public TreasurePreviewRecyclerViewAdapter(ArrayList<TreasurePreview> treasurePreviews){
        this.treasurePreviews = treasurePreviews;
    }

    @NonNull
    @Override
    public TreasurePreviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_preview, parent, false);
        return new TreasurePreviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TreasurePreviewViewHolder holder, int position) {
        holder.initView(treasurePreviews.get(position));
    }

    @Override
    public int getItemCount() {
        return treasurePreviews.size();
    }
}
