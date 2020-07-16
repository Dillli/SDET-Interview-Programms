package JavaInterviewPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws IOException {

		

		FileInputStream fis = new FileInputStream("D:\\Eclipse code\\MySeleniumSessions\\src\\main\\java\\TestNGSessions\\HalfEbayTestData.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = Workbook.getSheet("RegTestData");
		XSSFCell name = sheet.getRow(1).getCell(1);
		XSSFCell company = sheet.getRow(0).getCell(2);
		System.out.println(name);
		System.out.println(company);
		

		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(1);

		int colnum = -1;

		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equals("username"))
				colnum = i;
		}
		row = sheet.getRow(1);
		cell = row.getCell(colnum);

		String val = String.valueOf(cell.getStringCellValue());
		System.out.println(val);

		Xls_Reader reader = new Xls_Reader("C:\\Users\\dileep\\Desktop\\SampleExcel.xlsx");
//		reader.addColumn("login", "sucess");
		String fn = reader.getCellData("login", "username", 2);
		System.out.println(fn);

//		FileInputStream FIS = new FileInputStream("C:\\Users\\naveen.pu\\Desktop\\read.xlsx");
//        XSSFWorkbook WB = new XSSFWorkbook(FIS);
//        XSSFSheet Sheet = WB.getSheet("");
//        XSSFCell peru = Sheet.getRow(0).getCell(3);
//        XSSFComment uru = Sheet.getCellComment(0, 3);

	}

}
