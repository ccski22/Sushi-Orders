package orderClasses;

public class AvocadoPortion extends IngredientPortionImpl{
	
	/*all subclasses should provide a constructor that accepts a single 
	 * parameter indicating amount of the portion in ounces*/
	
	static Avocado avocado = new Avocado();
	
	public AvocadoPortion (double amount) {
		super(avocado,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new AvocadoPortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portiosna are not the same");
		}
		
	}

}
