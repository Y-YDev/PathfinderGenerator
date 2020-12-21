package com.wolveswithsword.pathfindergeneratorapp.View.Listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.wolveswithsword.pathfindergeneratorapp.View.Activity.SmartItemActivity;

import item.smartItem.SmartItem;

/**
 * Listener du bouton pour afficher un objet intelligent.
 */
public class SmartItemButtonListener implements View.OnClickListener {

    Context context;
    SmartItem smartItem;

    public SmartItemButtonListener(Context context, SmartItem smartItem){
        this.context = context;
        this.smartItem = smartItem;
    }

    /**
     * Créer un intent vers la page d'affichage de smart item
     * @param smartItem : l'objet intelligent
     */
    private void smartItemIntent(SmartItem smartItem){
        Intent intent = new Intent(context, SmartItemActivity.class);
        intent.putExtra("smartItem",smartItem);
        context.startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        smartItemIntent(smartItem);
    }
}
