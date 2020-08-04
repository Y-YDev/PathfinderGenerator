package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.staff.Staff;

public class StaffViewHolder extends ItemViewHolder {

    TextView name;
    TextView price;
    TextView propPart;

    LinearLayout propPartLayout;

    public StaffViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.staff_name);
        price = itemView.findViewById(R.id.staff_price);
        propPart = itemView.findViewById(R.id.staff_part);
        propPartLayout = itemView.findViewById(R.id.staff_part_layout);

        image = itemView.findViewById(R.id.staff_image);
        delete = itemView.findViewById(R.id.staff_delete);

    }


    public void setStaff(Staff staff){
        name.setText(staff.getName());
        price.setText(staff.getPrice()+" po");

        if(staff.isParticularPropertie()){
            propPartLayout.setVisibility(View.VISIBLE);
            propPart.setText("Indice");
        }
        else{
            propPartLayout.setVisibility(View.GONE);
        }

        image.setImageResource(R.drawable.staff_image);
    }

}
