package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sel10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\DriverNew\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://presidentofindia.nic.in/dr-apj-abdul-kalam-profile");
		driver.manage().window().maximize();
		WebElement Text1=driver.findElement(By.xpath("//span[text()='DR. A.P.J. Abdul Kalam']"));
		String msg=Text1.getText();
		System.out.println(msg);
		WebElement Text2=driver.findElement(By.xpath( "//h5[@class='profile-download']"));
		String msg2=Text2.getText();
		System.out.println(msg2);
		String attri=Text2.getAttribute("href");
		System.out.println(attri);
		WebElement Text3=driver.findElement(By.xpath("//p[contains(text(),'Born ') or @class='pm-menu']"));
		String msg3=Text3.getText();
		System.out.println(msg3);
		WebElement Text4=driver.findElement(By.xpath("//p[contains(text(),'Born ') and @class='pm-menu']"));
		String msg4=Text4.getText();
		System.out.println(msg4);
}
}
