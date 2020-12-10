package orderClasses;

public class ShrimpPortion extends IngredientPortionImpl{
	static Shrimp shrimp = new Shrimp();
	
	public ShrimpPortion (double amount) {
		super(shrimp,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new ShrimpPortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portiosna are not the same");
		}
		
	}
}
