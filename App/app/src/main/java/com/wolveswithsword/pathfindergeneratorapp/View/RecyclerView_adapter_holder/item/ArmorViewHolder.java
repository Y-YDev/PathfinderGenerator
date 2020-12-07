package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Listener.SmartItemButtonListener;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.Constants;

import item.armor.ArmorShield;
import item.armor.Material;
import item.armor.Type;

public class ArmorViewHolder extends ItemViewHolder{

    LinearLayout materialLayout;
    LinearLayout alterationLayout;
    LinearLayout propSpeLayout;
    LinearLayout smartItemLayout;

    TextView name;
    TextView alteration;
    TextView material;
    TextView propSpe1;
    TextView propSpe2;
    TextView price;
    TextView weight;

    Button smartItem;

    Context context;

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
        smartItemLayout = itemView.findViewById(R.id.armor_smartitem_layout);

        image = itemView.findViewById(R.id.arm_image);
        delete = itemView.findViewById(R.id.armor_delete);

        smartItem = itemView.findViewById(R.id.armor_smartitem);

        context = itemView.getContext();
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

        if(armorShield.getTypeArmor() == Type.SHIELD){
            image.setImageResource(R.drawable.shield_image);
        }
        else{
            image.setImageResource(R.drawable.armor_image);
        }

        //Smart Item
        if(armorShield.getSmartItem() != null){
            smartItemLayout.setVisibility(View.VISIBLE);
            smartItem.setOnClickListener(new SmartItemButtonListener(context,armorShield.getSmartItem()));
        }
        else{
            smartItemLayout.setVisibility(View.GONE);
        }
    }
}
