package orderClasses;

public class YellowtailPortion extends IngredientPortionImpl{
	static Yellowtail yellowtail = new Yellowtail();
	
	public YellowtailPortion (double amount) {
		super(yellowtail,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new YellowtailPortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portiosna are not the same");
		}
		
	}
}