package save;

import java.io.File;
import java.io.Reader;
import java.util.ArrayList;


import generator.Treasure;
import generator.TreasurePreviews;
import item.Item;
import utility.Debug;
import utility.FileManager;

public class HandlerTreasureSave {

    File directory;
    private final String extention = ".json";
    TreasureSaveParser parser = new TreasureSaveParser();



    /**
     * Constructeur a l'aide d'une String
     * @param directoryPath une String representant le chemin du fichier voulue
     */
    public HandlerTreasureSave (String directoryPath) {
        initDirectory(new File(directoryPath));
        this.directory = directory;
    }

    /**
     * Constructeur a l'aide d'un file
     * @param directory le repertoire qui vas etre utiliser
     */
    public HandlerTreasureSave (File directory) {
        initDirectory(directory);
        this.directory = directory;


    }

    private void initDirectory(File directory){
        if(!directory.exists()){
            boolean isCreate = directory.mkdir();
            if(!isCreate){
                Debug.error("impossible de generer le fichier de sauvegarde : "+directory.getName());
            }

        }
        else if(!directory.isDirectory()){
            Debug.error("Un fichier a le nom du repertoire de sauvegarde : "+directory.getName());
        }

    }



    private ArrayList<File> getAllSaveFiles(){
        ArrayList<File> saveFiles = new ArrayList<>();

        for(File file : directory.listFiles()){
            saveFiles.add(file);//On ajoute.
        }
        return saveFiles;
    }


    /**
     *
     * @return list de preview sauvegarder
     */
    public ArrayList<TreasurePreviews> getPreviewList(){
        ArrayList<File> saveFiles = getAllSaveFiles();
        ArrayList<TreasurePreviews> allPreviews = new ArrayList<>();
        for(File saveFile : saveFiles){
            FileManager save = new FileManager(saveFile);
            allPreviews.add(parser.parseTresorPreviews(save.getRaw()));
        }
        return allPreviews;
    }


    /**
     *
     * @param name nom de la sauvegarde
     * @return permet de recuperer la liste du tresor sauvegarder
     */
    public ArrayList<Item> getTreasureSave(String name){
        FileManager treasureFile = new FileManager(new File(directory,name+extention));
        if(!treasureFile.exists()){
            Debug.error("le fichier de sauvegarde n'existe pas");
            return null;
        }
        ArrayList<Item> items = parser.parseListItems(treasureFile.getRaw());
        return parser.parseListItems(treasureFile.getRaw());
    }

    /**
     * permet de sauvegarder le tresort
     * @param listItems liste des items a sauvegarder
     * @param preview apercus de la sauvegarde
     * @return true -> sauvegarde effectuer/ false -> echec
     */
    public boolean saveTreasure(ArrayList<Item> listItems, TreasurePreviews preview){
        FileManager saveFile = new FileManager(new File(directory,preview.getName()));
        boolean isSaved = saveFile.write(parser.previewsToJson(preview),false);
        if(isSaved) isSaved = saveFile.write(parser.listItemsToJson(listItems),true);

        return isSaved;
    }





}
