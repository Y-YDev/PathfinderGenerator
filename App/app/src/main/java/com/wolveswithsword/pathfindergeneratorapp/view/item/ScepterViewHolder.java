package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.listener.SmartItemShowButton;
import com.wolveswithsword.pathfindergeneratorapp.view.RewardActivity;

import item.scepter.Scepter;
import item.scepter.Type;

public class ScepterViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;
    TextView propPart;
    TextView type;

    LinearLayout propPartLayout;
    LinearLayout smartItemLayout;
    LinearLayout typeLayout;

    Button smartItem;

    Context context;

    public ScepterViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.scepter_name);
        price = itemView.findViewById(R.id.scepter_price);
        propPart = itemView.findViewById(R.id.scepter_part);
        propPartLayout = itemView.findViewById(R.id.scepter_part_layout);

        image = itemView.findViewById(R.id.scepter_image);
        delete = itemView.findViewById(R.id.scepter_delete);

        smartItem = itemView.findViewById(R.id.scepter_smartitem);
        type = itemView.findViewById(R.id.scepter_type);
        typeLayout = itemView.findViewById(R.id.scepter_type_layout);
        smartItemLayout = itemView.findViewById(R.id.scepter_smartitem_layout);

        context = itemView.getContext();
    }

    public void setScepter(Scepter scepter){
        name.setText(scepter.getName());
        price.setText(scepter.getPrice()+" po");

        if(scepter.getType() != Type.NONE){
            typeLayout.setVisibility(View.VISIBLE);
            type.setText(scepter.getType().toString());
        }
        else {
            typeLayout.setVisibility(View.GONE);
        }


        if(scepter.isParticularPropertie()){
            propPartLayout.setVisibility(View.VISIBLE);
            propPart.setText("Indice");
        }
        else{
            propPartLayout.setVisibility(View.GONE);
        }

        image.setImageResource(R.drawable.scepter_image);

        if(scepter.getSmartItem() != null){
            smartItemLayout.setVisibility(View.VISIBLE);
            smartItem.setOnClickListener(new SmartItemShowButton((RewardActivity) context,scepter.getSmartItem()));
        }
        else{
            smartItemLayout.setVisibility(View.GONE);
        }
    }


}
