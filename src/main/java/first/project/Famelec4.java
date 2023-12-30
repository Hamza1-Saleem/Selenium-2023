package first.project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Famelec4 {
//Frame
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		For Edge Browser
		WebDriver driver;
		System.setProperty("edge driver path", "C:\\Users\\My PC\\Downloads");
		driver = new EdgeDriver();
		driver.get("https://blogpendingtasks.blogspot.com/p/?m=0/r/n");
		
		driver.switchTo().frame("navbar-iframe");
		driver.findElement(By.id("b-query")).click();		
	}
}