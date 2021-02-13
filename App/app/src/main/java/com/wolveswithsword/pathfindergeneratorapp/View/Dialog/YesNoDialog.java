package com.wolveswithsword.pathfindergeneratorapp.View.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.wolveswithsword.pathfindergeneratorapp.R;

public class YesNoDialog extends AppCompatDialogFragment {

    private TextView titleTV;
    private TextView textTV;
    private Button OKButton;
    private Button cancelButton;
    private YesNoDialogListener listener;

    int position;//Use for the position in recycler view
    String title = "TITLE";
    String text = "TEXT";

    //CONSTRUCTOR
    public YesNoDialog(int position, String title, String text){
        this.position = position;
        this.title = title;
        this.text = text;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.yes_no_dialog,null);

        titleTV = view.findViewById(R.id.dialog_title);
        textTV = view.findViewById(R.id.dialog_text);

        titleTV.setText(title);
        textTV.setText(text);

        OKButton = view.findViewById(R.id.OK_button);
        cancelButton = view.findViewById(R.id.cancel_button);

        //Affectation de la vue
        builder.setView(view);

        final Dialog dialog = builder.create();

        OKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.action(true, position);
                dialog.dismiss();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.action(false,position);
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
            listener = (YesNoDialog.YesNoDialogListener) context;
        } catch (ClassCastException e) {
            throw  new ClassCastException(context.toString() + "must implement YesNoDialogListener");
        }
    }

    public interface YesNoDialogListener{
        void action(boolean doAction, int position);
    }

}
