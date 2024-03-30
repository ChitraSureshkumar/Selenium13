package smokeTetCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho_Test {
	 @Test(groups = "Ecommerce")
     public void browserOpen() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.meesho.com/");
    	 Thread.sleep(3000);
    	 driver.quit();	 
     }

}
