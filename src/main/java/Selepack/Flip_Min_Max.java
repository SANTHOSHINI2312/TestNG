package Selepack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Flip_Min_Max {
	static String childId;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
	WebElement MinimumPrice=driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
	Select s=new Select(MinimumPrice);
	s.selectByVisibleText("₹10000");
	Thread.sleep(1000);
	WebElement MaximumPrice=driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]"));
	Thread.sleep(1000);
	Select s2=new Select(MaximumPrice);
	s2.selectByVisibleText("₹20000");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Tecno Pova 6 Neo 5G (Azure Sky, 128 GB)']")).click();
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
	Set<String> MultiWin=driver.getWindowHandles();
	System.out.println(MultiWin);

	for (String id : MultiWin) {
		if(!id.equals(parentwindow))
		childId=id;
		{
			driver.switchTo().window(id);
		}
		
	}
	//add to cart
	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
	Thread.sleep(1000);
	String MultiWin1=driver.getWindowHandle();
	System.out.println(MultiWin1);
	Thread.sleep(1000);
int count=0;
	for (String id : MultiWin) {
		if(count==2)
		childId=id;
		{
			driver.switchTo().window(parentwindow);
		}
		count++;
	}
driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='Motorola G85 5G (Olive Green, 256 GB)']")).click();

Set<String> MultiWin2=driver.getWindowHandles();
System.out.println(MultiWin2);

for (String id : MultiWin2) {
	if(count!=2)
	childId=id;
	{
		driver.switchTo().window(id);
	}
	
}
//add to cart
driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
Thread.sleep(1000);
//place order
driver.findElement(By.xpath("//span[text()='Place Order']")).click();

	}
	}

