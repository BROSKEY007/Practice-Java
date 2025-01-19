package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		
		//frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);//swtich to fram1 
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		
		driver.switchTo().defaultContent();
		
		//frame2
		
	WebElement	frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	
	
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
driver.switchTo().defaultContent();

//frame3

WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
driver.switchTo().frame(frame3);		

driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("JAVA");

driver.switchTo().frame(0);// switching to iframe using index method


driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']")).click();

driver.findElement(By.xpath("//span[@class='vRMGwf oJeWuf']")).click();

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
