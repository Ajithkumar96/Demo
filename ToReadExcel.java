package org.datadrivenTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\selenium\\MavenAssignments\\ExcelSheets\\demodata.xlsx");
		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getPhysicalNumberOfRows();
		// System.out.println(rowcount);
		Row row = sheet.getRow(2);
		int cellcount = row.getPhysicalNumberOfCells();
		//System.out.println(cellcount);
		for (int i = 0; i < rowcount; i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < cellcount; j++) {
				Cell cell = row2.getCell(j);
				CellType Type = cell.getCellType();
				switch (Type) {
				case STRING:
					String text = cell.getStringCellValue();
					System.out.print(text+"	");
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateformate = new SimpleDateFormat("dd-MMM-YY");
						String s = dateformate.format(date);
						System.out.print(s);
					}
					else {
						double num = cell.getNumericCellValue();
						BigDecimal dec = BigDecimal.valueOf(num);
						String string = dec.toString();
						System.out.print(string+"	");
					}			
				break;
				
				default:
					break;
				}
			}
			System.out.println();
		}

	}
}





//if(DateUtil.isCellDateFormatted(cell)) {
//	Date date = cell.getDateCellValue();
//	SimpleDateFormat dateformate = new SimpleDateFormat("dd-MM-YY");
//	String s = dateformate.format(date);
//	System.out.print(s);
//}
//else {
//	double ddate = cell.getNumericCellValue();
//	BigDecimal valueOf = BigDecimal.valueOf(ddate);
//	String date = valueOf.toString();
//	System.out.print(date);
//}
//