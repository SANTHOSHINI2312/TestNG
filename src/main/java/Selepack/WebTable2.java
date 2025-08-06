package Selepack;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebTable2 extends UtilFunctions{
	static int rowpos=0;
	static int colpos=0;
	public static void main(String[] args) {
		launch();
		URL("https://demo.guru99.com/test/web-table-element.php");
		max();
		List<WebElement> header=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		int headersize=header.size();
		System.out.println("Header size--"+headersize);
		System.out.println("---------------------------");
		List<WebElement> Rowsize=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		int rowsize=Rowsize.size();
		System.out.println("Total Rows--"+rowsize);
		System.out.println("---------------------------");
		
		//all values
		for (int i = 1; i < rowsize; i++) {
			for (int j = 1; j < headersize; j++) {	
			WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
			String value=Allrowvalues.getText();
			System.out.println(value);
		}
		}
		System.out.println("---------------------------");
		
		
		
		for (int i = 1; i < rowsize; i++) {
			for (int j = 1; j < headersize; j++) {	
			WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
			String value=Allrowvalues.getText();
		if(value.contains("Chennai")) {
			System.out.println(value);
			System.out.println("Row: "+i);
			rowpos=i;
			System.out.println("Column: "+j);
			colpos=j;
		}
			}
		}
		System.out.println("-------------------------------");
		System.out.println("ROW VALUE ITERATION ONLY BELOW");
		System.out.println("-------------------------------");
		//To iterate row value only
		for (int i = 1; i < rowsize; i++) {
			WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+colpos+"]"));
			String value1=Allrowvalues.getText();
			System.out.println(value1);
			}
		System.out.println("-------------------------------");
		System.out.println("COLUMN VALUE ITERATION ONLY BELOW");
		System.out.println("-------------------------------");
		//To iterate column value only
		for (int i = 1; i < headersize; i++) {
			WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+rowpos+"]//td["+i+"]"));
			String value1=Allrowvalues.getText();
		System.out.println(value1);
			}
		}
				
		}
	
	
		
	
	



