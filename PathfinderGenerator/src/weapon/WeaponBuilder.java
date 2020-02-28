package weapon;
import java.util.Random;

import utility.Constant;
import utility.Data;
import utility.Debug;
import utility.Tuple;

/**
 * WeaponBuilder sert à la création d'arme.
 * @author Mentra20
 *
 */
public class WeaponBuilder{
    
    Random r; //Le random pour les tirages.
    
    /* CONSTRUCTOR */
    public WeaponBuilder(){
        this.r = new Random();
    }

    /**
     * Crée une arme selon la rareté donnée.
     * @param rarity
     * @return l'arme créée.
     */
    public Weapon createWeapon(int rarity){
    	//Membre x du tuple : genre d'arme.
    	//Membre y du tuple : propriété spéciale.
        Data<Tuple<Integer,Integer>> data = new Data<Tuple<Integer,Integer>>();
        
        switch(rarity) {
        case 1 : data.addAll(Constant.rarity1()); //On charge le tableau de drop de rareté 1.
        	break;
        default : Debug.error("erreur case createWeapon"); 
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_choice = "+randomValue);
        Tuple<Integer,Integer> tuple = data.selectObject(randomValue);
        
        if (tuple.getX()== 0) return specificWeapon(rarity);//L'arme est une arme spécifique.
        String alteration;
        if (tuple.getX() == -1) alteration = "maitre";//L'arme est une arme de maitre.
        else alteration = "+"+tuple.getX();//L'arme est une arme magique.
        
        return magicWeapon(alteration);
        
    }
    
    /**
     * Créer une arme spécifique.
     * @param rarity : la rareté de l'arme.
     * @return l'arme créée.
     */
    public Weapon specificWeapon(int rarity){
        Data<Weapon> select = new Data<Weapon>();
        
        switch(rarity){
            case 1: select.addAll(Constant.specificWeapon1());//Arme spécifique de rareté 1.
            	break;
            default : Debug.error("erreur case specificWeapon");
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_spe = "+randomValue);
        
        return select.selectObject(randomValue);
    }    
    
    
    /**
     * Créer une arme magique.
     * @param alteration : l'altération de l'arme.
     * @return l'arme créée.
     */
    public Weapon magicWeapon(String alteration){
        
        Data<Weapon> data = new Data<Weapon>();
        data.addAll(Constant.weaponList());
        
        //Tirage
        int randomValue = r.nextInt(100-19)+1;
        
        if(randomValue > 65){
        	//Entre 66 et 84 : aucune valeur dans le tableau (erreur?).
            Debug.debug("n_wp = "+(randomValue+19));
        }
        else{
            Debug.debug("n_wp = "+randomValue);
        }
        
        
        Weapon currentWeapon = data.selectObject(randomValue);
        currentWeapon.setAlteration(alteration);
        
        if(currentWeapon.getType() == Type.DIST){
        	//On doit tirer le drop de munition.
            currentWeapon = weaponMun((RangeWeapon) currentWeapon);
        }
        
        currentWeapon = weaponMaterial(currentWeapon);
        
        return currentWeapon;
    }
    
    /**
     * Créer une munition et le rattache à l'arme.
     * @param weapon : l'arme à modifiée.
     * @return l'arme modifiée/Créée.
     */
    public Weapon weaponMun(RangeWeapon weapon){
        
        Data<Weapon> data = new Data<Weapon>();
        data.addAll(Constant.weaponMunition());
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_mun = "+randomValue);
            
        Weapon select = data.selectObject(randomValue);
            
        if(select.getType() == Type.MUN){
            //L'arme est devenue une munition.
            select.setName(weapon.getMunition().getName());
        }
        else{
        	//On ratache les munitions à l'arme.
            select.setName(weapon.getName());
            select.setTypeMaterial(weapon.getTypeMaterial());
            ((RangeWeapon) select).getMunition().setName(weapon.getMunition().getName());
        }
        select.setAlteration(weapon.getAlteration());
        
        return select;
            
    }
    
    /**
     * Créer le matériel de l'arme.
     * @param weapon : l'arme à modifiée.
     * @return l'arme modifiée.
     */
    public Weapon weaponMaterial(Weapon weapon){
        Data<Material> data = new Data<Material>();
        
        if(weapon.getTypeMaterial() == TypeMaterial.WOOD){
            data.addAll(Constant.woodMaterial());//On charge le matériel bois.
        }
        else if(weapon.getTypeMaterial() == TypeMaterial.STEEL){
            data.addAll(Constant.steelMaterial());//On charge le matériel métal.
        }
        else{
        	Debug.error("No type material");
            return weapon;
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_mat = "+randomValue);
        
        Material select = data.selectObject(randomValue);
        
        weapon.setMaterial(select);
        
        return weapon;
    }
}



