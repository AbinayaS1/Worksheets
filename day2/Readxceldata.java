package week5day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxceldata {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb =new XSSFWorkbook("./data/CreateLead.xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		int RowNum = sheet.getLastRowNum();
		System.out.println(RowNum);
		
		short CellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(CellNum);
		
		for (int i = 0; i <= RowNum; i++) {
	                XSSFRow row = sheet.getRow(i);
	                for (int j = 0; j < CellNum; j++) {
						XSSFCell cell = row.getCell(j);
						String data1 = cell.getStringCellValue();
						System.out.println(data1);
					}
			
		}

	}

}
