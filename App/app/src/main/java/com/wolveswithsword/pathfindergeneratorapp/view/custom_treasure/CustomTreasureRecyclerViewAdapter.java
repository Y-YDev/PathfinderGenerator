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
import utility.Debug;
import utility.Tuple;

public class CustomTreasureRecyclerViewAdapter extends RecyclerView.Adapter<CustomTreasureViewHolder> {

    ArrayList<Treasure> treasuresList;
    ArrayList<CustomTreasureViewHolder> holderList;
    TreasureBuilder treasureBuilder;

    public CustomTreasureRecyclerViewAdapter(ArrayList<Treasure> treasuresList){
        holderList = new ArrayList<>();
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


    @Override
    public void onViewRecycled(@NonNull CustomTreasureViewHolder holder) {
        //TODO enregistrer hors des viewHolder les information ou remplacer par une listView
        Debug.debug("value : "+holder.getPoInput() +" : "+holder.getLayoutPosition());
        super.onViewRecycled(holder);
    }

    /**
     * Regarde si l'input des po est correct.
     * @return true ou false selon que l'input est valide ou non.
     */
    public boolean checkIfCorrectInput(){
        boolean res = true;
        //La somme est trop élévée
        for(CustomTreasureViewHolder holder : holderList) {
            if (holder.getPoInput() > 1000000) {
                holder.setError("La somme d'argent doit être inférieure à 1 000 000 po...");
                res = false;
            }
        }
        return res;
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

    /**
     * Récupere les prix donnés à tout les trésors
     * @return
     */
    public ArrayList<Double> getPrices(){
        ArrayList<Double> res = new ArrayList<Double>();

        for(CustomTreasureViewHolder holder : holderList){
            res.add(holder.getPoInput());
        }
        return res;
    }

    @Override
    public int getItemCount() {
        return treasuresList.size();
    }
}
