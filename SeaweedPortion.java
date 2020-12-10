package orderClasses;

public class SeaweedPortion extends IngredientPortionImpl{
	static Seaweed seaweed = new Seaweed();
	
	public SeaweedPortion (double amount) {
		super(seaweed,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new SeaweedPortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portiosna are not the same");
		}
		
	}
}
