package orderClasses;

public class EelPortion extends IngredientPortionImpl{
	
	static Eel eel = new Eel();
	
	public EelPortion (double amount) {
		super(eel,amount);
		if (amount < 0) {
			throw new IllegalArgumentException("Amount is less than 0");
		}
	}

	public IngredientPortion combine(IngredientPortion other) {
		if(other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			IngredientPortion newIng = new EelPortion(other.getAmount());
			return newIng;
		} else {
			throw new IllegalArgumentException("portions are not the same");
		}
		
	}
}
