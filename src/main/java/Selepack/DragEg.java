package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragEg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement Source=driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
	WebElement Desti=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
	Actions a=new Actions(driver);
	//Thread.sleep(1000);
	a.dragAndDrop(Source, Desti).build().perform();
	Thread.sleep(1000);
	a.clickAndHold(Desti).build().perform();
	Thread.sleep(1000);
	//a.contextClick().build().perform();
	//Thread.sleep(1000);
	//a.clickAndHold(Desti);
	//Thread.sleep(1000);
		
	}

}
