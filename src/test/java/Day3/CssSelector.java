package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    
    //tag id
    //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
    
    //tag.classname
    //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
    
    //tag [attribute='value']
    
    //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
    
    //tag.classname[attribute='value']
    
    driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");
    
    
    
    
	}

}
