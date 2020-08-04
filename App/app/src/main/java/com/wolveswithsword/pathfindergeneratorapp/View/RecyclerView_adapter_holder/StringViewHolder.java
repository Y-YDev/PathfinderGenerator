package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;

public class StringViewHolder extends RecyclerView.ViewHolder {

    TextView text;

    public StringViewHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.id_textview);
    }

    public void setText(String msg){
        text.setText(msg);
    }
}
