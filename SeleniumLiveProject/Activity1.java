/*1. Verify the website title
Goal: Read the title of the website and verify the text
a. Open a browser.
b. Navigate to ‘http://alchemy.hguy.co/crm’.
c. Get the title of the website.
d. Make sure it matches “SuiteCRM” exactly.
e. If it matches, close the browser.*/




package SeleniumProjectTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    
   
    
    @Test
    public void TestCase1() {
    	
    	driver = new FirefoxDriver();
    	
    	driver.get("http://alchemy.hguy.co/crm");
    	
        // Check the title of the page
        String title = driver.getTitle();
        
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("SuiteCRM", title);
        driver.close();
    }
    
   
}
                    