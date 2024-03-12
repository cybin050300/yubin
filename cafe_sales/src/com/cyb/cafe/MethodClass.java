package com.cyb.cafe;

import java.util.ArrayList;

public class MethodClass {

	public MethodClass() {

	}

	public void searchProduct(String sdate, ArrayList<CafeClass> salesList) {
		// 1. 지정한 날짜에 해당하는 상품명 저장
		ArrayList<String> pList = new ArrayList<String>();

		// 2. 검색날짜에 해당 상품명 ArrayList에 추가
		for (int i = 0; i < salesList.size(); i++) { // 전체 데이터 중 날짜들
			if (sdate.equals(salesList.get(i).order_date)) {
				pList.add(salesList.get(i).item);
			}
			// 검증 코드
			System.out.println(salesList.get(i).order_date + ": "+ salesList.get(i).item);
		}
	} // searchProduct() END
}

// 상품명 검색 메서드(상품횟수를 반환)
//public int searchItem(String Item, CafeClass[] mcArray) {
//
//	for(int i=0; i<mcArray.length; i++) {
//		if(Item.equals(mcArray[i].item)) {
//			sell =mcArray[i].item.sell;
//		}
//	}
//	return sell;

// searchName() END