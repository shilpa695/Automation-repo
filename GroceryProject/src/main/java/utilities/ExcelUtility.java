package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constants;

public class ExcelUtility {
	static FileInputStream f; // Excel file input stream
	static XSSFWorkbook w; // Workbook
	static XSSFSheet s; // Sheet

	public static String getStringData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream(Constants.TestDatafile);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static String getIntegerData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream(Constants.TestDatafile);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		int y = (int) c.getNumericCellValue();
		return String.valueOf(y);
	}

}
