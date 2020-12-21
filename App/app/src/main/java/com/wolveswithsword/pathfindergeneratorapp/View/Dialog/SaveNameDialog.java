package com.wolveswithsword.pathfindergeneratorapp.View.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.wolveswithsword.pathfindergeneratorapp.R;

import save.HandlerTreasureSave;

public class SaveNameDialog extends AppCompatDialogFragment {

    private EditText editTextSaveName;
    private TextView errorText;
    private SaveNameDialogListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.save_name_catcher,null);

        //Affectation de la vue
        builder.setView(view)
                .setTitle("Sauvegarde :")
                .setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        editTextSaveName = view.findViewById(R.id.input_name);
        errorText = view.findViewById(R.id.error_field);

        final Dialog dialog = builder.create();

        //Permet de fermer quand on le veut. (sorte d'override)
        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                //Override du onclick listener pour ne pas fermer après appuie sur ok si erreur.
                Button button = ((AlertDialog) dialog).getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE);
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        if(TextUtils.isEmpty(editTextSaveName.getText())){
                            errorText.setText("Le nom de la sauvegarde ne peut pas être vide.");
                        }
                        else if(HandlerTreasureSave.getInstance().alreadyExist(editTextSaveName.getText().toString())){
                            errorText.setText("Ce nom de sauvegarde existe déjà.");
                        }
                        else {
                            String saveName = editTextSaveName.getText().toString();

                            listener.saveTreasure(saveName);

                            dialog.dismiss();
                        }
                    }
                });
            }
        });

        return dialog;
    }

    //On récupère le listener pour l'implémentation de la sauvegarde.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listener = (SaveNameDialogListener) context;
        } catch (ClassCastException e) {
            throw  new ClassCastException(context.toString() + "must implement SaveNameDialogListener");
        }
    }

    public interface SaveNameDialogListener{
        void saveTreasure(String saveName);
    }
}
