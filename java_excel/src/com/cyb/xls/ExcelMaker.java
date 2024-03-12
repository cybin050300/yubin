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
	
	private ExcelMaker() {	// �⺻ ������	
	}
	
	public static void makeExcelFile() {
		String uri = "c:/filetest/data.xls";
		
		File f = new File(uri);	// java.io.File


		WritableWorkbook wb = null;	// try{}catch(){}������ null�� ����
		
		try {	// ���ο� ������ �� �ִ� �ڵ尡 ����־����! �׳� try catch������ ������ ����!
			wb =Workbook.createWorkbook(f);
			
			WritableSheet s= wb.createSheet("ù��°",0);
			
			for(int i=0; i<10;i++) {
				Label label1 = new Label(0,i,"������=>"+i);	// (����ȣ, ���ȣ, ����);
				s.addCell(label1);
				Label label2 = new Label(1,i,"������=>"+i);	
				s.addCell(label2);
			}
			wb.write();	// ���� ������ ���� ���� ����
			wb.close();	// ���� ������ ��, �ش� ���� �ݱ�
			
			System.out.println("�׼� ���� ���� ����!!");
		
		}catch (IOException ioe) { //���� ����� ����
			System.out.println("IOException ERR"+ioe.getMessage());
		}
		catch (RowsExceededException re) {	// 
			System.out.println("RowsExceededException ERR"+re.getMessage());
			
		}catch (WriteException we) {//���Ͽ� ������ �� �� ����
			System.out.println("RowsExceedWriteException ERR"+we.getMessage());

		}
		
		
	}
	

}
