package armband;

import ap.lib.IArmbandMachine;

public class ArmbandMachine 
    implements IArmbandMachine
{

	public float getCost(float price, int quantity) {
		return price * quantity;
	}

}
