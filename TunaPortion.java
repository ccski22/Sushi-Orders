package orderClasses;

public class TunaPortion extends IngredientPortionImpl{
	static Tuna tuna = new Tuna();
	
	public TunaPortion (double amount) {
		super(tuna,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new TunaPortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portiosna are not the same");
		}
		
	}
}
