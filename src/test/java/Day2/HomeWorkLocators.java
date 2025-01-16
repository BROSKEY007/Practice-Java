package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkLocators {

	public static void main(String[] args) {
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://demoblaze.com/");
 driver.manage().window().maximize();
 
//driver.findElement(By.linkText("Laptops")).click();
 //List<WebElement> headerLinks = driver.findElements(By.className("nav-item"));
 //System.out.println("total number of headerlinks: " +headerLinks.size());
	
 //List<WebElement> webLinks = driver.findElements(By.tagName("a"));
 //System.out.println("total number of headerlinks: " + webLinks.size());
	
 List<WebElement> image = driver.findElements(By.tagName("img"));
 System.out.println("total number of image: " +image.size());
	
	}

}
