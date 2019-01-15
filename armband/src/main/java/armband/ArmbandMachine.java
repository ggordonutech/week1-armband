package armband;

import ap.lib.IArmbandMachine;

public class ArmbandMachine 
    implements IArmbandMachine
{

	private String name;
	
	public ArmbandMachine() {
		name="Simple Machine";
	}
	
	public ArmbandMachine(String name) {
		this.name = name;
	}
	public float getCost(float price, int quantity) {
		return price * quantity;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
