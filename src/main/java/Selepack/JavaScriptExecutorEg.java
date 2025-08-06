package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorEg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].setAttribute('value','Santhoshini Rajendran')", username);
	//print on console
	Object usernamereturn=j.executeScript("return arguments[0].getAttribute('value')",username);
	System.out.println(usernamereturn);
WebElement pwd=	driver.findElement(By.xpath("//input[@type='password']"));
j.executeScript("arguments[0].setAttribute('value', 'San1234')", pwd);
Object pwdreturn=j.executeScript("return arguments[0].getAttribute('value')",pwd );
System.out.println(pwdreturn);
WebElement lgn=driver.findElement(By.xpath("//button[@name='login']"));
j.executeScript("arguments[0].click()", lgn);
			}

}
