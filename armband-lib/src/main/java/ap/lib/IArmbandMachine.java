package ap.lib;

public interface IArmbandMachine {
	String getName();
	/**
	 * <i>getCost</i>
	 * Calculates the cost of an armband
	 * @param price - cost of the armband
	 * @param quantity - amount of armbands
	 * */
	float getCost(float price, int quantity);

}
