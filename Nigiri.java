package orderClasses;

import orderClasses.Sashimi.SashimiType;

public class Nigiri extends SushiImpl{

public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	private NigiriType type;
	public Nigiri( NigiriType type) {
		super(ingredientArray(type), nigiriName(type));
		this.type = type;
	}
	
	public static IngredientPortion[] ingredientArray (NigiriType type) {
		IngredientPortion[] ingredients = new IngredientPortion[2];
		if (type.name() == "TUNA") {
			ingredients[0] = new TunaPortion(0.75);	
			ingredients[1] = new RicePortion(0.5);
		} else if (type.name() == "YELLOWTAIL") {
			ingredients[0] = new YellowtailPortion(0.75);
			ingredients[1] = new RicePortion(0.5);
		}else if (type.name() == "EEL") {
			ingredients[0] = new EelPortion(0.75);
			ingredients[1] = new RicePortion(0.5);
		} else if (type.name() == "CRAB") {
			ingredients[0] = new CrabPortion(0.75);
			ingredients[1] = new RicePortion(0.5);
		} else if (type.name() == "SHRIMP") {
			ingredients[0] = new ShrimpPortion(0.75);
			ingredients[1] = new RicePortion(0.5);
		}
		
		
		return ingredients;
	}
	
	public static String nigiriName (NigiriType type) {
		String name = type.toString().toLowerCase();
		return name + " nigiri";
	}
	
}
