package armband;

import ap.lib.IArmbandMachine;

public class Driver {

	public static void main(String[] args) {
		IArmbandMachine machine = 
				new ArmbandMachine();
		System.out.println("Cost : "+
				          machine.getCost(3, 5));
		

	}

}
