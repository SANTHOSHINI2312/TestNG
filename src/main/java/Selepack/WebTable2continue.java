package Selepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable2continue extends UtilFunctions {
	static int rowpos=0;
	static int colpos=0;
	
	public static void main(String[] args) {
				launch();
			URL("https://demo.guru99.com/test/web-table-element.php");
			max();
			
			max();
			List<WebElement> header=driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
			int headersize=header.size();
			//System.out.println("Header size--"+headersize);
			//System.out.println("---------------------------");
			List<WebElement> Rowsize=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
			int rowsize=Rowsize.size();
		//	System.out.println("Total Rows--"+rowsize);
			///System.out.println("---------------------------");
			
			
		WebElement comp=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Company']"));	
		WebElement grp=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Group']"));	
		WebElement prev=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Prev Close (Rs)']"));	
		WebElement curr=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='Current Price (Rs)']"));	
		WebElement change=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[text()='% Change']"));	
		
			int compIndex=header.indexOf(comp)+1;
			int grpIndex=header.indexOf(grp)+1;
			int prevIndex=header.indexOf(prev)+1;
			int currIndex=header.indexOf(curr)+1;
			int chngIndex=header.indexOf(change)+1;
			//to find changeindex
			for (int i = 1; i < rowsize; i++) {
				
				WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+chngIndex+"]"));
				String value=Allrowvalues.getText();
				System.out.println(value);
				
			}		
			
			
for (int i = 1; i < rowsize; i++) {
				
				WebElement Allrowvalues=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+compIndex+"]"));
				String value=Allrowvalues.getText();
				System.out.println(value);
				
			}		
			
	}

}
