package Selepack;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class XpathEg {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	Thread.sleep(2000);
	//Actions a=new Actions(driver);
WebElement gaming=driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']//child::div[1]//child::object//child::a//following-sibling::a//following-sibling::a//following-sibling::a//following-sibling::a[1]//ancestor::div[2]//child::div[2]//child::object//child::div//following-sibling::a//following-sibling::a"));
	//WebElement gaming=driver.findElement(By.xpath("(//div[@class='_1UgUYI _2eN8ye']//child::div)[1]//child::object//child::a//following-sibling::a[4]//ancestor::div[2]//child::div[2]//child::div//following-sibling::a[3]"));
Thread.sleep(2000);
gaming.click();
}
}