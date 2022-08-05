package dataDrivenTesting;

import java.io.IOException;

public class Utilclass {

	public static String[][] getexceldata() throws IOException {
		XLUtility reader = new XLUtility(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\Automation_Training\\src\\ExcelTest_DataFiles\\SwhizzPortlTestcases.xlsx");
		int rowcount = reader.getRowCount("TestData");
		System.out.println("rowcount" + rowcount);// 7
		int colcount = reader.getCellCount("TestData", 1);
		System.out.println("colcount is " + colcount);// 5

		String exceldata[][] = new String[rowcount - 1][colcount];

		for (int i = 2; i <= rowcount; i++) {

			for (int j = 0; j < colcount; j++) {
				exceldata[i - 2][j] = reader.getCellData("TestData", i, j);
				// 2,0
			}

		}
		return exceldata;

	
	
	}
}
