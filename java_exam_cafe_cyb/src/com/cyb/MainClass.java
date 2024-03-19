package com.cyb;

import java.util.ArrayList;
//exam
import java.util.Scanner;

import com.cyb.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataClass dc = new DataClass();
		DataBaseClass dbc = new DataBaseClass();
		
		ArrayList<String> arr = IOClass.ReadFile("datas/cafe", ".txt");
		dc.InitData(arr);
				
		dbc.connMySQL(); // 드라이버 로드 및 접속

		for (int i = 0; i < DataClass.cafe.size(); i++) {
			dbc.insert(DataClass.cafe.get(i));
		}
	
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			int key = scanner.nextInt();
			
			switch (key) {
			case 1:
				System.out.println("");
				dbc.updateItem();
				break;
			
			case 2: 
				dbc.deleteAll();
				System.out.println("총" + DataClass.cafe.size() + "개 가 삭제되었습니다");
				status = false;
				break;
			} // switch (key) END
		} // while (status) END
		scanner.close();

		
	} // main() END

}
