package Selepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumEg1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\driverfox\\geckodriver.exe" );
		FirefoxOptions op=new FirefoxOptions();
		op.addArguments("--remote-allow-origins=*");
WebDriver driver=new FirefoxDriver(op);
//driver.get("https://www.flipkart.com/");
driver.navigate().to("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.navigate().refresh();
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
	}
	

}
