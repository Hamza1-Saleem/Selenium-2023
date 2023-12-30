package first.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("edge driver path", "C:\\Users\\My PC\\Downloads");
		driver = new EdgeDriver();
//		driver.get("https://www.python.org");
//		driver.findElement(By.id("id-search-field")).sendKeys("By id");
//		driver.findElement(By.className("search-field")).sendKeys("By Class name");
//		driver.findElement(By.name("q")).sendKeys("By name");
//		driver.findElement(By.tagName("input")).sendKeys("By Tagname");
//      driver.get("https:/demo.guru99.com/test/link.html");
//      driver.findElement(By.linkText("click here")).click();
//		driver.get("https://magento.softwaretestingboard.com/");
//		driver.findElement(By.cssSelector("#search")).sendKeys("css selector");
//		driver.findElement(By.cssSelector("input.input-text")).sendKeys("tag-name");
//		driver.findElement(By.cssSelector("input#search")).sendKeys("tag-id");
		
//		Xpath 
		driver.get("https://ultimateqa.com/");
// 		Absolute Path 
//		driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
	
//		Relative Path 
		driver.findElement(By.xpath("//a[contains(@class,'et_pb_button')")).click();)
	}

}
