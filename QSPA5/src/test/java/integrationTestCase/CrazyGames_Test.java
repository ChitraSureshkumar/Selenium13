package integrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CrazyGames_Test {
	 @Test(groups = "Games")
     public void browserOpen() throws InterruptedException
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.crazygames.com/t/gta");
    	 Thread.sleep(3000);
    	 driver.quit();		 
     }

}
