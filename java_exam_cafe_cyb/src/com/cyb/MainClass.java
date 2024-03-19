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
				
		dbc.connMySQL(); // ����̹� �ε� �� ����

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
				System.out.println("��" + DataClass.cafe.size() + "�� �� �����Ǿ����ϴ�");
				status = false;
				break;
			} // switch (key) END
		} // while (status) END
		scanner.close();

		
	} // main() END

}
