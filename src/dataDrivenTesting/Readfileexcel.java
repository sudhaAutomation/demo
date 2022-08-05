package dataDrivenTesting;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfileexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\src\\ExcelTest_DataFiles\\SwhizzPortlTestcases.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("TestData");
		int rocount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(rocount);
		System.out.println(colcount);
		for (int i = 0; i < rocount; i++) {
			XSSFRow rowdata = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				String celval = rowdata.getCell(j).toString();
				System.out.println(celval);
			}
			System.out.println();

		}
	}

}
