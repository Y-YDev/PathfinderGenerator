package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Listener.ItemSpinnerSelectedListener;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.RewardRecyclerViewAdapter;

import item.TypeItem;
import item.coin.Coin;
import item.coin.Type;

public class CustomItemGenerationActivity extends AppCompatActivity {

    RecyclerView rewardRecyclerView;
    RewardRecyclerViewAdapter rewardRecyclerViewAdapter;

    Button addButton;
    Spinner objectSpinner;
    Spinner raritySpinner;

    LinearLayout poField;
    EditText poInput;
    Spinner poTypeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_item_creation);

        addButton = findViewById(R.id.create_item_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemToRecyclerView();
            }
        });

        rewardRecyclerView = findViewById(R.id.reward_recyclerview);
        rewardRecyclerViewAdapter = new RewardRecyclerViewAdapter();
        rewardRecyclerView.setAdapter(rewardRecyclerViewAdapter);
        rewardRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        poField = findViewById(R.id.po_field);
        poInput = findViewById(R.id.po_input);

        raritySpinner = findViewById(R.id.rarity_spinner);
        raritySpinner.setAdapter(new ArrayAdapter<Integer>(getApplicationContext(),android.R.layout.simple_spinner_item, new Integer[]{1,2,3,4,5,6}));

        objectSpinner = findViewById(R.id.object_spinner);
        objectSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, TypeItem.nameToArray()));
        objectSpinner.setOnItemSelectedListener(new ItemSpinnerSelectedListener(poField,poInput,raritySpinner));

        poTypeSpinner = findViewById(R.id.po_type_spin);
        poTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"pc","po","pa","pp"}));
    }


    public void addItemToRecyclerView(){

        if(TypeItem.getTypeItem(objectSpinner.getSelectedItem().toString()) == TypeItem.COIN){//Creation des pièces
            Type type = Type.getType(poTypeSpinner.getSelectedItem().toString());
            double value = Double.parseDouble(poInput.getText().toString());

            rewardRecyclerViewAdapter.addItem(new Coin(type, value));
        }
    }
}
