package Selepack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandlingEg {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("Mobiles",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@id=\"container\"]//div[@class='KzDlHZ'])[1]")).click();
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
	Set<String> MultiWin=driver.getWindowHandles();
	System.out.println(MultiWin);

	for (String page2 : MultiWin) {
		if(!page2.equals(parentwindow)) {
			driver.switchTo().window(page2);
		}
		
	}
	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).click();
		Robot r=new Robot();
		for(int i=0;i<7;i++) {
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("Apple iPhone 16 (Black, 128 GB)",Keys.ENTER);
		//realme page
WebElement iphone=	driver.findElement(By.xpath("//div[@data-id='MOBH4DQFG8NKFRDY']//div[@class='_4WELSP']//img[@alt='Apple iPhone 16 (Black, 128 GB)']"));
iphone.click();
		Set<String> MultiWin1=driver.getWindowHandles();
		System.out.println(MultiWin1);
		for (String page3 : MultiWin1) {
			if(!page3.equals(parentwindow)) {
				driver.switchTo().window(page3);
			}
		
		}
		
		//realme add to cart
	WebElement addtocartrealme=	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	addtocartrealme.click();
		TakesScreenshot ss=(TakesScreenshot)driver;
		File sou=ss.getScreenshotAs(OutputType.FILE);
		System.out.println(sou);
		File f=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\Flipkart_Page1.png");
		FileUtils.copyFile(sou, f);
	}
	
	
	
}
