package implementation;

import org.testng.annotations.Test;

import PageObjectModel.driverSetup;

public class B_LogOut extends A_Flipkarttest {
	
	@Test
	public void BLogOut() {
		
		driver.quit();
		
	}

}
