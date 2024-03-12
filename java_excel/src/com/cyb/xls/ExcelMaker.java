package com.cyb.xls;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelMaker {
	
	private ExcelMaker() {	// 기본 생성자	
	}
	
	public static void makeExcelFile() {
		String uri = "c:/filetest/data.xls";
		
		File f = new File(uri);	// java.io.File


		WritableWorkbook wb = null;	// try{}catch(){}때문에 null값 설정
		
		try {	// 내부에 오류날 수 있는 코드가 들어있어야함! 그냥 try catch구문만 있으면 오류!
			wb =Workbook.createWorkbook(f);
			
			WritableSheet s= wb.createSheet("첫번째",0);
			
			for(int i=0; i<10;i++) {
				Label label1 = new Label(0,i,"데이터=>"+i);	// (열번호, 행번호, 내용);
				s.addCell(label1);
				Label label2 = new Label(1,i,"데이터=>"+i);	
				s.addCell(label2);
			}
			wb.write();	// 위의 내용을 토대로 실제 쓰기
			wb.close();	// 쓰고 저장한 후, 해당 파일 닫기
			
			System.out.println("액셀 파일 생성 성공!!");
		
		}catch (IOException ioe) { //파일 입출력 오류
			System.out.println("IOException ERR"+ioe.getMessage());
		}
		catch (RowsExceededException re) {	// 
			System.out.println("RowsExceededException ERR"+re.getMessage());
			
		}catch (WriteException we) {//파일에 데이터 쓸 때 오류
			System.out.println("RowsExceedWriteException ERR"+we.getMessage());

		}
		
		
	}
	

}
