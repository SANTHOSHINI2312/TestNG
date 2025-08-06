package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement mailid=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		mailid.sendKeys("Santoshini");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("san6737");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}
}
