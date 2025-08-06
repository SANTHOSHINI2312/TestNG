package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sele8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\DriverNew\\chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://en.wikipedia.org/wiki/Software_testing");
	driver.manage().window().maximize();
	WebElement Text1=driver.findElement(By.xpath("(//b[text()='Software testing'])[1]"));
	String msg=Text1.getText();
	System.out.println(msg);
	WebElement Text2=driver.findElement(By.xpath("(//a[text()='software'])[1]"));
	String msg2=Text2.getText();
	System.out.println(msg2);
	String attri=Text2.getAttribute("href");
	System.out.println(attri);
	WebElement Text3=driver.findElement(By.xpath("//p[contains(text(),'Software testing can determine the') or @title='Correctness (computer science)']"));
	String msg3=Text3.getText();
	System.out.println(msg3);
	
}


}
