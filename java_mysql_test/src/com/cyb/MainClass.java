package com.cyb;

import java.util.Scanner;

import com.cyb.db.DataBaseClass;

/**
 * Controller Dispatcher class => Controller(조회) => Controller(삽입) =>
 * Controller(수정) => Controller(삭제)
 */
public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connMySQL(); // 드라이버 로드 및 접속
//		dbc.selectAll();		// 전체 레코드 조회
//		dbc.selectOne();	// 하나의 레코드 조회
//		dbc.selectLimit(); 	// 전체 레코드 중 일부 레코드들만 조회
//		dbc.insert();			// 레코드 추가  	
//		dbc.update();  		// 레코드 수정
//		dbc.delete();
//	 main() END

		/** 시험문제 **/
// 콘솔창에서 1번 하면 전체조회 되도록
// 2번하면 하나의 레코드 조회되도록
		
		/** switch ~ case **/
		System.out.println("전체 메뉴에서 작업할 번호 입력!");
		System.out.println("1. 전체조회 화면 | 2. 레코드 삽입 | 3. 레코드 수정 | 4. 레코드 삭제");
		System.out.println("=============================================");
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			int key = scanner.nextInt();
			System.out.println("드라이버 접속 완료");
			switch (key) {
			case 1:
				System.out.println("전체조회 화면");
				dbc.selectAll();
				break;
			case 2:
				System.out.println("레코드 삽입");
				dbc.insert();
				break;
			case 3:
				System.out.println("레코드 수정");
				dbc.update();
				break;
			case 4:
				System.out.println("레코드 삭제");
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