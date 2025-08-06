package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Santoshini')", user);
		Thread.sleep(1000);
		Object get=js.executeScript("return arguments[0].getAttribute('value')",user);
		System.out.println(get);
		WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','SanHik13')", pass);
		Object pw=js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(pw);
		Thread.sleep(1000);
		WebElement butn=driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", butn);
		
	}

}
