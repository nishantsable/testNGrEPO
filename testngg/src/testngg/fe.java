package testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fe {

	@Test
	public void abc() {
	 WebDriver driver = new FirefoxDriver();
	 
	 
	 driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=tjdGWtmBDYfT8gfVqpzICA");
	 
		String ff =	driver.getTitle();
			
			System.out.println(ff);
			
		    driver.quit();
		  
		 
		  // Once Before method is completed, Test method will start
		 
	}	 
		
}
