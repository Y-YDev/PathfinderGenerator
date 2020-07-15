package com.wolveswithsword.pathfindergeneratorapp.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

import item.coin.Coin;

public class CoinViewHolder extends RecyclerView.ViewHolder {
    private TextView coin_quantity;
    private TextView coin_type;
    private ImageView image;

    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);
        coin_quantity = itemView.findViewById(R.id.coin_quantity);
        coin_type = itemView.findViewById(R.id.coin_type);
        image = itemView.findViewById(R.id.coin_image);
    }

    public void setCoin(Coin coin){
        coin_quantity.setText(Double.toString(coin.getPrice()));
        coin_type.setText(coin.getTypeCoin().toString());

        switch (coin.getTypeCoin()){
            case GOLD:
                image.setImageResource(R.drawable.gold_image);
                break;
            case COPPER:
                image.setImageResource(R.drawable.copper_image);
                break;
            case SILVER:
                image.setImageResource(R.drawable.silver_image);
                break;
            case PLATINIUM:
                image.setImageResource(R.drawable.platinium_image);
                break;
            default:
                break;
        }
    }
}
