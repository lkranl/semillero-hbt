package seedbed.unitTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * <b>Description:</b> Class that has the unit test for CU1050 gestionar operaciones
 * <b>Use case:</b> CU1050 gestionar operaciones
 * @author Andrés Cruz
 */

public class ArithmeticOperationsTest {
	
	private final static Logger Log = Logger.getLogger(ArithmeticOperationsTest.class);
	
	@Test
	public void validateSumResultSucces() {
		Log.info("Begins running validateSumResultSucces()");
		int number1 = 300;
		int number2 = 150;
		int result = 450;
		
		//Assert.assertFalse(number1+number2==result);
		Assert.assertTrue(number1+number2==result);
	}

}
