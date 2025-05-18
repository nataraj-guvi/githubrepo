//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class WriteToExcel {
//			
//			// Establish the Stream I/O 
//			// Import the library that talks with Excel - Apache POI 
//			
//			public void writeToExcelSheet(String sheetName) throws IOException {
//				
//				FileInputStream fis = new FileInputStream("C:\\Users\\91986\\git\\githubrepo\\Task_Java_Program\\src\\University.xlsx");
//				
//				// Open or access the Workbook
//				XSSFWorkbook workbook = new XSSFWorkbook(fis);
//				// fis object is giving the information about the file loc to the workbook
//				
//				// With the workbook object - access the existing sheets getSheet() or create a new sheet
//				XSSFSheet sheet = workbook.createSheet(sheetName);
//				
//				// With the sheet object - access existing rows or create new rows
//				XSSFRow row = sheet.createRow(0);
//				
//				// With the row object - access the existing cells or create new cells(column)
//				XSSFCell cell = row.createCell(0);
//				
//				// With the cell object - you can add the data or extract the data 
//				cell.setCellValue("Name");
//				
//				// for the second cell in row 1
//				cell = row.createCell(1);
//				cell.setCellValue("Dept");
//				
//				// for the second cell in row 1
//				cell = row.createCell(2);
//				cell.setCellValue("City");
//				
//				// Creating the second Row
//				row = sheet.createRow(1);
//				
//				cell = row.createCell(0);
//				cell.setCellValue("Dhoni");
//				
//				cell = row.createCell(1);
//				cell.setCellValue("Wkt");
//				
//				cell = row.createCell(2);
//				cell.setCellValue("Ranchi");
//				
//				FileOutputStream fos = new FileOutputStream("/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/Streams/University.xlsx");
//				workbook.write(fos);
//				// Close the Streams and the workbook 
//				fis.close();
//				fos.close();
//				workbook.close();
//				
//			}
//	}
//
//}
