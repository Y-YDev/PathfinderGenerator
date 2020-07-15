package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.armor.ArmorShield;
import item.armor.Material;
import item.armor.Type;

public class ArmorViewHolder extends RecyclerView.ViewHolder{

    LinearLayout materialLayout;
    LinearLayout alterationLayout;
    LinearLayout propSpeLayout;

    TextView name;
    TextView alteration;
    TextView material;
    TextView propSpe1;
    TextView propSpe2;
    TextView price;
    TextView weight;

    ImageView image;

    public ArmorViewHolder(@NonNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.arm_name);
        alteration = itemView.findViewById(R.id.arm_alteration);
        material = itemView.findViewById(R.id.arm_material);
        propSpe1 = itemView.findViewById(R.id.arm_propspe1);
        propSpe2 = itemView.findViewById(R.id.arm_propspe2);
        price = itemView.findViewById(R.id.arm_price);
        weight = itemView.findViewById(R.id.arm_weight);

        materialLayout = itemView.findViewById(R.id.arm_material_layout);
        alterationLayout = itemView.findViewById(R.id.arm_alteration_layout);
        propSpeLayout = itemView.findViewById(R.id.arm_propspe_layout);

        image = itemView.findViewById(R.id.arm_image);
    }

    public void setArmor(ArmorShield armorShield){
        name.setText(armorShield.getName());

        //Alteration de l'arme
        if(armorShield.getAlteration() == -1 || armorShield.getAlteration() == 0){
            alterationLayout.setVisibility(View.GONE);
        }
        else if(armorShield.getAlteration() == -2){
            alterationLayout.setVisibility(View.VISIBLE);
            alteration.setText("de maître");
        }
        else{
            alterationLayout.setVisibility(View.VISIBLE);
            alteration.setText(Integer.toString(armorShield.getAlteration()));
        }

        //Materiel
        if(armorShield.getMaterial() == Material.NOTHING){
            materialLayout.setVisibility(View.GONE);
        }
        else{
            materialLayout.setVisibility(View.VISIBLE);
            material.setText(armorShield.getMaterial().toString());
        }

        //Propriété spéciale
        if(armorShield.getSpecialPropertie1().getName() != "_"){
            propSpeLayout.setVisibility(View.VISIBLE);
            propSpe1.setText(armorShield.getSpecialPropertie1().getName());

            if(armorShield.getSpecialPropertie2().getName() != "_"){
                propSpe2.setVisibility(View.VISIBLE);
                propSpe2.setText(armorShield.getSpecialPropertie2().getName());
            }
            else{
                propSpe2.setVisibility(View.GONE);
            }
        }
        else{
            propSpeLayout.setVisibility(View.GONE);
        }

        price.setText(armorShield.getPrice()+" po");
        weight.setText(armorShield.getWeight()+" kg");

        if(armorShield.getType() == Type.SHIELD){
            image.setImageResource(R.drawable.shield_image);
        }
        else{
            image.setImageResource(R.drawable.armor_image);
        }
    }
}
