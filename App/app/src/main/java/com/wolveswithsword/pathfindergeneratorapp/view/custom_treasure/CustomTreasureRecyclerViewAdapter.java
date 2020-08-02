package com.wolveswithsword.pathfindergeneratorapp.view.custom_treasure;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.ArrayList;
import java.util.List;

import generator.ProbabilityType;
import generator.Treasure;
import generator.TreasureBuilder;
import generator.TreasureElement;
import utility.Debug;
import utility.Tuple;

public class CustomTreasureRecyclerViewAdapter extends RecyclerView.Adapter<CustomTreasureViewHolder> {

    private ArrayList<CustomTreasureViewHolder> holderList;

    private ArrayList<TreasureElement> treasureList;

    public CustomTreasureRecyclerViewAdapter(){
        holderList = new ArrayList<>();
    }

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



    /**
     * Récupere les probabilités de tout les trésors.
     * @return
     */
    public ArrayList<ProbabilityType> getProbabilityTypes(){
        ArrayList<ProbabilityType> res = new ArrayList<>();

        for(CustomTreasureViewHolder holder : holderList){
            res.add(holder.getProbabilitySelected());
        }
        return res;
    }


    @Override
    public int getItemCount() {
        return (null != treasureList ? treasureList.size() : 0);
    }
}
