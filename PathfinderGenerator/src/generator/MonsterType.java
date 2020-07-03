package generator;

/**
 * Représente tout les types de monstres de pathfinder.
 */
public enum MonsterType {
	Aberration("Aberration)"),Animal("Animal"),Artificial_creature("Créature artificielle"),
    Magic_creature("Créature magique"),Dragon("Dragon"),Exterior("Extérieur"),
    Fairy("Fée"),Humanoid("Humanoïde"),Monstrous_umanoid("Humanoïde monstrueux"),Undead("Mort-vivant"),
    Plant("Plante"),Vase("Vase"),Vermine("Vermine");
    
    private final String type;
    
    private MonsterType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
