package com.wolveswithsword.pathfindergeneratorapp.View.Dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.wolveswithsword.pathfindergeneratorapp.R;

public class TreasureTableDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Dialog treasureDialog = new Dialog(getActivity());
        treasureDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        treasureDialog.setContentView(R.layout.treasure_table_layout);
        //Fond transparant
        treasureDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        Button closeButton = treasureDialog.findViewById(R.id.close_treasure_table);

        closeButton.setEnabled(true);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                treasureDialog.cancel();
            }
        });

        return treasureDialog;
    }
}
