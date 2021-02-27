package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.ArmorViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.ArtItemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.CoinViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.GemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.ItemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.JewelViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.ParchmentViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.PotionViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.RingViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.ScepterViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.StaffViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.WandViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.WeaponViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item.WonderfulItemViewHolder;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;

import java.util.ArrayList;

import generator.TreasureBuilder;
import item.Item;
import item.TypeItem;
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
import utility.Tools;

public class RewardRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Item> rewardList;
    TextView priceField;
    TreasureBuilder treasureBuilder;

    private boolean hasChanges;//Des changements à sauvegarder.

    public RewardRecyclerViewAdapter(){
        rewardList = new ArrayList<>();
        this.treasureBuilder = new TreasureBuilder();
        hasChanges = false;
    }

    public ArrayList<Item> getRewardList(){
        return this.rewardList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //En fonction du viewType on créer le viewHolder adapté.
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
        return item.getTypeItem().getID();//On récupère l'ID de l'item.
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //On affecte l'item en fonction du viewType
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

    /**
     * Permet de mettre à jour les données du recycler view
     * @param items : les nouveaux items.
     */
    public void updateData(ArrayList<Item> items) {
        rewardList.clear();
        rewardList.addAll(items);
        notifyDataSetChanged();
        updatePricesFields();//On met à jour.

    }

    /**
     * Permet de retirer un item
     * @param position : la position de l'item a retirer
     */
    public void removeItem(int position){
        if(position<0) return; //correctif bug appuis multiple supression item

        rewardList.remove(position);

        notifyItemRemoved(position);
        notifyItemRangeChanged(position,rewardList.size());

        updatePricesFields();//On doit mettre à jour les textView des prix

        hasChanges = true;
    }

    /**
     * Permet d'ajouter un item (à la fin)
     * @param item : l'item à ajouter
     */
    public void addItem(Item item){
        rewardList.add(item);

        //notifyItemInserted(getItemCount());
        updatePricesFields();//On doit mettre à jour les textView des prix

        if(item.getTypeItem() == TypeItem.COIN){//Réunion des pièces
            ArrayList<Item> temp = new ArrayList<>(rewardList);
            rewardList.clear();
            rewardList.addAll(treasureBuilder.gatherCoin(temp));
        }
        notifyDataSetChanged();
        hasChanges = true;
    }

    /**
     * Supprime toutes la liste des items.
     */
    public void deleteAll(){
        rewardList.clear();
        notifyDataSetChanged();
        updatePricesFields();
        hasChanges = true;
    }

    /**
     * Permet de renvoyer le prix réel total du trésor.
     * @return le prix total du trésor.
     */
    public double getTotalPriceOfItems(){
        double res = 0;

        for(Item item : rewardList){
            res += item.getPrice();
        }
        return res;
    }

    public void setPriceField(TextView priceField){
        this.priceField = priceField;
    }

    /**
     * Met à jour les textView avec le prix actuel.
     */
    private void updatePricesFields(){
        if(priceField != null)
            priceField.setText(Double.toString(Tools.truncateTo(getTotalPriceOfItems(),2))+" "+ AppObject.getRessource().getString(R.string.gp));
    }


    public void setHasChanges(boolean value){
        hasChanges = value;
    }

    /**
     * Renvoie true ou false selon qu'il y a eu des changements.
     * @return
     */
    public boolean hasChanges(){
        return hasChanges;
    }
}
