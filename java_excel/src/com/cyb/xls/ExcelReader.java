package com.cyb.xls;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReader {
	public static void readExcelFile() {
		String uri = "c:/filetest/data.xls";

		File f = new File(uri);

		try {

			Workbook wb = Workbook.getWorkbook(f);

			Sheet s = wb.getSheet(0);

			Cell c = s.getCell(0, 0);
			String str = c.getContents();
			System.out.println(str);

			int i = 0;
			while (true) {
				try {
					Cell c1 = s.getCell(0, i);
					Cell c2 = s.getCell(0, i);
					System.out.println(c1.getContents() + ":" + c2.getContents());
					i++;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					break;
				}
			}
			wb.close();
		} catch (Exception e) {

		}
	}
}
