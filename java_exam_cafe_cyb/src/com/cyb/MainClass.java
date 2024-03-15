package com.cyb;

//exam
import java.util.Scanner;

import com.cyb.db.DataBaseClass;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connMySQL(); // 드라이버 로드 및 접속

		System.out.println("==============================");
		System.out.println("아래 메뉴의 번호를 입력 후, Enter를 누르세요.");
		System.out.println("일일 판매 목록 및 일일 평균 판매액(1)");
		System.out.println("최다 판매 상품과 해당 상품의 총 판매액(2)");
		System.out.println("최다 판매 시간대 및 총 판매액(3)");
		System.out.println("최다 판매 카테고리 및 총판매액(4)");
		System.out.println("종료(5)");
		System.out.println("----------------------------------------------------");
		System.out.println("번호 입력 >>");
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			int key = scanner.nextInt();
			
			switch (key) {
			case 1:
				System.out.println("일일 판매 목록 및 일일 평균 판매액");
				dbc.dayItem();
				break;
			case 2:
				System.out.println("최다 판매 상품과 해당 상품의 총 판매액");
				dbc.maxItem();
				break;
			case 3:
				System.out.println("최다 판매 시간대 및 총 판매액");
				dbc.maxDate();
				break;
			case 4:
				System.out.println("최다 판매 카테고리 및 총판매액");
				dbc.maxCategory();
				break;
			case 5: // while()문 빠져나오기 위한 코드 (없으면 무한 루프)
				status = false;
				break;
			} // switch (key) END
		} // while (status) END
		scanner.close();
		System.out.println("시스템 종료되었습니다.");

		// 검증 코드
		for (String item : MethodClass.getNo()) {
			System.out.println(item);

		}

		/** 4. no 내의 item값과 count변수를 하나의 객체로 추가 메서드 호출 * */
		// => item.과 count 를 한 쌍으로 다루기 위해
		MethodClass.item_count_list();

		/** 5. counting 하는 메서드 호출 * */
//					MethodClass.counting();

		/** 6. count 값이 가장 큰 객체를 찾아서 반환 **/
		MethodClass mc = new MethodClass();
		ItemCountClass maxItem = mc.maxItem();
		
		System.out.println("====================");
		System.out.println(maxItem.item + " ===>" + maxItem.count);
	} // main() END

}
