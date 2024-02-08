package breakOutSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium_20dec {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		
		

	}

}
