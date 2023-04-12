package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsersetup {

	static WebDriver driver;
	
	
	public static WebDriver getbrowser(String browser,String environment ) {
		
		
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		}
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options= new EdgeOptions();
			 options.addArguments("--remote-allow-origins=*");
			 driver=new EdgeDriver(options);
		}
		
		if(environment.equals("dev")) {
			driver.get("https://www.lenskart.com");
		}
		
		if(environment.equals("SIT")) {
			driver.get("https://www.lenskart.com");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
	
}
