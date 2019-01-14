package armband;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ap.lib.IArmbandMachine;

public class ArmbandMachineTest {
	@Test
    public void shouldCalculateCost() {
		IArmbandMachine machine = 
				new ArmbandMachine();
		assertEquals(15, machine.getCost(3, 5),0);
	          
    }
}
