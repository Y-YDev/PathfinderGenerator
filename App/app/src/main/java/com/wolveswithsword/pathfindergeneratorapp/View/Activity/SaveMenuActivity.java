package com.wolveswithsword.pathfindergeneratorapp.View.Activity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.RewardRecyclerViewAdapter;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview.TreasurePreviewRecyclerViewAdapter;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.Constants;

import java.util.ArrayList;

import generator.TreasurePreview;
import save.HandlerTreasureSave;

public class SaveMenuActivity extends AppCompatActivity {

    ArrayList<TreasurePreview> saveList;
    HandlerTreasureSave handler;

    RecyclerView saveRecyclerView;
    TreasurePreviewRecyclerViewAdapter saveRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_loader);

        saveRecyclerView = findViewById(R.id.save_list);

        handler = new HandlerTreasureSave(getFilesDir().getAbsolutePath()+ Constants.SAVES);
        saveList = handler.getPreviewList();

        saveRecyclerViewAdapter = new TreasurePreviewRecyclerViewAdapter(saveList, handler, this);
        saveRecyclerView.setAdapter(saveRecyclerViewAdapter);

        saveRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //Créer la fenetre de dialogue pour le nom de la sauvegarde.
    public static void createSave(Context context,
                                  final RewardRecyclerViewAdapter rewardRecyclerViewAdapter,
                                  final HandlerTreasureSave handler){

        //Creation de la vue du dialog.
        final EditText input = new EditText(context);
        final TextView errorField = new TextView(context);
        errorField.setTextColor(Color.RED);

        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        //Paramètre pour les marge ect.
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams. MATCH_PARENT ,
                LinearLayout.LayoutParams. WRAP_CONTENT ) ;
        layoutParams.setMargins( 50 , 20 , 50 , 20 ) ;

        linearLayout.addView(input,layoutParams);

        layoutParams.setMargins(50,0,50,0);
        linearLayout.addView(errorField, layoutParams);

        //Création de la fenetre de dialogue.
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Nom de la sauvegarde :");
        builder.setView(linearLayout);

        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        final AlertDialog dialog = builder.create();

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                //Override du onclick listener pour ne pas fermer après appuie sur ok si erreur.
                Button button = ((AlertDialog) dialog).getButton(AlertDialog.BUTTON_POSITIVE);
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if(TextUtils.isEmpty(input.getText())){
                            errorField.setText("Le nom de la sauvegarde ne peut pas être vide.");
                        }
                        else if(handler.alreadyExist(input.getText().toString())){
                            errorField.setText("Ce nom de sauvegarde existe déjà.");
                        }
                        else{

                            TreasurePreview treasurePreview = new TreasurePreview();
                            treasurePreview.setName(input.getText().toString());
                            treasurePreview.setPo(rewardRecyclerViewAdapter.getTotalPriceOfItems());
                            treasurePreview.setNbItem(rewardRecyclerViewAdapter.getItemCount());

                            handler.saveTreasure(
                                    rewardRecyclerViewAdapter.getRewardList(),
                                    treasurePreview
                            );

                            dialog.dismiss();
                        }
                    }
                });
            }
        });
        dialog.show();//Affichage de la fenetre.
    }
}
