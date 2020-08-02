package generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TreasureElement implements Serializable {

    private double po;
    private ProbabilityType proba;
    private TreasureType treasureType;

    public TreasureElement(TreasureType treasureType){
        po = 0;
        proba = ProbabilityType.MEDIUM;
        this.treasureType = treasureType;
    }

    /**
     * genere la list de tout les tresor
     * @return la list des tout les tresor
     */
    public static ArrayList<TreasureElement> generateAll(){
        ArrayList<TreasureElement> allTreasure = new ArrayList<>();
        for(TreasureType treasure : TreasureType.values()){
            allTreasure.add(new TreasureElement(treasure));
        }
        return allTreasure;
    }

    /**
     * verifie que la valeur est correcte
     * @return true -> correct value
     */
    public boolean checkCorrectValue(){
        return (po<1000000 ? true : false);
    }

    public double getPo() {
        return po;
    }

    public void setPo(double po) {
        this.po = po;
    }

    public ProbabilityType getProba() {
        return proba;
    }

    public void setProba(ProbabilityType proba) {
        this.proba = proba;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }




}
