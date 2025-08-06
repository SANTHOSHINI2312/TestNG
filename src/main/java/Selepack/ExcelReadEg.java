package Selepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEg {

	public static void main(String[] args) throws IOException {
		//location
		File f=new File("D:\\SanExcel.xlsx");
		//read input
		FileInputStream St=new FileInputStream(f);
		//workbook
		Workbook w=new XSSFWorkbook(St);
		//sheet
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(1);
Cell c=r.getCell(2);
		//System.out.println(c);
	///	int NoofRows=s.getPhysicalNumberOfRows();
	//	System.out.println("Rows---- "+NoofRows);
	/*	for (int i = 0; i <NoofRows ; i++) {
			Row r=s.getRow(i);
			//System.out.println(r);
		
		//Row r=s.getRow(0);
		int NoofColumn=r.getPhysicalNumberOfCells();
		System.out.println("Columns---- "+NoofColumn);
		for (int j = 0; j < NoofColumn; j++) {
			Cell c=r.getCell(j);
			System.out.println(c);
		}
		}*/
		
	int celltype=c.getCellType();
	System.out.println("Cell type "+celltype);
	//string=1,  date/num=0
	if(celltype==1) {
		String strgval=c.getStringCellValue();
		System.out.println("String value "+strgval);
	}else if(celltype==0) {
		if(DateUtil.isCellDateFormatted(c)) {
			Date d=c.getDateCellValue();
			SimpleDateFormat sd=new SimpleDateFormat("MM-dd-yyyy");
			String dateval=sd.format(d);
			System.out.println("Date value "+dateval);
		}else {
			double dl=c.getNumericCellValue();
			long l=(long)dl;
			String numval=String.valueOf(l);
			System.out.println("Number value "+numval);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
