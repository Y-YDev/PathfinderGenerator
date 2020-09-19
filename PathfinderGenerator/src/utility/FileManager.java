package utility;

import android.util.JsonReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class FileManager {

    File file;

    /**
     * Constructeur a l'aide d'une String
     * @param path une String representant le chemin du fichier voulue
     */
    public FileManager (String path)
    {this.file = new File(path);}

    /**
     * Constructeur a l'aide d'un file
     * @param file le file qui vas etre utiliser
     */
    public FileManager (File file)
    {this.file = file;}


    /** Permet de creer le fichier
     * @return true : créer; false non créer
     */
    public boolean create()
    {
        try {
            this.file.createNewFile();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            Debug.error(this.file.getName()+ " can\'t be create at path " + this.file.getAbsolutePath());
        }
        return false;
    }

    /**
     * Permet de savoir si le fichier existe ou non
     * @return Un boolean
     */
    public boolean exists () {
        return this.file.exists();
    }

    /**
     * Permet de remplacer le contenu d'un fichier par content
     * @param content Le futur contenu du fichier
     * @return true -> file write
     */
    public boolean write(String content,boolean append)
    {
        //si le fichier n'est pas encore créer on le crée
        if (!file.exists()) {
            boolean isCreate = create();
            if(!isCreate) return false;
        }

        // Si on a les droits pour ecrire
        if(file.canWrite()){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file,append));
                writer.write(content);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            Debug.error(this.file.getName() + " isn\'t writable !");
            return false;
        }
        return true;

    }

    /**
     * Permet de renvoyer tout le contenu d'un fichier
     * sous forme brut
     * @return un String
     */
    public String getRaw()
    {

        //si le fichier n'est pas créer
        if (!this.file.exists()) return null;

        // Si on a les droits pour lire le fichier
        if (this.file.canRead())
        {
            // On essaye de lire la premiere ligne
            try
            {
                /* INITIALISATION */
                FileReader r = new FileReader(this.file);
                BufferedReader br = new BufferedReader(r);
                StringBuilder resultString = new StringBuilder();
                /* GET THE CONTENT */
                String tmp;
                //On remet le \n sauf la premiere fois que l'on lit une ligne
                if((tmp = br.readLine()) != null){
                    resultString.append(tmp);
                }
                while ((tmp = br.readLine()) != null)
                {
                    resultString.append("\n"+tmp);
                }
                /* CLOSE FILESTREAMS */
                br.close();
                r.close();

                // On renvoie la premier ligne
                return resultString.toString();
            } catch (Exception e) {
                e.printStackTrace();
                Debug.error(file.getName() + " doesn\'t exist !");
            }
        } else {
            Debug.error(file.getName() + " isn\'t readable !");
        }
        return "";
    }



    /**
     * Permet de suprimer un fichier
     * @return true ou false selon la reussite de la suppression
     */
    public boolean deleteFile(){
        if(exists()) {
            return file.delete();
        }
        return false;
    }
}
