package com.cyb.cafe;

import java.util.ArrayList;

public class MethodClass {

	public MethodClass() {

	}

	public void searchProduct(String sdate, ArrayList<CafeClass> salesList) {
		// 1. ������ ��¥�� �ش��ϴ� ��ǰ�� ����
		ArrayList<String> pList = new ArrayList<String>();

		// 2. �˻���¥�� �ش� ��ǰ�� ArrayList�� �߰�
		for (int i = 0; i < salesList.size(); i++) { // ��ü ������ �� ��¥��
			if (sdate.equals(salesList.get(i).order_date)) {
				pList.add(salesList.get(i).item);
			}
			// ���� �ڵ�
			System.out.println(salesList.get(i).order_date + ": "+ salesList.get(i).item);
		}
	} // searchProduct() END
}

// ��ǰ�� �˻� �޼���(��ǰȽ���� ��ȯ)
//public int searchItem(String Item, CafeClass[] mcArray) {
//
//	for(int i=0; i<mcArray.length; i++) {
//		if(Item.equals(mcArray[i].item)) {
//			sell =mcArray[i].item.sell;
//		}
//	}
//	return sell;

// searchName() END