package com.wolveswithsword.pathfindergeneratorapp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.view.item.ArmorViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.ArtItemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.CoinViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.GemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.ItemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.JewelViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.ParchmentViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.PotionViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.RingViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.ScepterViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.StaffViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.WandViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.WeaponViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.view.item.WonderfulItemViewHolder;

import java.util.ArrayList;

import item.Item;
import item.armor.ArmorShield;
import item.artItem.ArtItem;
import item.coin.Coin;
import item.gemAndJewel.Gem;
import item.gemAndJewel.Jewel;
import item.parchment.Parchment;
import item.potion.Potion;
import item.ring.Ring;
import item.scepter.Scepter;
import item.staff.Staff;
import item.wand.Wand;
import item.weapon.Weapon;
import item.wonderfulObject.WonderfulObject;

public class RewardRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Item> rewardList;

    public RewardRecyclerView(){
        rewardList = new ArrayList<>();
    }
    public RewardRecyclerView( ArrayList<Item> rewardList){
        this.rewardList = rewardList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == 1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coinlayout, parent, false);
            return new CoinViewHolder(view);
        }
        else if(viewType == 2){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.armorlayout, parent, false);
            return new ArmorViewHolder(view);
        }
        else if (viewType == 3){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artitemlayout, parent, false);
            return new ArtItemViewHolder(view);
        }
        else if (viewType == 4){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gemlayout, parent, false);
            return new GemViewHolder(view);
        }
        else if (viewType == 5){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jewellayout, parent, false);
            return new JewelViewHolder(view);
        }
        else if (viewType == 6){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parchmentlayout, parent, false);
            return new ParchmentViewHolder(view);
        }
        else if (viewType == 7){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.potionlayout, parent, false);
            return new PotionViewHolder(view);
        }
        else if (viewType == 8){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ringlayout, parent, false);
            return new RingViewHolder(view);
        }
        else if (viewType == 9){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.scepterlayout, parent, false);
            return new ScepterViewHolder(view);
        }
        else if (viewType == 10){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stafflayout, parent, false);
            return new StaffViewHolder(view);
        }
        else if (viewType == 11){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wandlayout, parent, false);
            return new WandViewHolder(view);
        }
        else if (viewType == 12){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weaponlayout, parent, false);
            return new WeaponViewHolder(view);
        }
        else if (viewType == 13){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wonderfullitemlayout, parent, false);
            return new WonderfulItemViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coinlayout, parent, false);
        return new CoinViewHolder(view);
    }

    @Override
    public int getItemViewType(int position){
        Item item = rewardList.get(position);
        return item.getTypeItem().getID();
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder.getItemViewType() == 1){
            ((CoinViewHolder) holder).setCoin((Coin) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 2){
            ((ArmorViewHolder) holder).setArmor((ArmorShield) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 3){
            ((ArtItemViewHolder) holder).setArtItem((ArtItem) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 4){
            ((GemViewHolder) holder).setGem((Gem) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 5){
            ((JewelViewHolder) holder).setJewel((Jewel) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 6){
            ((ParchmentViewHolder) holder).setParchment((Parchment) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 7){
            ((PotionViewHolder) holder).setPotion((Potion) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 8){
            ((RingViewHolder) holder).setRing((Ring) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 9){
            ((ScepterViewHolder) holder).setScepter((Scepter) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 10){
            ((StaffViewHolder) holder).setStaff((Staff) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 11){
            ((WandViewHolder) holder).setWand((Wand) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 12){
            ((WeaponViewHolder) holder).setWeapon((Weapon) rewardList.get(position));
        }
        else if(holder.getItemViewType() == 13){
            ((WonderfulItemViewHolder) holder).setWonderfulItem((WonderfulObject) rewardList.get(position));
        }

        ((ItemViewHolder) holder).setDeleteButtonListener(this);
    }

    @Override
    public int getItemCount() {
        return rewardList.size();
    }

    public void updateData(ArrayList<Item> items) {
        rewardList.clear();
        rewardList.addAll(items);
        notifyDataSetChanged();
    }

    public void removeItem(int position){
        rewardList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,rewardList.size());
    }
}
