package orderClasses;

public interface Ingredient {

	String getName();
	double getCaloriesPerDollar();
	int getCaloriesPerOunce();
	double getPricePerOunce();
	boolean getIsVegetarian();
	boolean getIsRice();
	boolean getIsShellfish();
	boolean equals(Ingredient other);

	/* equals(Ingredient other)
	 * 
	 * If other is null, returns false.
	 * Otherwise...
	 * Compares ingredient to other and returns true if both
	 * ingredients have the same name, same calories per ounce,
	 * is within 1 cent in price per ounce, and has the same 
	 * characteristics with regard to being vegetarian, rice, or 
	 * shellfish.
	 * 
	 */
}
