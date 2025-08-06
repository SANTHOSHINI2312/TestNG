package Selepack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsandRobot extends UtilFunctions {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		launch();
		Properties p=new Properties();
		p.load(new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\test.properties"));
		String s=p.getProperty("URL");
	URL(s);
	max();
	String Cur=CurrentURL();
	System.out.println(Cur);
	String name=p.getProperty("Username");
	Type(driver.findElement(By.id("email")),name);
	String pass=p.getProperty("Password");
	Type(driver.findElement(By.id("pass")),pass);
	rightclick(driver.findElement(By.xpath("//div[@class='_8ice']")));
	ButtonClick(driver.findElement(By.xpath("//button[@value='1']")));
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\DriverNew\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ElectronicsButton=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		//MovetoElement()
		a.moveToElement(ElectronicsButton).perform();
		Thread.sleep(1000);
		WebElement Gamingbtn=driver.findElement(By.xpath("//div[@class=\"_16rZTH\"]//a[5]"));
		//build(), perform()
		Thread.sleep(1000);
		a.moveToElement(Gamingbtn).build().perform();
	driver.findElement(By.xpath( "//a[contains(text(),'Gaming Keyboards')]")).click();
	}
*/
}

	
}