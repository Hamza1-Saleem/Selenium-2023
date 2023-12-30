package first.project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		For Edge Browser
		WebDriver driver;
		System.setProperty("edge driver path", "C:\\Users\\My PC\\Downloads");
		driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle=driver.getWindowHandle();
//		System.out.println(parenthandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
//		System.out.println(handle);
		for(String handle :handles)
		{
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("QA");
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("hello");
		Thread.sleep(4000);
	}

}
