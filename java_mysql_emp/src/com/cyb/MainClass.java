package com.cyb;

import java.util.Scanner;

/**
 * Controller Dispatcher class => Controller(조회) => Controller(삽입) =>
 * Controller(수정) => Controller(삭제)
 */
// 원하는 작업 번호를 입력해 주세요..
// 1. 전체사원조회 / 2. 신규사원추가 / 3. 전사원 급여10% 올림 / 4. 과장 직책 사원 삭제 / 5. 작업 종요

public class MainClass {

	public static void main(String[] args) {
//		DataBaseClass dbc = new DataBaseClass();
//		dbc.connMySQL(); // 드라이버 로드 및 접속
//		dbc.selectAll();		// 전체 레코드 조회
//		dbc.selectOne();	// 하나의 레코드 조회
//		dbc.selectLimit(); 	// 전체 레코드 중 일부 레코드들만 조회

		/** switch ~ case **/
		System.out.println("전체 메뉴에서 작업할 번호 입력!");
		System.out.println("1. 전체조회 화면 | 2. 레코드 삽입 | 3. 레코드 수정 | 4. 레코드 삭제");
		System.out.println("=============================================");
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			int key = scanner.nextInt();
			System.out.println("원하는 작업 번호를 입력해 주세요..");
			switch (key) {
			case 1:
				System.out.println("전체사원조회");
				dbc.selectAll();
				break;
			case 2:
				System.out.println("신규사원추가");
				dbc.insert();
				break;
			case 3:
				System.out.println("전사원 급여10% 올림");
				dbc.update();
				break;
			case 4:
				System.out.println("과장 직책 사원 삭제");
				dbc.delete();
				break;
			case 5: // while()문 빠져나오기 위한 코드 (없으면 무한 루프)
				status = false;
				break;
			} // switch (key) END
		} // while (status) END
		scanner.close();
		System.out.println("시스템 종료되었습니다.");
	} // main() END


}
