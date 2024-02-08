package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
		
		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://google.com");
		driver1.close();
		//driver1.quit();
		
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://google.com");
		driver2.close();
		
	}

}
