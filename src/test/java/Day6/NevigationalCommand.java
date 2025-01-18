package Day6;

import org.openqa.selenium.chrome.ChromeDriver;

public class NevigationalCommand {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();

driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.navigate().to("https://demo.nopcommerce.com/");

driver.navigate()
.back();
System.out.println(driver.getCurrentUrl());//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login



driver.navigate().forward();
System.out.println(driver.getCurrentUrl());//https://demo.nopcommerce.com/


















	}

}
