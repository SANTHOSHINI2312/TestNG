package Selepack;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class SelectOptions2 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\Driver\\chromedriver.exe" );
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[2]")).click();
	
	
	WebElement OptionBtn =driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	Select s=new Select(OptionBtn);
	
	
boolean b1=s.isMultiple();
	System.out.println(b1);
	//s.selectByIndex(1);
	s.selectByValue("audi");
	//s.selectByVisibleText("Opel");
	List <WebElement> OptionBtn1 =s.getOptions();
	for(int i=0;i<OptionBtn1.size();i++) {
		System.out.println(OptionBtn1.get(i).getText());
	}
	
	WebElement Multi=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
	Select s2=new Select(Multi);
	boolean b=s2.isMultiple();
	System.out.println(b); 
	s2.selectByIndex(2);
s2.deselectAll();
	}
}
