package orderClasses;

public class SushiImpl implements Sushi{
	
	private IngredientPortion[] ingredients;
	private String name;
	
	public SushiImpl(IngredientPortion[] ingredients, String name) {
		this.ingredients = ingredients;
		this.name = name;
		
	}

	public String getName() {
		return name;
	}


	public IngredientPortion[] getIngredients() {
		return ingredients;
	}

	public int getCalories() {
		double calories = 0;
		for(int i = 0; i < ingredients.length; i++) {
			calories += ingredients[i].getCalories();
		}
		return (int) Math.round(calories);
	}

	public double getCost() {
		double price = 0;
		for(int i = 0; i < ingredients.length; i++) {
			price += ingredients[i].getCost();
		}
		
		return Math.round(price * 100)/100.0;
	}

	public boolean getHasRice() {
		boolean hasRice = false;
		for(int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].getIsRice()) {
				hasRice = true;			
			}
		}
		return hasRice;
	}

	public boolean getHasShellfish() {
		boolean hasShellfish = false;
		for(int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].getIsShellfish()) {
				hasShellfish = true;
			}
		}
		return hasShellfish;
	}

	public boolean getIsVegetarian() {
		boolean isVegetarian = false;
		for(int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].getIsVegetarian()) {
				isVegetarian = true;
			}
		}
		return isVegetarian;
	}
}
