package generator;

import java.io.Serializable;

public class TreasurePreview implements Serializable {

    private String name;
    private double Po;
    private int nbItem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPo() {
        return Po;
    }

    public void setPo(double po) {
        Po = po;
    }

    public int getNbItem() {
        return nbItem;
    }

    public void setNbItem(int nbItem) {
        this.nbItem = nbItem;
    }
}
