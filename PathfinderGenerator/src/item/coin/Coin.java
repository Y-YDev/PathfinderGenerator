package item.coin;

import java.io.Serializable;

import item.Item;
import item.TypeItem;

/**
 * Représente les pièces d'or, de cuivre , d'argent et de platine
 * @author Mentra20
 *
 */
public class Coin extends Item {
	private Type typeCoin;//Type de pièce
	private int quantity;
	
	public Coin(Type typeCoin, int quantity) {
		super("_", 0, TypeItem.COIN);
		this.setQuantity(quantity);
		this.setTypeCoin(typeCoin);
		this.setName(toString());
	}
	
	public String toString() {
		return this.quantity + " " + this.typeCoin;
	}
	
	public Type getTypeCoin() {
		return typeCoin;
	}

	public void setTypeCoin(Type typeCoin) {
		this.typeCoin = typeCoin;
	}

	public int getQuantity(){return this.quantity;}

	public void setQuantity(int quantity){this.quantity = quantity;}

	@Override
	public double getPrice() {
		switch (typeCoin){
			case GOLD:
				return quantity;
			case COPPER:
				return quantity * 0.01;
			case SILVER:
				return quantity * 0.1;
			case PLATINIUM:
				return quantity * 10;
			default:
				return 0;
		}
	}
}
