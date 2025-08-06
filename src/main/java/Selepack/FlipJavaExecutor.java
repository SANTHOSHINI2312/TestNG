package Selepack;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipJavaExecutor {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement lastpage=driver.findElement(By.xpath("//div[contains(text(),'GROUP COMPANIES')]"));
	JavascriptExecutor j=(JavascriptExecutor)driver;

	j.executeScript("arguments[0].scrollIntoView(true)", lastpage);
	Thread.sleep(1000);
	WebElement firstpage=driver.findElement(By.xpath("//span[text()=\"Appliances\"]"));
	j.executeScript("arguments[0].scrollIntoView(false)", firstpage);
}
}
