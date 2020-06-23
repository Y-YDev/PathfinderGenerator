package item.coin;

import item.Item;
import item.TypeItem;

/**
 * Représente les pièces d'or, de cuivre , d'argent et de platine
 * @author Mentra20
 *
 */
public class Coin extends Item {
	private Type typeCoin;//Type de pièce
	
	public Coin(Type typeCoin, double quantity) {
		super("_", quantity, TypeItem.COIN);
		this.setTypeCoin(typeCoin);
		this.setName(toString());
	}
	
	public String toString() {
		return this.getPrice() + " " + this.typeCoin;
	}
	
	public Type getTypeCoin() {
		return typeCoin;
	}

	public void setTypeCoin(Type typeCoin) {
		this.typeCoin = typeCoin;
	}
}
