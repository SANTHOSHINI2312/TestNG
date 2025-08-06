package Selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sele7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\DriverNew\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement Registerbtn=driver.findElement(By.xpath("//a[@title='Jobseeker Register']"));
		Registerbtn.click();
		//WebElement Txt1=driver.findElement(By.xpath("//h1[text()='Create your Naukri profile']"));
		//System.out.println(Txt1);
		WebElement fullname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fullname.sendKeys("Santhoshini Rajendran");
		Thread.sleep(1000);
	//	String txt=fullname.getText();
	//	System.out.println(txt);
		WebElement MailId=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		MailId.sendKeys("sanww11dsx@gmail.com");
		Thread.sleep(1000);
		WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("Santho5678");
		Thread.sleep(1000);
		WebElement MobileNum=driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
		MobileNum.sendKeys("9988776655");
		Thread.sleep(1000);
		WebElement Txt2=driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]"));
		Txt2.click();
			WebElement CheckBox=driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']"));
		CheckBox.click();
		Thread.sleep(1000);
		//WebElement termsandcond=driver.findElement(By.xpath("//a[contains(text(),' Terms and Conditions')]"));
		//termsandcond.click();
		Thread.sleep(1000);
		WebElement RegisterBtn=driver.findElement(By.xpath("//button[contains(text(),'Register now')]"));
		RegisterBtn.click();
		
		
		
	}

}
