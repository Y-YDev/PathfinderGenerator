package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Listener.SmartItemButtonListener;

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
        price.setText(wonderfulObject.getPrice()+" "+context.getString(R.string.gp));
        location.setText(wonderfulObject.getTypeWonder().toString());

        if(wonderfulObject.isParticularPropertie()){
            partPropLayout.setVisibility(View.VISIBLE);
            partProp.setText(R.string.hint);
        }
        else{
            partPropLayout.setVisibility(View.GONE);
        }

        if(wonderfulObject.getSmartItem() != null){
            smartItemLayout.setVisibility(View.VISIBLE);
            smartItem.setOnClickListener(new SmartItemButtonListener(context,wonderfulObject.getSmartItem()));
        }
        else{
            smartItemLayout.setVisibility(View.GONE);
        }

        switch (wonderfulObject.getTypeWonder()){
            case BODY:
                image.setImageResource(R.drawable.item_body_image);
                break;
            case EYES:
                image.setImageResource(R.drawable.item_eyes_image);
                break;
            case FEET:
                image.setImageResource(R.drawable.item_feet_image);
                break;
            case HEAD:
                image.setImageResource(R.drawable.item_head_image);
                break;
            case NECK:
                image.setImageResource(R.drawable.item_neck_image);
                break;
            case HANDS:
                image.setImageResource(R.drawable.item_hands_image);
                break;
            case TORSO:
                image.setImageResource(R.drawable.item_torso_image);
                break;
            case WAIST:
                image.setImageResource(R.drawable.item_waist_image);
                break;
            case WRIST:
                image.setImageResource(R.drawable.item_wrist_image);
                break;
            case FOREHEAD:
                image.setImageResource(R.drawable.item_forehead_image);
                break;
            case SHOULDERS:
                image.setImageResource(R.drawable.item_shoudler_image);
                break;
            case WITHOUT_LOCATION:
                image.setImageResource(R.drawable.item_without_loc_image);
                break;
            case NONE:
                image.setImageResource(R.drawable.ic_launcher_foreground);
                break;
        }
    }
}
