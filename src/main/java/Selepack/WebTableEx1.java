package Selepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableEx1 extends UtilFunctions{
	public static void main(String[] args) {
		launch();
		URL("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		max();
		
		
		
		List<WebElement> tableNo=driver.findElements(By.tagName("table"));
		int tsize=tableNo.size();
		System.out.println("No of tables --"+tsize);
		
		
		WebElement t=tableNo.get(1);
		List<WebElement> rows=t.findElements(By.tagName("tr"));
		int rowsize=rows.size();
		System.out.println("No.rows-- "+rowsize);
		
		
		//to print all values from the table
		for (int i = 0; i < rowsize; i++) {
			System.out.println(rows.get(i).getText());
		}
		System.out.println("------------------------------------------------");
		
		
		
		//to get particular row values
WebElement row1=rows.get(2);
List<WebElement> theader=row1.findElements(By.tagName("td"));
WebElement Firstvalue=theader.get(1);
String val=Firstvalue.getText();
System.out.println("2nd row 2nd value-- "+val);
System.out.println("---------------------");





//to get header datas
WebElement row2=rows.get(2);
List<WebElement> theader2=row2.findElements(By.tagName("th"));
WebElement Burj=theader2.get(0);
String val1=Burj.getText();
System.out.println("Headers value-- "+val1);
System.out.println("---------------------");




//print all headers from row and column
for (int i = 0; i < rowsize; i++) {
	WebElement eachrow=rows.get(i);
	List<WebElement> eachvalue=eachrow.findElements(By.tagName("th"));
	int rowdatasize=eachvalue.size();
	for (int j = 0; j < rowdatasize; j++) {
		WebElement data=eachvalue.get(j);
		String print=data.getText();
		System.out.println(print);
		
	}
	
}
System.out.println("---------------------");





//to print all data row wise
for (int i = 0; i < rowsize; i++) {
	WebElement eachrow=rows.get(i);
	List<WebElement> eachvalue=eachrow.findElements(By.tagName("td"));
	int rowdatasize=eachvalue.size();
	for (int j = 0; j < rowdatasize; j++) {
		WebElement data=eachvalue.get(j);
		String print=data.getText();
		System.out.println(print);
	}
	}
System.out.println("---------------------");






//to print (exact) particular data
	for (int i = 0; i < rowsize; i++) {
		WebElement eachrow=rows.get(i);
		List<WebElement> eachvalue=eachrow.findElements(By.tagName("td"));
		int rowdatasize=eachvalue.size();
		for (int j = 0; j < rowdatasize; j++) {
			WebElement data=eachvalue.get(j);
			String print=data.getText();
	
			if(print.equals("Dubai")) {
				System.out.println(print);
				System.out.println("Dubai row No. "+(i+1));
				System.out.println("Dubai column No. "+(j+1));
				break;
			}
			
		}
}
	}

}
