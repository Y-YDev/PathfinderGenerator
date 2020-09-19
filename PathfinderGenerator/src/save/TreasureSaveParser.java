package save;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import generator.TreasurePreviews;
import item.Item;
import item.ItemJsonAdapter;

/**
 * Permet de transformer les donner de json a object et inversement
 */
public class TreasureSaveParser {
    private Gson gson;

    public TreasureSaveParser(){
        gson= new GsonBuilder().registerTypeAdapter(Item.class,new ItemJsonAdapter()).create();
    }

    /**
     * permet de parse les donner du fichier pour avoir le apercus
     * @param input le string a decoder
     * @return le preview
     */
    public TreasurePreviews parseTresorPreviews(String input){
        JsonReader reader = new JsonReader(new StringReader(input));
        TreasurePreviews result = gson.fromJson(input,TreasurePreviews.class);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * permet de parse la liste d'item
     * @param input le string a parse
     * @return la list d'item parse
     */
    public ArrayList<Item> parseListItems(String input){
        JsonReader reader = new JsonReader(new StringReader(input));
        //on saute le previews
        try {
            reader.skipValue();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Item> list = gson.fromJson(reader, new TypeToken<ArrayList<Item>>(){}.getType());

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * Convertion en JSON
     * @param preview l'objet a transformer
     * @return le string du json
     */
    public String previewsToJson(TreasurePreviews preview){

        return gson.toJson(preview);
    }

    /**
     * Convertion en JSON
     * @param listItems la list d'item a transformer en json
     * @return le string du json
     */

    public String listItemsToJson(ArrayList<Item> listItems){
        return gson.toJson(listItems);
    }
}
