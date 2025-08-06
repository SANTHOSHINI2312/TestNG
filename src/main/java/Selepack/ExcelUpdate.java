package Selepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	public static void main(String[] args) throws IOException {
		//location
		File f=new File("D:\\SanExcel.xlsx");
		//read input
		FileInputStream St=new FileInputStream(f);
		//workbook
		Workbook w=new XSSFWorkbook(St);
		//sheet
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(0);
Cell c=r.getCell(0);
//System.out.println(c);
String ActualValue=c.getStringCellValue();
if(ActualValue.equals("Santhoshini")) {
	c.setCellValue("Agas");
}
FileOutputStream Fileop=new FileOutputStream(f);
w.write(Fileop);
System.out.println("Succesfully Updated!");

}
}
