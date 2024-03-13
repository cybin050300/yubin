package com.cyb.list;

import java.util.ArrayList;

public class ArrayListTestClass {

	public ArrayListTestClass() {
		ArrayList<String> list = new ArrayList<String>();
	list.add("apple");
	list.add("orange");
	list.add("orange");
	list.add("peach");

	
	// 특정 위치에 데이터 추가
	list.add(1,"kiwi");
	// 0:apple, 1:kiwi, 2:orange, 3:orange, 4:peach
	
	// 특정 위치의 데이터 변경
	list.add(3,"apple");
	// 0:apple, 1:kiwi, 2:orange, 3:apple, 4:peach
		
	// 특정 위치의 값을 제거하고 반환
	String f = list.remove(3);
	// f: apple
	// 0:apple, 1:kiwi, 2:orange, 3:peach
	
	// 특정 데이터를 이용하여 해당 index 추출
	int idx = list.indexOf("apple");
	// idx:0
	
	list.add("apple");
	// 0:apple, 1:kiwi, 2:orange, 3:peach, 4:apple
	
	//맨 마지막에 있는 데이터 값을 추출
	idx = list.lastIndexOf("apple");
	// idx: 4
	
	// 전체 데이터 조회 1
	for(String fu : list) {
		System.out.println(fu);
	}
	// 전체 데이터 조회 2
	for(int index=0;index<list.size();index++) {
		System.out.println(list.get(index));
	}
	
	int n=list.size()-1;
	for(int index=n;index>-1;index--) {
		System.out.println(list.get(index));
	}
	
		
	
} // ArrayListTestClass() END
}