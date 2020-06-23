package item.gemAndJewel;

import item.Item;
import item.TypeItem;

/**
 * Gem représente une gemme.
 * @author Mentra20
 *
 */
public class Gem extends Item{
	private TypeCut cut;//Type de la gemme.
	
	/* CONSTRUCTOR */
	public Gem(String name) {
		super(name, 0, TypeItem.GEM);
		this.cut = TypeCut.NOTHING;
	}
	
	/* GETTERS AND SETTERS */
	public TypeCut getCut() {
		return cut;
	}

	public void setCut(TypeCut cut) {
		this.cut = cut;
	}
	
}
