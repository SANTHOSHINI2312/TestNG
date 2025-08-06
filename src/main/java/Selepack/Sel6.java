package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sel6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Loginbtn=driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		Loginbtn.click();
		WebElement crtact=driver.findElement(By.xpath( "//a[@class='azBkHf']"));
		crtact.click();
		Thread.sleep(1000);
		WebElement mobnum=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		mobnum.sendKeys("9988765544");
		WebElement contbtn=driver.findElement(By.xpath(" //button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		contbtn.click();
		Thread.sleep(2000);
		driver.close();
	}

}
