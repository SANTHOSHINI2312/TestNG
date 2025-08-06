package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RobotEg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement loginbtn=driver.findElement(By.id("email"));
	Actions a =new Actions(driver);
	a.keyDown(loginbtn,Keys.SHIFT).sendKeys(loginbtn,"Santhoshini Rajendran").keyUp(loginbtn, Keys.SHIFT).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.id("pass")).sendKeys("San123445",Keys.ENTER);
	}

}
