package com.wolveswithsword.pathfindergeneratorapp.view.item;


import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.staff.Staff;

public class StaffViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView price;
    TextView propPart;

    LinearLayout propPartLayout;

    ImageView image;

    public StaffViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.staff_name);
        price = itemView.findViewById(R.id.staff_price);
        propPart = itemView.findViewById(R.id.staff_part);
        propPartLayout = itemView.findViewById(R.id.staff_part_layout);
        image = itemView.findViewById(R.id.staff_image);

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
