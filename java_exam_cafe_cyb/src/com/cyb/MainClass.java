package com.cyb;

//exam
import java.util.Scanner;

import com.cyb.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connMySQL(); // ����̹� �ε� �� ����

		System.out.println("==============================");
		System.out.println("�Ʒ� �޴��� ��ȣ�� �Է� ��, Enter�� ��������.");
		System.out.println("���� �Ǹ� ��� �� ���� ��� �Ǹž�(1)");
		System.out.println("�ִ� �Ǹ� ��ǰ�� �ش� ��ǰ�� �� �Ǹž�(2)");
		System.out.println("�ִ� �Ǹ� �ð��� �� �� �Ǹž�(3)");
		System.out.println("�ִ� �Ǹ� ī�װ� �� ���Ǹž�(4)");
		System.out.println("����(5)");
		System.out.println("----------------------------------------------------");
		System.out.println("��ȣ �Է� >>");
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			int key = scanner.nextInt();
			
			switch (key) {
			case 1:
				System.out.println("���� �Ǹ� ��� �� ���� ��� �Ǹž�");
				dbc.dayItem();
				break;
			case 2:
				System.out.println("�ִ� �Ǹ� ��ǰ�� �ش� ��ǰ�� �� �Ǹž�");
				dbc.maxItem();
				break;
			case 3:
				System.out.println("�ִ� �Ǹ� �ð��� �� �� �Ǹž�");
				dbc.maxDate();
				break;
			case 4:
				System.out.println("�ִ� �Ǹ� ī�װ� �� ���Ǹž�");
				dbc.maxCategory();
				break;
			case 5: // while()�� ���������� ���� �ڵ� (������ ���� ����)
				status = false;
				break;
			} // switch (key) END
		} // while (status) END
		scanner.close();
		System.out.println("�ý��� ����Ǿ����ϴ�.");

		// ���� �ڵ�
		for (String item : MethodClass.getNo()) {
			System.out.println(item);

		}

		/** 4. no ���� item���� count������ �ϳ��� ��ü�� �߰� �޼��� ȣ�� * */
		// => item.�� count �� �� ������ �ٷ�� ����
		MethodClass.item_count_list();

		/** 5. counting �ϴ� �޼��� ȣ�� * */
//					MethodClass.counting();

		/** 6. count ���� ���� ū ��ü�� ã�Ƽ� ��ȯ **/
		MethodClass mc = new MethodClass();
		ItemCountClass maxItem = mc.maxItem();
		
		System.out.println("====================");
		System.out.println(maxItem.item + " ===>" + maxItem.count);
	} // main() END

}
