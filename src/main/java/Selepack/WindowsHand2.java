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
import org.openqa.selenium.interactions.Actions;

public class WindowsHand2 {
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

	for (String id : MultiWin) {
		if(!id.equals(parentwindow)) {
			driver.switchTo().window(id);
		}
		
	}
	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).click();
		Thread.sleep(2000);
		Robot r=new Robot();
		for(int i=0;i<7;i++) {
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("laptop",Keys.ENTER);
		// page
	/*	Actions a=new Actions(driver);
		a.contextClick();
		Thread.sleep(1000);
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);*/
//WebElement iphone=	driver.findElement(By.xpath("//div[@class='yKfJKb row']//div[contains(text(),'Apple iPhone 16 (Black, 128 GB')]"));
		//WebElement iphone=driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']"));
//iphone.click();
		driver.findElement(By.xpath("//div[text()='ASUS Zenbook 14 OLED AI PC Intel Core Ultra 5 125H - (16 GB/1 TB SSD/Windows 11 Home) UX3405MA-PZ552WS...']")).click();
		Thread.sleep(2000);
		Set<String> MultiWin1=driver.getWindowHandles();
		System.out.println(MultiWin1);
		for (String id : MultiWin1) {
			if(!id.equals(parentwindow)) {
				driver.switchTo().window(id);
			}
		
		}
		
		//iphone add to cart
	WebElement addtocartrealme=	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
	addtocartrealme.click();
		TakesScreenshot ss=(TakesScreenshot)driver;
		File sou=ss.getScreenshotAs(OutputType.FILE);
		System.out.println(sou);
		File f=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\Flipkart_Page1.png");
		FileUtils.copyFile(sou, f);
	}
	
	
	
}



