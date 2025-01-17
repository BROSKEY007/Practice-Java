package Day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		
		//get(URL)----- OPENS THE URL ON THE BROWSER

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//getTitle()--- return title of the page
		
		System.out.println(driver.getTitle()); //OrangeHRM

		//getCurrentUrl()-return URL of the page
		
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		//getPageSource()--- return page source of the page
		
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()--- return id of the single browser window
		
		//String window = driver.getWindowHandle();
		//System.out.println("the id of this window is : "+window);//AB551301DE2B326ABDD2F8CF9A308637
		
		//getWindowHandles()-- return id of the multiple browser window
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>winids=driver.getWindowHandles();
		System.out.println("id of the window is : "+winids);
		
		
	}

}
