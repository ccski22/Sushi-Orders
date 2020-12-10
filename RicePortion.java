package orderClasses;

public class RicePortion extends IngredientPortionImpl{
	static Rice rice = new Rice();
	
	public RicePortion (double amount) {
		super(rice,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new RicePortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portiosna are not the same");
		}
		
	}
}
