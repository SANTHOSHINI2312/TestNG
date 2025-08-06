package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sele9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\DriverNew\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		driver.manage().window().maximize();
		WebElement Text1=driver.findElement(By.xpath("//h1[contains(text(),'WebDriver')]"));
		String msg=Text1.getText();
		System.out.println(msg);
		WebElement Text2=driver.findElement(By.xpath("//a[contains (text(),'Documentation')]"));
		String msg2=Text2.getText();
		System.out.println(msg2);
		String attri=Text2.getAttribute("href");
		System.out.println(attri);
		WebElement Text3=driver.findElement(By.xpath("//a[contains (text(),'Documentation') or @class='breadcrumb-item active']"));
		String msg3=Text3.getText();
		System.out.println(msg3);
		WebElement Text4=driver.findElement(By.xpath("//a[contains (text(),'Documentation') and @a='href']"));
		String msg4=Text4.getText();
		System.out.println(msg4);
		
		
	}


	
}
