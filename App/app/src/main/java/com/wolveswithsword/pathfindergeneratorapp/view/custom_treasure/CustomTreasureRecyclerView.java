package com.wolveswithsword.pathfindergeneratorapp.view.custom_treasure;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import java.util.ArrayList;

import generator.ProbabilityType;
import generator.Treasure;
import generator.TreasureBuilder;
import item.Item;

public class CustomTreasureRecyclerView extends RecyclerView.Adapter<CustomTreasureViewHolder> {

    ArrayList<Treasure> treasuresList;
    ArrayList<CustomTreasureViewHolder> holderList;
    TreasureBuilder treasureBuilder;

    public CustomTreasureRecyclerView(ArrayList<Treasure> treasuresList){
        this.treasuresList = treasuresList;
        this.treasureBuilder = new TreasureBuilder();
    }

    @NonNull
    @Override
    public CustomTreasureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.treasure_elements, parent, false);
        return new CustomTreasureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomTreasureViewHolder holder, int position) {
        Treasure treasure = treasuresList.get(position);
        holder.setSpinner(ProbabilityType.toArray());
        holder.setNameField(treasure.getType().toString());
        holderList.add(holder);
    }

    public boolean checkIfCorrectInput(){
        boolean res = true;

        for(CustomTreasureViewHolder holder : holderList) {
            if (holder.getPoInput() == 0) {
                holder.setError("Veuillez renseigner une quantité d'argent...");
                res = false;
            }
            else if (holder.getPoInput() > 1000000) {
                holder.setError("La somme d'argent doit être inférieure à 1 000 000 po...");
                res = false;
            }
        }
        return res;
    }

    public ArrayList<Item> getCustomReward(){
        ArrayList<Item> rewards = new ArrayList<Item>();

        for(int i = 0; i < holderList.size(); i++) {
            rewards.addAll(treasureBuilder.createRandomReward(
                    treasuresList.get(i),
                    holderList.get(i).getProbabilitySelected(),
                    holderList.get(i).getPoInput()
            ));
        }

        return rewards;
    }

    @Override
    public int getItemCount() {
        return treasuresList.size();
    }
}
