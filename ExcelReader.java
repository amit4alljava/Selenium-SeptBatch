import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ExcelReader {

	public Object[][] readExcelFile() throws Exception{
		Object [][] array = new Object[3][2];
		boolean isFirstRowPass = false;
		int currentRowNo = 0;
		int currentColNo = 0;
		// Step -1 Open an Excel File
		FileInputStream fi = new FileInputStream("E:\\Java-KochiWS-2\\xls\\data.xls");
		// Step -2 Open a WorkBook
		HSSFWorkbook workBook = new HSSFWorkbook(fi);
		// Step - 3 Open a First WorkSheet
		HSSFSheet sheet = workBook.getSheetAt(0);
		// Step -4 Get Rows
		Iterator<Row> rows = sheet.rowIterator();
		// Step -5 Traverse the Rows
		while(rows.hasNext()){
			Row currentRow = rows.next();
			if(isFirstRowPass==false){
				isFirstRowPass = true;
				continue;
			}
			// Step -6 Traverse the Cells
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
					array[currentRowNo][currentColNo]=currentCell.getStringCellValue();
				}
				else
				{
					array[currentRowNo][currentColNo] = String.valueOf((int)currentCell.getNumericCellValue());
				}
				currentColNo++;
				
			}
			currentColNo  = 0;
			currentRowNo++;
		}
		workBook.close();
		fi.close();
		return array;
	}
	
}
