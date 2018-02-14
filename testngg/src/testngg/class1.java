package testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class1 {

	public WebDriver driver;
	
	

	 
	  @Test
	  @Parameters("browser")
	 
	
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Here I am setting up the path for my IEDriver
	 
		  System.setProperty("webdriver.ie.driver", "C:\\personal\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
	 
		  driver = new InternetExplorerDriver();
	  }  
	  
	  
	    driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=tjdGWtmBDYfT8gfVqpzICA");
		 
	String ff =	driver.getTitle();
		
		System.out.println(ff);
		
	    driver.quit();
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	 
	}