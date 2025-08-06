package Selepack;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iFrameEg {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
//WebElement text=driver.findElement(By.xpath("//a[text()='Automation Testing Tutorial for Beginners']"));
//String printtext=text.getText();
//System.out.println(printtext);
//JavascriptExecutor j=(JavascriptExecutor)driver;
//j.executeScript("arguments[0].scrollIntoView(true)", text);
WebElement frametag=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
driver.switchTo().frame(frametag);
WebElement playbutton=driver.findElement(By.xpath("//button[@title='Play']"));
playbutton.click();


}
}