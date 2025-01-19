package Day7;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingtoHighest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	
	driver.get("https://computermania.com.bd/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement searchbox=driver.findElement(By.xpath("//input[@class='s']"));
	searchbox.sendKeys("ASUS TUF");
	
	driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
	
	List<WebElement>Laptopprice= driver.findElements(By.tagName("bdi"));
	
	// fetching all ASUS TUF price 
	for(int i=0;i<Laptopprice.size();i++) {
		String text=Laptopprice.get(i).getText();
	  System.out.println(text);
	
	}
	//Sorting
	
	String[] Laptopprice1 = {"৳ 192,900",
			"৳ 177,900",
			"৳ 287,900",
			"৳ 265,900",
			"৳ 120,900",
			"৳ 102,900",
			"৳ 254,900",
			"৳ 235,900",
			"৳ 264,900",
			"৳ 244,900",
			"৳ 243,000",
			"৳ 225,000",
			"৳ 218,900",
			"৳ 198,900"
	}; Arrays.sort(Laptopprice1);
	System.out.println("Laptop lowest price to highest price : "+Arrays.toString(Laptopprice1));
	
	
	
	driver.close();  
	
	
	
	
	
	}

}
