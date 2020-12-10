package orderClasses;

public interface IngredientPortion {

	
	Ingredient getIngredient();
	double getAmount();
	String getName();
	boolean getIsVegetarian();
	boolean getIsRice();
	boolean getIsShellfish();
	double getCalories();
	double getCost();
	IngredientPortion combine(IngredientPortion other);
	
	// getIngredient: represents the ingredient this is object is a portion of.
	// getAmount(): get for size (in oz) of ingredient portion
	// getCalories and cost is not rounded
	
	/** combine: if other ingredient is null, return this ingredient portion;
	 if equal, return new ingredient portion and the other portion; check for
	 equality using Ingredient interface's equals() method
	 If not equal, throw IllegalArgumentException
	**/
	
	
	
}
