package orderClasses;
import java.util.ArrayList;
import java.util.List;

public class Roll implements Sushi {

	private String name;
	private IngredientPortion[] roll_ingredients;

	public Roll (String name, IngredientPortion[] roll_ingredients) {
		this.name = name;
		if (roll_ingredients.clone() == null) {
			throw new RuntimeException("The IngredientPortion array is null");
		}
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients.clone()[i] == null) {
				throw new RuntimeException("element at " + i + " is null");
			}
		}
		this.roll_ingredients = roll_ingredients.clone();

		List<IngredientPortion> portions = new ArrayList<IngredientPortion>();
		
		for (int i = 0; i < roll_ingredients.length; i++) {
			
			if (!isIngredientPortionInArray(portions, roll_ingredients[i])) {
				portions.add(roll_ingredients[i]);
			}
			else {
				int index = indexOfIngredientPortion(portions, roll_ingredients[i]);
				portions.set(index, portions.get(index).combine(roll_ingredients[i]));
			}
		}
		boolean b = false;
		for (int i = 0; i < portions.size(); i++) {
			if (portions.get(i).getIngredient().equals(new Seaweed()) && portions.get(i).getAmount() >= 0.1) {
				b = true;
				break;
			} else if (portions.get(i).getIngredient().equals(new Seaweed()) && portions.get(i).getAmount() < 0.1) {
				b = true;
				portions.set(i, new SeaweedPortion(0.1));
				break;

			}
		}	
		if (!b) {
			portions.add(new SeaweedPortion(0.1));
		}
		IngredientPortion[] finalArray = new IngredientPortion[portions.size()];
		for (int i = 0; i < portions.size(); i++) {
			finalArray[i] = portions.get(i);
		}
		this.roll_ingredients = finalArray.clone();
	}


	public String getName() {
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		return roll_ingredients.clone();
	}

	@Override
	public int getCalories() {
		double calories = 0;
		for(int i = 0; i < roll_ingredients.length; i++) {
			calories += roll_ingredients.clone()[i].getCalories();
		}


		return (int) Math.round(calories);
	}

	@Override
	public double getCost() {
		double price = 0;
		for(int i = 0; i < roll_ingredients.length; i++) {
			price += roll_ingredients.clone()[i].getCost();
		}

		return Math.round(price * 100)/100.0;
	}

	@Override
	public boolean getHasRice() {
		boolean hasRice = false;
		for(int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients.clone()[i].getIsRice()) {
				hasRice = true;			
			}
		}
		return hasRice;
	}

	@Override
	public boolean getHasShellfish() {
		boolean hasShellfish = false;
		for(int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients.clone()[i].getIsShellfish()) {
				hasShellfish = true;
			}
		}
		return hasShellfish;
	}

	@Override
	public boolean getIsVegetarian() {
		boolean isVegetarian = false;
		for(int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients.clone()[i].getIsVegetarian()) {
				isVegetarian = true;
			}
		}
		return isVegetarian;
	}

	public static boolean isIngredientPortionInArray(List<IngredientPortion> a, IngredientPortion ing) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getIngredient().equals(ing.getIngredient())) {
				return true;
			}
		}
		return false;
	}

	public static int indexOfIngredientPortion(List<IngredientPortion> a, IngredientPortion ing) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getIngredient().equals(ing.getIngredient())) {
				return i;
			}
		}
		return -1;
	}
}

 /* 
  methods to implement from Sushi interface:
  	String getName();
	IngredientPortion[] getIngredients();
	boolean getHasRice();
	boolean getHasShellfish();
	boolean getIsVegetarian();
	int getCalories();
	double getCost();
  */

