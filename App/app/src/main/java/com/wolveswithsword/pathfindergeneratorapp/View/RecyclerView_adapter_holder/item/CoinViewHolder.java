package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.coin.Coin;

public class CoinViewHolder extends ItemViewHolder {
    private TextView coin_quantity;
    private TextView coin_type;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);
        coin_quantity = itemView.findViewById(R.id.coin_quantity);
        coin_type = itemView.findViewById(R.id.coin_type);
        image = itemView.findViewById(R.id.coin_image);
        delete = itemView.findViewById(R.id.coin_delete);
    }

    public void setCoin(Coin coin){
        coin_quantity.setText(Integer.toString(coin.getQuantity()));
        coin_type.setText(coin.getTypeCoin().toString());

        switch (coin.getTypeCoin()){
            case GOLD:
                image.setImageResource(R.drawable.item_gold_image);
                break;
            case COPPER:
                image.setImageResource(R.drawable.item_copper_image);
                break;
            case SILVER:
                image.setImageResource(R.drawable.item_silver_image);
                break;
            case PLATINIUM:
                image.setImageResource(R.drawable.item_platinium_image);
                break;
            default:
                break;
        }
    }

}
