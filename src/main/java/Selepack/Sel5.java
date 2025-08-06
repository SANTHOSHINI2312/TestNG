package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sel5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(op);
driver.navigate().to("https://www.nau");
driver.manage().window().maximize();
WebElement skillname=driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]"));
skillname.sendKeys("Testing Manager");
WebElement skilltype=driver.findElement(By.xpath("//div[@title='Testing Manager']"));
skilltype.click();
WebElement Locationbtn=driver.findElement(By.xpath("(//input[@type='text'])[3])"));
Locationbtn.sendKeys("Chennai");
WebElement SearchKey=driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
SearchKey.click();
Thread.sleep(2000);
driver.navigate().refresh();
driver.close();

}
}
