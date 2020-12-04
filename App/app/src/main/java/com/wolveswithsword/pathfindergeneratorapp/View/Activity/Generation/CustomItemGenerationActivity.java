package com.wolveswithsword.pathfindergeneratorapp.View.Activity.Generation;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.Constants;

import java.util.Random;

import generator.TreasurePreview;
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
import save.HandlerTreasureSave;

public class CustomItemGenerationActivity extends AppCompatActivity {

    RecyclerView rewardRecyclerView;
    RewardRecyclerViewAdapter rewardRecyclerViewAdapter;

    TextView totalPrice;

    Button addButton;
    Button saveButton;
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

    //Save Manager
    HandlerTreasureSave handlerTreasureSave;

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
        saveButton = findViewById(R.id.custom_item_save_b);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveTreasure();
            }
        });

        poField = findViewById(R.id.po_field);
        totalPrice = findViewById(R.id.real_value);
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
        rewardRecyclerViewAdapter.setPriceField(totalPrice);

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

        /* Mise en place du gestionnaire de sauvegarde */
        handlerTreasureSave = new HandlerTreasureSave(getFilesDir().getAbsolutePath()+ Constants.SAVES);
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
            //Création de la fenetre de dialogue.
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

    /**
     * Créer une fenetre de dialogue qui demande le nom de la sauvegarde.
     */
    private void saveTreasure(){
        if(rewardRecyclerViewAdapter.getItemCount() != 0) {//Inutile de save une liste vide...CQFD

            //Creation de la vue du dialog.
            final EditText input = new EditText(this);
            final TextView errorField = new TextView(this);
            errorField.setTextColor(Color.RED);

            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            //Paramètre pour les marge ect.
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams. MATCH_PARENT ,
                    LinearLayout.LayoutParams. WRAP_CONTENT ) ;
            layoutParams.setMargins( 50 , 20 , 50 , 20 ) ;

            linearLayout.addView(input,layoutParams);

            layoutParams.setMargins(50,0,50,0);
            linearLayout.addView(errorField, layoutParams);

            //Création de la fenetre de dialogue.
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Nom de la sauvegarde :");
            builder.setView(linearLayout);

            builder.setPositiveButton("OK", null);
            builder.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            final AlertDialog dialog = builder.create();

            dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialogInterface) {
                    //Override du onclick listener pour ne pas fermer après appuie sur ok si erreur.
                    Button button = ((AlertDialog) dialog).getButton(AlertDialog.BUTTON_POSITIVE);
                    button.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            if(TextUtils.isEmpty(input.getText())){
                                errorField.setText("Le nom de la sauvegarde ne peut pas être vide.");
                            }else{
                                createSave(input.getText().toString());

                                dialog.dismiss();
                            }
                        }
                    });
                }
            });

            dialog.show();//Affichage de la fenetre.
        }
    }

    /**
     * Créer une sauvegarde avec les données actuelles.
     * @param name
     */
    private void createSave(String name){

        TreasurePreview treasurePreview = new TreasurePreview();
        treasurePreview.setName(name);
        treasurePreview.setPo(rewardRecyclerViewAdapter.getTotalPriceOfItems());
        treasurePreview.setNbItem(rewardRecyclerViewAdapter.getItemCount());

        handlerTreasureSave.saveTreasure(
                rewardRecyclerViewAdapter.getRewardList(),
                treasurePreview
        );
    }
}
