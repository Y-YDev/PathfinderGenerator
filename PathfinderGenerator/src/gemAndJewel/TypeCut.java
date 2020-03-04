package gemAndJewel;

/**
 * TypeCut représente le type de gemme (brut ou taillée).
 * @author Mentra20
 *
 */
public enum TypeCut {
	RAW("brute"),CUT("taillée"),NOTHING("_");
	
	private final String cut;
	
	private TypeCut(String cut) {
		this.cut = cut;
	}
	
	public String toString() {
		return cut;
	}
}
