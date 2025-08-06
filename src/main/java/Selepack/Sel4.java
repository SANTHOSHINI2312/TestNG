package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class Sel4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(op);
driver.get("https://accounts.google.com/lifecycle/steps/signup/name?authuser=0&continue=https://myaccount.google.com/security&dsh=S1746976082:1748350759642863&ec=GAlAwAE&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=accountsettings&TL=AArrULQjbsQ7n5TwtdlCcE8h2RccgEYtIi3EFZ9h6HofnWGKQklSgEQva1kZItoL");
driver.manage().window().maximize();
WebElement Username=driver.findElement(By.name("firstName"));
Username.sendKeys("Santhoshini");
//WebElement password=driver.findElement(By.className("VfPpkd-vQzf8d"));
//password.sendKeys("San67554");
//WebElement loginbutton=driver.findElement(By.className("btn-primary loginButton"));
//loginbutton.click();
Thread.sleep(2000);
driver.quit();

}
}
