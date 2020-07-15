package item;

public enum TypeItem {
	COIN(1),ARMOR(2),ART(3),GEM(4),JEWEL(5),PARCHMENT(6),POTION(7),
	RING(8),SCEPTER(9),STAFF(10),WAND(11),WEAPON(12),WONDERFUL(13);

	private final int ID;

	private TypeItem(int ID){
		this.ID = ID;
	}

	public int getID(){
		return this.ID;
	}
}
