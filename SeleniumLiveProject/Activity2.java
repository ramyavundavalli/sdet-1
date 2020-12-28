/*2. Get the url of the header image
Goal: Print the url of the header image to the console
a. Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’.
c. Get the url of the header image.
d. Print the url to the console.
e. Close the browser*/


package SeleniumProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	
	@Test
    public void TestCase1() {
    	
    	driver = new FirefoxDriver();
    	
    	//driver.get("http://alchemy.hguy.co/crm");
    	
    }
	
	
	
	@Test
    public void TestCase2() {
		
		driver.get("http://alchemy.hguy.co/crm");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();		
		
		
		//System.out.println(urlname);
	}
}
	
	
		
		
