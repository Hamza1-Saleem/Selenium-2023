package first.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lec3 {

	private static WebElement WebElement;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initlize the Geko driver
		WebDriver driver;
		
//		For Firefox Browser
//		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\My PC\\Downloads");
//		driver = new FirefoxDriver();
		
//		For Edge Browser
		System.setProperty("edge driver path", "C:\\Users\\My PC\\Downloads");
		driver = new EdgeDriver();
			
		
		driver.get("https://www.facebook/login");
//		driver.close();
	    WebElement email=driver.findElement(By.id("email"));
	    email.sendKeys("hamzasaleemsepra786@gmail.com");
	    
	    WebElement pass=driver.findElement(By.id("pass"));
	    pass.sendKeys("HAMZA1234567-8");
	    
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    	    
	}
}