package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

driver.manage().window().maximize();

//IsDisplayed()

boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println("display status :"+ status);
	
	//isEnabled()
	
boolean position =	driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	System.out.println("enable position :"+ position);
	
	//isSelected()
	
	WebElement ml_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
	
	WebElement fl_button = driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println("Before clicking any button : ---------------------------");
	System.out.println(ml_button.isSelected());//false
	
	System.out.println(fl_button.isSelected());//false
	
	System.out.println("after clicking male button: -------------------------------");
	fl_button.click();
	System.out.println(ml_button.isSelected());//false
	System.out.println(fl_button.isSelected());//true
	
	
	boolean newsletterstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	System.out.println("newsletter status:"+newsletterstatus);//true
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
