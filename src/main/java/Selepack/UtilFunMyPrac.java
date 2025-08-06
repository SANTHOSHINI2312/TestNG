package Selepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilFunMyPrac {
	static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\DriverNew\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(op);
	}
	public static void URL(String url) {
		driver.get(url);
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void move(WebElement el) {
		//Actions a =new Actions(driver);
		//a.moveToElement(el).click();
		el.click();
		
	}
	public static void from(WebElement el) {
		el.click();
	}
	public static void select(WebElement el) {
		Select s=new Select(el);
		s.selectByIndex(6);
	}
	public static void close() {
		driver.quit();
	}
}
