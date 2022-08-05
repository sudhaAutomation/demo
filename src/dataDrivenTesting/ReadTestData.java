package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\src\\ExcelTest_DataFiles\\SwhizzPortlTestcases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);// it will provide xlsx environment
		XSSFSheet sheet = workbook.getSheet("TestData");
		int rowcount = sheet.getLastRowNum();// 6
		System.out.println(rowcount);
		int colcount = sheet.getRow(0).getLastCellNum();// 4
		System.out.println(colcount);

		for (int i = 2; i <= rowcount; i++) {
			XSSFRow rowdata = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				// String celvalue = rowdata.getCell(j).toString();
				XSSFCell celvalue = rowdata.getCell(j);
				System.out.print("       " + celvalue);
			}
			System.out.println();
		}

	}

}
