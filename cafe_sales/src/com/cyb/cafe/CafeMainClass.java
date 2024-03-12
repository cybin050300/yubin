package com.cyb.cafe;

public class CafeMainClass {

	public static void main(String[] args) {
		//"order_id", "order_date", "Category", "item", "price"  <== 변수명
		//2017-09-13에 가장 많이 판매된 상품명을 출력
		
		// 1.데이터 준비
		DataClass dc = new DataClass();
		System.out.println(dc.sales.size()-1);
		System.out.println(dc.sales.get(dc.sales.size()-1).item);
		
		// 2.검색 날짜 저장 변수
		String date = "2017-09-13";
		
		// 3.검색 메서드 호출
		MethodClass mClass = new MethodClass();
		mClass.searchProduct(date, dc.sales);
		
		// 4. 저장된 상품 리스트를 이용하여 중복 제거된 리스트 생성
		// 5. 중복 제거된 리스트와 저장된 상품 리스트를 비교하면서 
		//  해당 상품에 대한 카운팅!!!!!!!!!!!!!!ㅜ
		// 6. 카운팅된 결과를 이용하여 정렬!!!!!!!!!!
		
		// 4. 결과 출력
		
	}

}
