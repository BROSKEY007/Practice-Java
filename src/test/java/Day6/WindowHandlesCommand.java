package Day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesCommand {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String>windowIDs=driver.getWindowHandles();
		
		//approach1  for 1 or 2 window ids
		
		/*List<String> windList = new ArrayList(windowIDs);
	String	parentId=windList.get(0);
		String childId= windList.get(1);
		
		
		//switching to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		*/
		
		//approach 2 for multiple windows ids more than 5
		
		for(String windId:windowIDs) {
			
			String  title =driver.switchTo().window(windId).getTitle();
			
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
