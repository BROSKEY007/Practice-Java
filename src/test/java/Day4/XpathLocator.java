package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
 ChromeDriver driver = new ChromeDriver();
 
 driver.get("https://demo.nopcommerce.com/");
 driver.manage().window().maximize();
 
 //Xpath with single attribute 
 
 //driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
 
 //Xpath using and or 
 
 //driver.findElement(By.xpath("//input[@placeholder='Search store' and @aria-label='Search store']")).sendKeys("Samsung");
 
 //driver.findElement(By.xpath("//input[@placeholder='Search store' or @aria-label='search store']")).sendKeys("Samsung");
 
 //Xpath using inner text
 
 //driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
 
 /*Boolean displaystatus=driver.findElement(By.xpath("//strong[text()='Featured products']")).isDisplayed();
 System.out.println(displaystatus);
 
String value=driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
 System.out.println(value);
 */
 
 Boolean displaystatus=driver.findElement(By.xpath("//*[@class='header-logo']/a/img")).isDisplayed();
 System.out.println(displaystatus);
 
 
 
 
 
 
	}

}
