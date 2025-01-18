package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteTimeCommand {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	}

}
