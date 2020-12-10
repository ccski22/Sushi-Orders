package orderClasses;

public class IngredientPortionImpl implements IngredientPortion{
	
	/* This class is a parent class that encapsulates all information
	 * about an ingredient as fields and implements the interface
	 * IngredientPortion */
	
	private double amount;
	protected Ingredient ing;
	
	public IngredientPortionImpl(Ingredient ing, double amount) {
		this.amount=amount;
		this.ing=ing;
	} //end constructor
	
	public Ingredient getIngredient () {
		return ing;
	}
	
	public String getName() {
		return ing.getName();
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getCalories () {
		return (amount * ing.getCaloriesPerOunce());
	}
	
	public boolean getIsVegetarian() {
		return ing.getIsVegetarian();
	}


	public boolean getIsRice() {
		return ing.getIsRice();
	}


	public boolean getIsShellfish() {
		return ing.getIsShellfish();
	}
	
	public double getCost () {
		return (amount * ing.getPricePerOunce());
	}


	public IngredientPortion combine(IngredientPortion other) {

		if(other == null) {
			return this;
		}
		if (!other.getIngredient() .equals(this.getIngredient())) {
			throw new RuntimeException("Other is a portion of different ingredient");
		}
		IngredientPortionImpl current = new IngredientPortionImpl( this.getIngredient(), (other.getAmount() + this.getAmount()));
		return current;
	
	

}
} //end class
