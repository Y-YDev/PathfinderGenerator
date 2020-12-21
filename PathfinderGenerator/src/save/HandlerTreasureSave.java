package save;

import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.Constants;

import java.io.File;
import java.util.ArrayList;

import generator.TreasurePreview;
import item.Item;
import utility.Debug;
import utility.FileManager;

public class HandlerTreasureSave {

    private File directory;//Repertoire de base
    private final String extension = ".json";
    private TreasureSaveParser parser = new TreasureSaveParser();

    private static HandlerTreasureSave handlerTreasureSave;//SINGLETON


    /**
     * Constructeur a l'aide d'une String
     */
    private HandlerTreasureSave () {
        initDirectory(new File(AppObject.getContext().getFilesDir() + Constants.SAVES));
    }

    /**
     * SINGLETON
     * @return l'instance de handler de save.
     */
    public static HandlerTreasureSave getInstance(){
        if(handlerTreasureSave == null){
            handlerTreasureSave = new HandlerTreasureSave();
        }

        return handlerTreasureSave;
    }

    /**
     * Initialise le répertoire.
     * @param directory : le répertoire.
     */
    private void initDirectory(File directory){
        if(!directory.exists()){
            boolean isCreate = directory.mkdir();
            if(!isCreate){
                Debug.error("impossible de générer le fichier de sauvegarde : "+directory.getName());
                return;
            }

        }
        else if(!directory.isDirectory()){
            Debug.error("Un fichier à déjà le nom du répertoire de sauvegarde : "+directory.getName());
            return;
        }

        this.directory = directory;
    }


    /**
     * Recupère tous les fichiers de sauvegarde.
     * @return
     */
    private ArrayList<File> getAllSaveFiles(){
        ArrayList<File> saveFiles = new ArrayList<>();

        for(File file : directory.listFiles()){
            saveFiles.add(file);//On ajoute.
        }
        return saveFiles;
    }

    /**
     * Récupère tout les nom de sauvegardes.
     * @return
     */
    private ArrayList<String> getAllSaveName(){
        ArrayList<String> savesNames = new ArrayList<>();

        for(File file : directory.listFiles()){
            savesNames.add(file.getName());//On ajoute.
        }
        return savesNames;
    }

    /**
     * Renvoie true ou false si la sauvegarde existe.
     * @param name : nom de la sauvegarde
     * @return true ou false
     */
    public boolean alreadyExist(String name){
        return this.getAllSaveName().contains(name + extension);
    }


    /**
     *
     * @return list de preview sauvegarder
     */
    public ArrayList<TreasurePreview> getPreviewList(){
        ArrayList<File> saveFiles = getAllSaveFiles();
        ArrayList<TreasurePreview> allPreviews = new ArrayList<>();

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

        FileManager treasureFile = new FileManager(new File(directory,name+extension));

        if(!treasureFile.exists()){
            Debug.error("le fichier de sauvegarde n'existe pas");
            return null;
        }
        //ArrayList<Item> items = parser.parseListItems(treasureFile.getRaw());
        return parser.parseListItems(treasureFile.getRaw());
    }

    /**
     * permet de sauvegarder le tresort
     * @param listItems liste des items a sauvegarder
     * @param preview apercus de la sauvegarde
     * @return true -> sauvegarde effectuer/ false -> echec
     */
    public boolean saveTreasure(ArrayList<Item> listItems, TreasurePreview preview){

        FileManager saveFile = new FileManager(new File(directory,preview.getName()+extension));

        boolean isSaved = saveFile.write(parser.previewsToJson(preview),false);

        if(isSaved) isSaved = saveFile.write(parser.listItemsToJson(listItems),true);

        return isSaved;
    }

    /**
     * Supprime une sauvegarde
     * @param preview : l'objet de la sauvegarde
     * @return
     */
    public boolean deleteSaveFile(TreasurePreview preview){
        FileManager file = new FileManager(new File(directory,preview.getName()+extension));

        return file.deleteFile();
    }
}
