package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
	Alert my_alert=driver.switchTo().alert();
	System.out.println(my_alert.getText());
	
	my_alert.accept();
	*/
	
	/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.dismiss();
		
		driver.close();
		*/
		
		//Prompt alert -input box
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
	Alert	myalert=driver.switchTo().alert();
	myalert.sendKeys("javascript");
		myalert.accept();
		
		driver.close();

	}

}
