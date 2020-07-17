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

import item.wonderfulObject.WonderfulObject;

public class WonderfulItemViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;
    TextView location;
    TextView partProp;

    LinearLayout partPropLayout;
    LinearLayout smartItemLayout;

    Button smartItem;
    Context context;

    public WonderfulItemViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.wond_name);
        price = itemView.findViewById(R.id.wond_price);
        location = itemView.findViewById(R.id.wond_type);
        partProp = itemView.findViewById(R.id.wond_part);

        partPropLayout = itemView.findViewById(R.id.wond_part_layout);
        smartItemLayout = itemView.findViewById(R.id.wond_smartitem_layout);

        image = itemView.findViewById(R.id.wond_image);
        delete = itemView.findViewById(R.id.wond_delete);

        smartItem = itemView.findViewById(R.id.wond_smartitem);

        context = itemView.getContext();
    }

    public void setWonderfulItem(WonderfulObject wonderfulObject){
        name.setText(wonderfulObject.getName());
        price.setText(wonderfulObject.getPrice()+" po");
        location.setText(wonderfulObject.getType().toString());

        if(wonderfulObject.isParticularPropertie()){
            partPropLayout.setVisibility(View.VISIBLE);
            partProp.setText("Indice");
        }
        else{
            partPropLayout.setVisibility(View.GONE);
        }

        if(wonderfulObject.getSmartItem() != null){
            smartItemLayout.setVisibility(View.VISIBLE);
            smartItem.setOnClickListener(new SmartItemShowButton((RewardActivity) context,wonderfulObject.getSmartItem()));
        }
        else{
            smartItemLayout.setVisibility(View.GONE);
        }

        switch (wonderfulObject.getType()){
            case BODY:
                image.setImageResource(R.drawable.body_image);
                break;
            case EYES:
                image.setImageResource(R.drawable.eyes_image);
                break;
            case FEET:
                image.setImageResource(R.drawable.feet_image);
                break;
            case HEAD:
                image.setImageResource(R.drawable.head_image);
                break;
            case NECK:
                image.setImageResource(R.drawable.neck_image);
                break;
            case HANDS:
                image.setImageResource(R.drawable.hands_image);
                break;
            case TORSO:
                image.setImageResource(R.drawable.torso_image);
                break;
            case WAIST:
                image.setImageResource(R.drawable.waist_image);
                break;
            case WRIST:
                image.setImageResource(R.drawable.wrist_image);
                break;
            case FOREHEAD:
                image.setImageResource(R.drawable.forehead_image);
                break;
            case SHOULDERS:
                image.setImageResource(R.drawable.shoudler_image);
                break;
            case WITHOUT_LOCATION:
                image.setImageResource(R.drawable.without_loc_image);
                break;
            case NONE:
                image.setImageResource(R.drawable.ic_launcher_foreground);
                break;
        }
    }
}
