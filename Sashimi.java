package orderClasses;

public class Sashimi extends SushiImpl{
	
public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	private SashimiType type;
	public Sashimi( SashimiType type) {
		super(ingredientArray(type), sashimiName(type));
		this.type = type;	
	}
	
	public static IngredientPortion[] ingredientArray (SashimiType type) {
		IngredientPortion[] ingredients = new IngredientPortion[1];
		if (type.name() == "TUNA") {
			ingredients[0] = new TunaPortion(0.75);	
		} else if (type.name() == "YELLOWTAIL") {
			ingredients[0] = new YellowtailPortion(0.75);
		}else if (type.name() == "EEL") {
			ingredients[0] = new EelPortion(0.75);
		} else if (type.name() == "CRAB") {
			ingredients[0] = new CrabPortion(0.75);
		} else if (type.name() == "SHRIMP") {
			ingredients[0] = new ShrimpPortion(0.75);
		}
		return ingredients;
	}
	
	public static String sashimiName (SashimiType type) {
		String name = type.toString().toLowerCase();
		return name + " sashimi";		
	}
	
	
}// end class
