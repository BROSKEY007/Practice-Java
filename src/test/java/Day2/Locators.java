package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("search")).sendKeys("Mac");
	    //Boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
	  //System.out.println(logoDisplaystatus);
	  
	  //driver.findElement(By.linkText("Tablets")).click();
	  //List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
	  //System.out.println("total number of headerlinks: " +headerLinks.size());
	  
	  //List<WebElement> headerLinks = driver.findElements(By.tagName("a"));
	  //System.out.println("total number of headerlinks: " +headerLinks.size());
		List<WebElement> image = driver.findElements(By.tagName("img"));
		  System.out.println("total number of image: " +image.size());
	
	
	}

}
