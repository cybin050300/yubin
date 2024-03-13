package com.cyb.list;

import java.util.ArrayList;

public class ArrayListTestClass {

	public ArrayListTestClass() {
		ArrayList<String> list = new ArrayList<String>();
	list.add("apple");
	list.add("orange");
	list.add("orange");
	list.add("peach");

	
	// Ư�� ��ġ�� ������ �߰�
	list.add(1,"kiwi");
	// 0:apple, 1:kiwi, 2:orange, 3:orange, 4:peach
	
	// Ư�� ��ġ�� ������ ����
	list.add(3,"apple");
	// 0:apple, 1:kiwi, 2:orange, 3:apple, 4:peach
		
	// Ư�� ��ġ�� ���� �����ϰ� ��ȯ
	String f = list.remove(3);
	// f: apple
	// 0:apple, 1:kiwi, 2:orange, 3:peach
	
	// Ư�� �����͸� �̿��Ͽ� �ش� index ����
	int idx = list.indexOf("apple");
	// idx:0
	
	list.add("apple");
	// 0:apple, 1:kiwi, 2:orange, 3:peach, 4:apple
	
	//�� �������� �ִ� ������ ���� ����
	idx = list.lastIndexOf("apple");
	// idx: 4
	
	// ��ü ������ ��ȸ 1
	for(String fu : list) {
		System.out.println(fu);
	}
	// ��ü ������ ��ȸ 2
	for(int index=0;index<list.size();index++) {
		System.out.println(list.get(index));
	}
	
	int n=list.size()-1;
	for(int index=n;index>-1;index--) {
		System.out.println(list.get(index));
	}
	
		
	
} // ArrayListTestClass() END
}