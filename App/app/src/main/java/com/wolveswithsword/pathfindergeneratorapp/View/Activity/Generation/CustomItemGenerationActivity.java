package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Listener.ItemSpinnerSelectedListener;
import com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.RewardRecyclerViewAdapter;

import java.util.Random;

import item.TypeItem;
import item.armor.ArmorBuilder;
import item.artItem.ArtItemBuilder;
import item.coin.Coin;
import item.coin.Type;
import item.gemAndJewel.GemAndJewelBuilder;
import item.parchment.ParchmentBuilder;
import item.potion.PotionBuilder;
import item.ring.RingBuilder;
import item.scepter.ScepterBuilder;
import item.staff.StaffBuilder;
import item.wand.WandBuilder;
import item.weapon.WeaponBuilder;
import item.wonderfulObject.WonderfulObjectBuilder;

public class CustomItemGenerationActivity extends AppCompatActivity {

    RecyclerView rewardRecyclerView;
    RewardRecyclerViewAdapter rewardRecyclerViewAdapter;

    TextView realPrice;

    Button addButton;
    ImageButton deleteAllButton;
    Spinner objectSpinner;
    Spinner raritySpinner;

    LinearLayout poField;
    TextView errorText;
    EditText poInput;
    Spinner poTypeSpinner;

    //Builder
    Random r;

    WeaponBuilder weaponBuilder;
    ArmorBuilder armorBuilder;
    GemAndJewelBuilder gemAndJewelBuilder;
    ArtItemBuilder artItemBuilder;
    ParchmentBuilder parchmentBuilder;
    PotionBuilder potionBuilder;
    RingBuilder ringBuilder;
    ScepterBuilder scepterBuilder;
    StaffBuilder staffBuilder;
    WandBuilder wandBuilder;
    WonderfulObjectBuilder wonderfulObjectBuilder;

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
        deleteAllButton = findViewById(R.id.delete_all_Button);
        deleteAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askDeleteAll();
            }
        });

        poField = findViewById(R.id.po_field);
        realPrice = findViewById(R.id.real_value);
        poInput = findViewById(R.id.po_input);

        errorText = findViewById(R.id.error_itemGen);
        errorText.setVisibility(View.INVISIBLE);

        raritySpinner = findViewById(R.id.rarity_spinner);
        raritySpinner.setAdapter(new ArrayAdapter<Integer>(getApplicationContext(),android.R.layout.simple_spinner_item, new Integer[]{1,2,3,4,5,6}));

        objectSpinner = findViewById(R.id.object_spinner);
        objectSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, TypeItem.nameToArray()));
        objectSpinner.setOnItemSelectedListener(new ItemSpinnerSelectedListener(getApplicationContext(),poField,poInput,raritySpinner,errorText));

        poTypeSpinner = findViewById(R.id.po_type_spin);
        poTypeSpinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"pc","pa","po","pp"}));

        rewardRecyclerView = findViewById(R.id.reward_recyclerview);
        rewardRecyclerViewAdapter = new RewardRecyclerViewAdapter();
        rewardRecyclerViewAdapter.setRealPriceField(realPrice);

        rewardRecyclerView.setAdapter(rewardRecyclerViewAdapter);
        rewardRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        /* Mise en place des builder */
        r = new Random();
        weaponBuilder = new WeaponBuilder();
        armorBuilder = new ArmorBuilder();
        gemAndJewelBuilder = new GemAndJewelBuilder();
        artItemBuilder = new ArtItemBuilder();
        parchmentBuilder = new ParchmentBuilder();
        potionBuilder = new PotionBuilder();
        ringBuilder = new RingBuilder();
        scepterBuilder = new ScepterBuilder();
        staffBuilder = new StaffBuilder();
        wandBuilder = new WandBuilder();
        wonderfulObjectBuilder = new WonderfulObjectBuilder();
    }

    /**
     * Permet de créer un item et l'ajouter au recyclerView.
     */
    public void addItemToRecyclerView(){

        int rarity = Integer.parseInt(raritySpinner.getSelectedItem().toString());

        switch (TypeItem.getTypeItem(objectSpinner.getSelectedItem().toString())){
            case COIN://Creation des pièces
                if(checkPoInput()) {
                    double value = Double.parseDouble(poInput.getText().toString());
                    Type type = Type.getType(poTypeSpinner.getSelectedItem().toString());

                    rewardRecyclerViewAdapter.addItem(new Coin(type, value));
                }
                break;
            case WEAPON:
                rewardRecyclerViewAdapter.addItem(weaponBuilder.createWeapon(rarity));
                break;
            case ARMOR:
                rewardRecyclerViewAdapter.addItem(armorBuilder.createArmor(rarity));
                break;
            case GEM:
                rewardRecyclerViewAdapter.addItem(gemAndJewelBuilder.createGem(rarity,r.nextBoolean()));
                break;
            case JEWEL:
                rewardRecyclerViewAdapter.addItem(gemAndJewelBuilder.createJewel(rarity));
                break;
            case ART:
                rewardRecyclerViewAdapter.addItem(artItemBuilder.createArtItem(rarity));
                break;
            case RING:
                rewardRecyclerViewAdapter.addItem(ringBuilder.createRing(rarity));
                break;
            case WAND:
                rewardRecyclerViewAdapter.addItem(wandBuilder.createWand(rarity));
                break;
            case STAFF:
                rewardRecyclerViewAdapter.addItem(staffBuilder.createStaff(rarity));
                break;
            case POTION:
                rewardRecyclerViewAdapter.addItem(potionBuilder.createPotion(rarity));
                break;
            case SCEPTER:
                rewardRecyclerViewAdapter.addItem(scepterBuilder.createScepter(rarity));
                break;
            case PARCHMENT:
                rewardRecyclerViewAdapter.addItem(parchmentBuilder.createParchment(rarity));
                break;
            case WONDERFUL:
                rewardRecyclerViewAdapter.addItem(wonderfulObjectBuilder.createWonderfulObject(rarity));
                break;
        }
    }

    /**
     * Permet de check si l'edit-text des po est correct
     * @return true ou false;
     */
    private boolean checkPoInput(){
        if(poInput.getText().toString().equals("")) {
            errorText.setVisibility(View.VISIBLE);
            return false;
        }
        return true;
    }

    /**
     * Créer une fenetre pour demander la confirmation de la supression de la liste d'item.
     */
    private void askDeleteAll(){
        if(rewardRecyclerViewAdapter.getItemCount() != 0) {//Inutile de demander de supprimer une liste vide...CQFD
            //Création de la fenetre de création.
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Tout supprimer ?");
            builder.setMessage("Voulez-vous vraiment supprimer tout les éléments du trésor ?");
            builder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    rewardRecyclerViewAdapter.deleteAll();//Suppression acceptée
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();//Affichage de la fenetre.
        }
    }
}
