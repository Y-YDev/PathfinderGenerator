package utility;
import java.util.ArrayList;

/**
 * Cette classe représente une liste de données avec leur probabilité dans la DB.
 * Elle possède des méthodes pour effectuer des traitements de données.
 * @author Mentra20
 * @param <E> : Le type stockée dans la données
 */
public class Data<E> extends ArrayList<Tuple<E,Integer>> {
	private static final long serialVersionUID = 6299565376922637204L;
	
	/**
	 * selectObject donne l'objet d'un drop correspondant au tirage.
	 * @param number : le tirage obtenu aux dés.
	 * @return
	 */
	public E selectObject(int number){
        int index = 0;
        int currentVal = 1;
        
        while(currentVal + this.get(index).getY() <= number){
            currentVal += this.get(index).getY();
            index++;
        }
        
        return this.get(index).getX();
	}
	
	/**
	 * Affiche les informations de l'arraylist (pour des verifications)
	 * @return
	 */
	public void information() {
		int nbItem = 0;
		int probabilityLength = 0;
		
		nbItem = this.size();
		
		for(int i = 0; i < nbItem; i++) {
			probabilityLength += this.get(i).getY();
		}
		
		System.out.println("nbItem = "+nbItem+"; probabilityLength = "+probabilityLength);
	}
}
