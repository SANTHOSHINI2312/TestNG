package Selepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UtilFunctions {
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
public static String CurrentURL() {
	String cur=driver.getCurrentUrl();
	return cur;
}
//sendkeys
public static void Type(WebElement el, String val) {
	el.sendKeys(val);
}
public static void ButtonClick(WebElement el) {
	el.click();
}
public static void close() {
	driver.quit();
}
public static void rightclick(WebElement el) {
	Actions a =new Actions(driver);
	a.contextClick().build().perform();
}
public static void doubleclick(WebElement el) {
	Actions a=new Actions(driver);
	a.doubleClick().build().perform();
	
}

}