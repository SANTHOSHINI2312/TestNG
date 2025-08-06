package Selepack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelFileWrite {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\eclipse-workspace\\SAN_MAVENPROJECT\\images\\Sample1.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet();
		Row r=s.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Hi All");
		FileOutputStream Fileop=new FileOutputStream(f);
		w.write(Fileop);
		System.out.println("Success");
		
		
	}

}
