package com.wolveswithsword.pathfindergeneratorapp.View.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
    private Button OKButton;
    private Button cancelButton;
    private SaveNameDialogListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.save_dialog,null);

        editTextSaveName = view.findViewById(R.id.input_name);
        errorText = view.findViewById(R.id.error_field);
        OKButton = view.findViewById(R.id.OK_button);
        cancelButton = view.findViewById(R.id.cancel_button);

        //Affectation de la vue
        builder.setView(view);

        final Dialog dialog = builder.create();

        OKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editTextSaveName.getText())){
                    errorText.setText(R.string.error_save_empty_name);
                }
                else if(HandlerTreasureSave.getInstance().alreadyExist(editTextSaveName.getText().toString())){
                    errorText.setText(R.string.error_save_already_exist);
                }
                else {
                    String saveName = editTextSaveName.getText().toString();

                    listener.saveTreasure(saveName);

                    dialog.dismiss();
                }
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

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
