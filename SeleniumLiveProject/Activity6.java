/*6. Menu checking
Goal: Make sure that the “Activities” menu item exists and is clickable
a. Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
provided.
c. Locate the navigation menu.
d. Ensure that the “Activities” menu item exists.
e. Close the browser*/


package SeleniumProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Activity6 {
	
WebDriver driver;
	
	@Test
    public void TestCase1() {
    	
    	driver = new FirefoxDriver();
    	
    	//driver.get("http://alchemy.hguy.co/crm");

}
	@Test
	 public void TestCase2() {
		
		//driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/crm");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("username_password")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.name("Login")).click();
		
		
		
		    WebElement ACTIVITIES = driver.findElement(By.cssSelector("#grouptab_3"));
	        Assert.assertTrue(ACTIVITIES.isDisplayed());
	        //Assert.assertEquals(ACTIVITIES.getText(), "ACTIVITIES");
		
		// Check the title of the page                           
       /* String title = driver.getTitle();
        
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("ACTIVITIES", title);*/
		
		
		
		driver.close();
	}
}
