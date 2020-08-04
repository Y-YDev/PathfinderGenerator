package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.weapon.Material;
import item.weapon.Munition;
import item.weapon.RangeWeapon;
import item.weapon.Type;
import item.weapon.Weapon;

public class WeaponViewHolder extends ItemViewHolder {

    LinearLayout materialLayout;
    LinearLayout alterationLayout;
    LinearLayout propSpeLayout;
    LinearLayout propPartLayout;
    LinearLayout quantityLayout;
    LinearLayout munitionLayout;

    TextView name;
    TextView alteration;
    TextView material;
    TextView propSpe1;
    TextView propSpe2;
    TextView propPart;
    TextView quantity;
    TextView price;
    TextView weight;

    TextView munName;
    TextView munPrice;
    TextView munWeight;
    TextView munQuantity;

    public WeaponViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.wea_name);
        price = itemView.findViewById(R.id.wea_price);
        alteration = itemView.findViewById(R.id.wea_alteration);
        material = itemView.findViewById(R.id.wea_material);
        propSpe1 = itemView.findViewById(R.id.wea_propspe1);
        propSpe2 = itemView.findViewById(R.id.wea_propspe2);
        propPart = itemView.findViewById(R.id.wea_partispe);
        quantity = itemView.findViewById(R.id.wea_onlyquantity);
        weight = itemView.findViewById(R.id.wea_weigth);

        munName = itemView.findViewById(R.id.wea_mun);
        munPrice = itemView.findViewById(R.id.wea_munprice);
        munWeight = itemView.findViewById(R.id.wea_munweight);
        munQuantity = itemView.findViewById(R.id.wea_quantity);

        image = itemView.findViewById(R.id.wea_image);
        delete = itemView.findViewById(R.id.wea_delete);

        materialLayout = itemView.findViewById(R.id.wea_material_layout);
        alterationLayout = itemView.findViewById(R.id.wea_alteration_layout);
        propSpeLayout = itemView.findViewById(R.id.wea_propspe_layout);
        propPartLayout = itemView.findViewById(R.id.wea_partispe_layout);
        quantityLayout = itemView.findViewById(R.id.wea_onlyquantity_layout);
        munitionLayout = itemView.findViewById(R.id.wea_mun_layout);
    }

    public void setWeapon(Weapon weapon){
        name.setText(weapon.getName());

        //Alteration de l'arme
        if(weapon.getAlteration() == -1 || weapon.getAlteration() == 0){
            alterationLayout.setVisibility(View.GONE);
        }
        else if(weapon.getAlteration() == -2){
            alterationLayout.setVisibility(View.VISIBLE);
            alteration.setText("de maître");
        }
        else{
            alterationLayout.setVisibility(View.VISIBLE);
            alteration.setText(Integer.toString(weapon.getAlteration()));
        }

        //Materiel
        if(weapon.getMaterial() == Material.NOTHING || weapon.getMaterial() == null){
            materialLayout.setVisibility(View.GONE);
        }
        else{
            materialLayout.setVisibility(View.VISIBLE);
            material.setText(weapon.getMaterial().toString());
        }

        //Propriété spéciale
        if(weapon.getSpecialPropertie1().getName() != "_"){
            propSpeLayout.setVisibility(View.VISIBLE);
            propSpe1.setText(weapon.getSpecialPropertie1().getName());

            if(weapon.getSpecialPropertie2().getName() != "_"){
                propSpe2.setVisibility(View.VISIBLE);
                propSpe2.setText(weapon.getSpecialPropertie2().getName());
            }
            else{
                propSpe2.setVisibility(View.GONE);
            }
        }
        else{
            propSpeLayout.setVisibility(View.GONE);
        }

        //Propriété particulière
        if(weapon.getParticularPropertie() != "_"){
            propPartLayout.setVisibility(View.VISIBLE);
            propPart.setText(weapon.getParticularPropertie());
        }
        else{
            propPartLayout.setVisibility(View.GONE);
        }

        price.setText(weapon.getPrice()+" po");
        weight.setText(weapon.getWeight()+" kg");

        if(weapon.getType() == Type.DIST){
            image.setImageResource(R.drawable.bow_image);
            quantityLayout.setVisibility(View.GONE);

            if(((RangeWeapon)weapon).getMunition().getQuantity() != 0){
                munitionLayout.setVisibility(View.VISIBLE);
                munName.setText(((RangeWeapon) weapon).getMunition().getName());
                munPrice.setText(((RangeWeapon) weapon).getMunition().getPrice()+" po");
                munQuantity.setText(Integer.toString(((RangeWeapon) weapon).getMunition().getQuantity()));
                munWeight.setText(((RangeWeapon) weapon).getMunition().getWeight()+" kg");
            }
            else{
                munitionLayout.setVisibility(View.GONE);
            }
        }
        else if(weapon.getType() == Type.MUN){
            munitionLayout.setVisibility(View.GONE);
            quantityLayout.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.arrow_image);

            quantity.setText(Integer.toString(((Munition)weapon).getQuantity()));
        }
        else{
            munitionLayout.setVisibility(View.GONE);
            quantityLayout.setVisibility(View.GONE);
            image.setImageResource(R.drawable.weapon_image);
        }
    }
}
