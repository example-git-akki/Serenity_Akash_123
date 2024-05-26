package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;



public class ExcelReadData {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\2129926\\eclipse-workspace\\CaseStudy\\TestData\\Login_Details.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalrows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println("number of rows:" + totalrows);// 1
		System.out.println("number of cells:" + totalCells);// 5

		for (int r = 0; r <= totalrows; r++) {
			XSSFRow currentRow = sheet.getRow(r);

			for (int c = 0; c < totalCells; c++) {
				String value = currentRow.getCell(c).toString();
				System.out.print(value + "      ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
