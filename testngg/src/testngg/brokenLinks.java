package testngg;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class brokenLinks {

public static void main(String[] args) throws IOException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\personal\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();

		 /* driver.get("https://tp-automation.aws-staging.diamondmindinc.com/site");
			
			driver.findElement(By.cssSelector("#LoginForm_username")).sendKeys("dhee@g.com");
			driver.findElement(By.cssSelector("#LoginForm_password")).sendKeys("Dheeraj1");
		    driver.findElement(By.cssSelector(".row.buttons>input")).click();*/
		  
		  
		    driver.get("https://myqat.rotary.org/");
		    
		    Thread.sleep(2000);
		    
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  
		  List<WebElement> total_links = driver.findElements(By.tagName("a"));
		  System.out.println("Total Number of links found on page = " + total_links.size());
		  
		  
		  boolean isValid = true;
		  for (int i = 0; i < total_links.size(); i++) {
			  
		   String url = total_links.get(i).getAttribute("href");

		   if (url != null && !url.contains("javascript")) {
		    
		   
		    isValid = getResponseCode(url);
		    
		   
		    
		    if (isValid) {
		     System.out.println("Valid Link:" + url);
		     System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
		     System.out.println();
		     
		    } else {
		     System.out.println("Broken Link ------> " + url);
		     System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
		     System.out.println();
		    }
		    
		   } else {    
		    
		    System.out.println("String null");
		    System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
		    System.out.println();
		    continue;
		   }
		  }
		  driver.close();
		 }

		
	
		 public static boolean getResponseCode(String chkurl) {
		  boolean validResponse = true;
		  try {   
		   //Get response code of URL
		   HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(chkurl));
		   int resp_Code = urlresp.getStatusLine().getStatusCode();
		   
		  
		   System.out.println("Response Code Is : "+resp_Code);
		   if ((resp_Code == 500||resp_Code == 404 )) {
		    validResponse = false;
		   } else {
		    validResponse = true;
		   }
		  } catch (Exception e) {

		  }
		  return validResponse;
		 }
		}