package Selepack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTask {
	static String childId;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watches",Keys.ENTER);
	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline']//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
	Thread.sleep(1000);
WebElement ProductName=driver.findElement(By.xpath("//span[contains(text(),'Noise Pro 6 Max Smart Watch:Intelligent AI, Endless AI Watch Faces, AI Companion, 1.96” AMOLED, Stainless Steel Build, Built-in GPS, 5 ATM, EN2 Processor, for iOS & Android(Chrome Black)')]"));
String name=ProductName.getText();
System.out.println("Watch name is--- "+name);
String parentwindow=driver.getWindowHandle();
System.out.println(parentwindow);

Set<String> MultiWin=driver.getWindowHandles();
//System.out.println(MultiWin);

for (String id : MultiWin) {
	if(!id.equals(parentwindow))
	childId=id;
	{
		driver.switchTo().window(id);
	}
	
}


Set<String> MultiWin1=driver.getWindowHandles();
//System.out.println(MultiWin1);

for (String id : MultiWin1) {
	if(id.equals(parentwindow))
	childId=id;
	{
		driver.switchTo().window(parentwindow);
	}
	
}
//driver.findElement(By.id("twotabsearchtextbox")).clear();
driver.findElement(By.id("twotabsearchtextbox")).click();
Robot r1=new Robot();
for(int i=0;i<9;i++) {
	r1.keyPress(KeyEvent.VK_BACK_SPACE);
	r1.keyRelease(KeyEvent.VK_BACK_SPACE);
}
Thread.sleep(1000);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airpods",Keys.ENTER);
Thread.sleep(1000);
JavascriptExecutor j=(JavascriptExecutor)driver;
WebElement airpodbtn=driver.findElement(By.xpath("(//span[text()='1,399'])[1])"));
String price=airpodbtn.getText();

//j.executeScript("arguments[0].click()",airpodbtn );
//WebElement Price=driver.findElement(By.xpath("(//span[contains(text(),'₹11,999')])[1"));
//String price=Price.getAttribute("Value");
Thread.sleep(1000);
System.out.println("The price of Airpod is--- "+price);

Set<String> MultiWin2=driver.getWindowHandles();
//System.out.println(MultiWin2);

for (String id : MultiWin2) {
	if(id.equals(parentwindow))
	childId=id;
	{
		driver.switchTo().window(parentwindow);
	}
	
}
//driver.findElement(By.id("twotabsearchtextbox")).clear();
driver.findElement(By.id("twotabsearchtextbox")).click();
Robot r=new Robot();
for(int i=0;i<8;i++) {
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	r.keyRelease(KeyEvent.VK_BACK_SPACE);
}
Thread.sleep(2000);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
WebElement mob=driver.findElement(By.xpath("(//span[contains(text(),'Tecno POP ')])[1]"));
Thread.sleep(1000);
String spec=mob.getText();
System.out.println(spec);
Set<String> MultiWin3=driver.getWindowHandles();
//System.out.println(MultiWin3);

for (String id : MultiWin3) {
	if(!id.equals(parentwindow))
	childId=id;
	{
		driver.switchTo().window(id);
	}
}
/*driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")).click();
String parentwindow1=driver.getWindowHandle();
System.out.println(parentwindow1);

Set<String> MultiWin4=driver.getWindowHandles();
System.out.println(MultiWin4);

for (String id : MultiWin4) {
	if(!id.equals(parentwindow))
	childId=id;
	{
		driver.switchTo().window(id);
	}
	
}
*/
//WebElement Specifications=driver.findElement(By.xpath("//span[contains(text(),'        Lava Bold N1 Pro (Stealth Black, 4 GB RAM, 128 GB Storage)| Bigger 6.67\" HD+ IP54 Display | 120 Hz Refresh Rate | 50 MP AI Triple Rear Camera | 8 MP Front Camera| 5000 mAh Battery| Charger in Box       ')]"));
//String spec=Specifications.getText();
//System.out.println("Mobile Specification--- "+spec);
}
}
