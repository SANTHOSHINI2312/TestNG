package Selepack;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsAndScreenshot {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	Thread.sleep(1000);
	Alert a=driver.switchTo().alert();
	Thread.sleep(1000);
	a.accept();
	TakesScreenshot ss=(TakesScreenshot)driver;
	File sou=ss.getScreenshotAs(OutputType.FILE);
	System.out.println(sou);
	File f=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\screenshot1.png");
	FileUtils.copyFile(sou, f);
	driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
	Thread.sleep(1000);
	a.dismiss();
	TakesScreenshot ss1=(TakesScreenshot)driver;
	File sou1=ss1.getScreenshotAs(OutputType.FILE);
	System.out.println(sou);
	File f1=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\screenshot2.png");
	FileUtils.copyFile(sou1, f1);
	driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])")).click();
	Thread.sleep(1000);
	a.sendKeys("Santhoshini");
	Thread.sleep(1000);
	String t=a.getText();
	System.out.println(t);
	Thread.sleep(1000);
	a.accept();
	TakesScreenshot ss2=(TakesScreenshot)driver;
	File sou2=ss2.getScreenshotAs(OutputType.FILE);
	System.out.println(sou);
	File f2=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\screenshot.png");
	FileUtils.copyFile(sou2, f2);
	
	
}
}