package orderClasses;

public interface Sushi {


	String getName();
	IngredientPortion[] getIngredients();
	boolean getHasRice();
	boolean getHasShellfish();
	boolean getIsVegetarian();
	int getCalories();
	double getCost();
	
	// getCalories is rounded to nearest integer
	// getCost is rounded to nearest cent
	
}
