package com.cyb.cafe;

public class CafeMainClass {

	public static void main(String[] args) {
		//"order_id", "order_date", "Category", "item", "price"  <== ������
		//2017-09-13�� ���� ���� �Ǹŵ� ��ǰ���� ���
		
		// 1.������ �غ�
		DataClass dc = new DataClass();
		System.out.println(dc.sales.size()-1);
		System.out.println(dc.sales.get(dc.sales.size()-1).item);
		
		// 2.�˻� ��¥ ���� ����
		String date = "2017-09-13";
		
		// 3.�˻� �޼��� ȣ��
		MethodClass mClass = new MethodClass();
		mClass.searchProduct(date, dc.sales);
		
		// 4. ����� ��ǰ ����Ʈ�� �̿��Ͽ� �ߺ� ���ŵ� ����Ʈ ����
		// 5. �ߺ� ���ŵ� ����Ʈ�� ����� ��ǰ ����Ʈ�� ���ϸ鼭 
		//  �ش� ��ǰ�� ���� ī����!!!!!!!!!!!!!!��
		// 6. ī���õ� ����� �̿��Ͽ� ����!!!!!!!!!!
		
		// 4. ��� ���
		
	}

}