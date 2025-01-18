package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitCommand {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	WebElement	txtusername=mywait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("admin");
		
		WebElement logbtn= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		logbtn.click();
		
		
		
		
	}

}
