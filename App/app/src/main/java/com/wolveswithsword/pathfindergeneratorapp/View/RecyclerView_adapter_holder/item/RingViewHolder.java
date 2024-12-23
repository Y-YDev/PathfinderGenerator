package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Listener.SmartItemButtonListener;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;

import item.ring.Ring;

public class RingViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;
    TextView propPart;

    LinearLayout propPartLayout;
    LinearLayout smartItemLayout;

    Button smartItem;

    Context context;

    public RingViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.ring_name);
        price = itemView.findViewById(R.id.ring_price);
        propPart = itemView.findViewById(R.id.ring_part);
        propPartLayout = itemView.findViewById(R.id.ring_part_layout);

        image = itemView.findViewById(R.id.ring_image);
        delete = itemView.findViewById(R.id.ring_delete);

        smartItem = itemView.findViewById(R.id.ring_smartitem);
        smartItemLayout = itemView.findViewById(R.id.ring_smartitem_layout);

        context = itemView.getContext();
    }

    public void setRing(Ring ring){
        name.setText(ring.getName());
        price.setText(ring.getPrice()+" "+ context.getString(R.string.gp));

        if(ring.isParticularPropertie()){
            propPartLayout.setVisibility(View.VISIBLE);
            propPart.setText(R.string.hint);
        }
        else{
            propPartLayout.setVisibility(View.GONE);
        }

        image.setImageResource(R.drawable.item_ring_image);

        if(ring.getSmartItem() != null){
            smartItemLayout.setVisibility(View.VISIBLE);
            smartItem.setOnClickListener(new SmartItemButtonListener(context,ring.getSmartItem()));
        }
        else{
            smartItemLayout.setVisibility(View.GONE);
        }
    }
}
