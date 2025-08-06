package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Sel3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(op);
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement Username=driver.findElement(By.id("email"));
Username.sendKeys("Santhoshini");
WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("San67554");
WebElement loginbutton=driver.findElement(By.name("login"));
loginbutton.click();
//Thread.sleep(2000);
//driver.quit();


}

}
