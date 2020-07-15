package com.wolveswithsword.pathfindergeneratorapp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.ArrayList;

public class StringRecyclerView extends RecyclerView.Adapter<StringViewHolder> {

    ArrayList<String> allMsg;

    public StringRecyclerView(ArrayList<String> allMsg){
        this.allMsg = allMsg;
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.string_layout, parent, false);
        return new StringViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        holder.setText(allMsg.get(position));
    }

    @Override
    public int getItemCount() {
        return allMsg.size();
    }
}