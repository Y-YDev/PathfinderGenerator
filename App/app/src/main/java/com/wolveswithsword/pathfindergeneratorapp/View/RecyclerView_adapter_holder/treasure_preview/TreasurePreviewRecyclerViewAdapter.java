package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import java.util.ArrayList;

import generator.TreasurePreview;
import save.HandlerTreasureSave;

public class TreasurePreviewRecyclerViewAdapter extends RecyclerView.Adapter<TreasurePreviewViewHolder> {

    ArrayList<TreasurePreview> treasurePreviews;
    HandlerTreasureSave handler;
    Context context;

    public TreasurePreviewRecyclerViewAdapter(ArrayList<TreasurePreview> treasurePreviews,
                                              HandlerTreasureSave handler,
                                              Context context){
        this.treasurePreviews = treasurePreviews;
        this.handler = handler;
        this.context = context;
    }

    @NonNull
    @Override
    public TreasurePreviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_preview, parent, false);
        return new TreasurePreviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TreasurePreviewViewHolder holder, int position) {
        holder.initView(treasurePreviews.get(position), handler);
        holder.setDeleteButtonListener(this);//Listener du bouton de suppression
    }

    @Override
    public int getItemCount() {
        return treasurePreviews.size();
    }


    public void deleteSave(final int position){
        if(position<0) return; //correctif bug appuis multiple supression item

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Supprimer ?");
        builder.setMessage("Voulez-vous vraiment supprimer la sauvegarde ?");

        builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(handler.deleteSaveFile(treasurePreviews.get(position))){//Suppression du fichier
                    treasurePreviews.remove(position);//Supression de la vue
                    notifyItemRemoved(position);
                    notifyItemRangeChanged(position,treasurePreviews.size());
                }
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();//Affichage de la fenetre.
    }
}
