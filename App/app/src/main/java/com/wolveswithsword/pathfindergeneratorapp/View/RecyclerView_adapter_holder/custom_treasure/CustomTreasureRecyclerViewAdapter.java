package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.custom_treasure;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.ArrayList;

import generator.TreasureElement;

public class CustomTreasureRecyclerViewAdapter extends RecyclerView.Adapter<CustomTreasureViewHolder> {

    private ArrayList<TreasureElement> treasureList;

    public void setTreasureList(ArrayList<TreasureElement> treasureList){
        this.treasureList = treasureList;
    }

    public ArrayList<TreasureElement> getTreasureList(){
        return treasureList;
    }

    @NonNull
    @Override
    public CustomTreasureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.treasure_elements, parent, false);
        return new CustomTreasureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomTreasureViewHolder holder, int position) {
        holder.initView(treasureList.get(position));
    }


    /**
     * Regarde si l'input des po est correct.
     * @return true ou false selon que l'input est valide ou non.
     */
    public boolean checkIfCorrectInput(){
        //La somme est trop élévée
        for(TreasureElement treasureElement : treasureList) {
            if (!treasureElement.checkCorrectValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int getItemCount() {
        return (null != treasureList ? treasureList.size() : 0);
    }
}
