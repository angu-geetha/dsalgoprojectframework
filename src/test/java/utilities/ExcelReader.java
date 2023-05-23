package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	
	public static String readCell(String sheetName, String rowNo, String coloumnNo) {
		
		String cellContents = null;
		try {
			FileInputStream file = new FileInputStream(new File("./src/test/resources/excel/dsAlgoInput.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			 XSSFSheet sheet = workbook.getSheet(sheetName);
			 Row row = sheet.getRow(Integer.parseInt(rowNo));
			 Cell cell = (Cell) row.getCell(Integer.parseInt(coloumnNo));
			 cellContents = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cellContents;
	}
}
