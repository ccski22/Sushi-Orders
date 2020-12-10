package orderClasses;

public class IngredientImpl implements Ingredient{
	/** includes the following Ingredient method implementations:
	String getName();
	double getCaloriesPerDollar();
	int getCaloriesPerOunce();
	double getPricePerOunce();
	boolean getIsVegetarian();
	boolean getIsRice();
	boolean getIsShellfish();
	boolean equals(Ingredient other);
	**/
	
	private String name;
	private double pricePerOunce;
	private int caloriesPerOunce;
	private boolean isVeg;
	private boolean isRice;
	private boolean isShellfish;
	
	public IngredientImpl(String name, double pricePerOunce, int caloriesPerOunce, boolean isVeg, boolean isRice, boolean isShellfish) {
		this.name = name;
		this.pricePerOunce = pricePerOunce;
		this.caloriesPerOunce = caloriesPerOunce;
		this.isVeg = isVeg;
		this.isRice = isRice;
		this.isShellfish = isShellfish;
		
	}
	
	public String getName () {
		return name;
	}
	public double getPricePerOunce () {
		return pricePerOunce;
	}
	public double getCaloriesPerDollar () {
		return caloriesPerOunce / pricePerOunce;
	}
	public int getCaloriesPerOunce () {
		return caloriesPerOunce;
	}
	public boolean getIsVegetarian () {
		return isVeg;
	}
	public boolean getIsRice () {
		return isRice;
	}
	public boolean getIsShellfish () {
		return isShellfish;
	}
	public boolean equals(Ingredient other) {
		if(this.getName() == other.getName() && this.getCaloriesPerOunce() == other.getCaloriesPerOunce() && Math.abs(this.getPricePerOunce() - other.getPricePerOunce()) <= 0.01
				&& this.isRice == other.getIsRice() && this.isShellfish == other.getIsShellfish() && this.isVeg == other.getIsVegetarian()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
}
