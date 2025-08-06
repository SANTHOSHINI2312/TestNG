package Selepack;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://practice.expandtesting.com/dropduujnown");
	driver.manage().window().maximize();
WebElement OptionBtn=driver.findElement(By.xpath("//select[@id='dropdown']"));
Select s=new Select(OptionBtn);
s.selectByValue("2");
Thread.sleep(2000);
WebElement Number=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
Select s1=new Select(Number);
s1.selectByIndex(03);
Thread.sleep(2000);
WebElement countryBtn=driver.findElement(By.id("country"));
Select s2=new Select(countryBtn);
s2.selectByVisibleText("India");
WebElement Number1=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
Select s3=new Select(Number1);
boolean m=s3.isMultiple();  
System.out.println(m);
Thread.sleep(1000);
	
	}	
}
