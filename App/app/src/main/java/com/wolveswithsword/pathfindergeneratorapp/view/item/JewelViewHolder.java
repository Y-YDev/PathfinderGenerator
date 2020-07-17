package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.gemAndJewel.Jewel;

public class JewelViewHolder extends ItemViewHolder{

    TextView name;
    TextView price;
    TextView work;
    TextView material;
    TextView size;

    LinearLayout gemGradeN;
    TextView gemN;
    TextView gemNWork;

    LinearLayout gemGradeN2;
    TextView gemN2;
    TextView gemN2Work;
    TextView gemN2Number;

    LinearLayout gemGradeN3;
    TextView gemN3;
    TextView gemN3Work;
    TextView gemN3Number;

    public JewelViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.jewel_name);
        price = itemView.findViewById(R.id.jewel_price);
        work = itemView.findViewById(R.id.jewel_work);
        material = itemView.findViewById(R.id.jewel_material);
        size = itemView.findViewById(R.id.jewel_size);

        image = itemView.findViewById(R.id.jewel_image);
        delete = itemView.findViewById(R.id.jewel_delete);

        gemGradeN = itemView.findViewById(R.id.jewel_gemN_layout);
        gemN = itemView.findViewById(R.id.jewel_gem);
        gemNWork = itemView.findViewById(R.id.jewel_workgem);

        gemGradeN2 = itemView.findViewById(R.id.jewel_gemN_1_layout);
        gemN2 = itemView.findViewById(R.id.jewel_gem2);
        gemN2Work = itemView.findViewById(R.id.jewel_workgem2);
        gemN2Number = itemView.findViewById(R.id.jewel_number2);

        gemGradeN3 = itemView.findViewById(R.id.jewel_gemN_2_layout);
        gemN3 = itemView.findViewById(R.id.jewel_gem3);
        gemN3Work = itemView.findViewById(R.id.jewel_workgem3);
        gemN3Number = itemView.findViewById(R.id.jewel_number3);
    }

    public void setJewel(Jewel jewel){
        name.setText(jewel.getType().getName());
        price.setText(jewel.getPrice()+" po");
        work.setText(jewel.getWork().getName());
        material.setText(jewel.getMaterial().getName());
        size.setText(jewel.getSize().getName());

        image.setImageResource(R.drawable.jewel_image);

        if(jewel.getGemN() != null){
            gemGradeN.setVisibility(View.VISIBLE);
            gemN.setText(jewel.getGemN().getName());
            gemNWork.setText(jewel.getGemN().getCut().toString());
        }
        else{
            gemGradeN.setVisibility(View.GONE);
        }

        if(jewel.getGemN_1() != null){
            gemGradeN2.setVisibility(View.VISIBLE);
            gemN2.setText(jewel.getGemN_1().getX().getName());
            gemN2Work.setText(jewel.getGemN_1().getX().getCut().toString());
            gemN2Number.setText(Integer.toString(jewel.getGemN_1().getY()));
        }
        else{
            gemGradeN2.setVisibility(View.GONE);
        }

        if(jewel.getGemN_2() != null){
            gemGradeN3.setVisibility(View.VISIBLE);
            gemN3.setText(jewel.getGemN_2().getX().getName());
            gemN3Work.setText(jewel.getGemN_2().getX().getCut().toString());
            gemN3Number.setText(Integer.toString(jewel.getGemN_2().getY()));
        }
        else{
            gemGradeN3.setVisibility(View.GONE);
        }
    }
}
