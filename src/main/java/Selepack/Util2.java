package Selepack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Util2 extends UtilFunMyPrac {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
	launch();
	Properties p=new Properties();
	p.load(new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\test.properties"));
	String s=p.getProperty("URL2");
	URL(s);
max();
Thread.sleep(1000);
move(driver.findElement(By.xpath("//span[contains(text(),'Flight Bookings')]")));
Thread.sleep(2000);
//String s1=p.getProperty("From");
//from(driver.findElement(By.xpath("(//div[@class='Reem3Q PNc-Ga _92tk+3'])[2]")));
select(driver.findElement(By.xpath("driver.findElement(By.xpath(\"(//div[@class='Reem3Q PNc-Ga _92tk+3'])[2]\"))")));
//close();
	
}


}