package Selepack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice3 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement el=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	el.click();
	Thread.sleep(1000);
	Alert a=driver.switchTo().alert();
	Thread.sleep(1000);
	a.accept();
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(1000);
	a.dismiss();
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	a.sendKeys("Santhoshini");
	Thread.sleep(1000);
	String t=a.getText();
	System.out.println(t);
	a.accept();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File source=tk.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	File destination=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\santo.png");
FileUtils.copyFile(source,destination);
	
	
}
}
