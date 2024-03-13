package com.cyb.set;

import java.util.*;

public class HashLotto {

	public HashLotto() {
	}
	
	public static void lotto() {
		HashSet<Integer> numbers = new HashSet<Integer>();
	
		/* �ζǹ�ȣ : 6�� ����(������: random)
		* 1. Math.random()
		*		0~1 ������ �Ǽ�
		*	(int)Math.random() *45 + 1
		* 2. Random.class
		* 		Random r = new Random();
		* 		r.nextInt(45) <= 0~44 ������ ������ ������ ��ȯ
		*/
		
		for(int n =0; n<6; n++) {
			//int num = (int)Math.random()*45+1);
			int num = (int)(Math.random()*45+1);	//�Ҽ���*45+1
			numbers.add(new Integer(num));
		}
		// HashSet�� LinkedList�� ��ȯ
		List<Integer>list = new LinkedList<Integer>(numbers);
		System.out.println(list);
	
		Collections.sort(list);
		System.out.println(list);
		// comparable �� collection => �������� �÷���(�ϵ�-�ڹپ��)���� ���� ����
		// LinkedList�� �ڷ��� ���� ��û���� ������ ���� ���� 2���� ���ϴ� arrayList�� ���� ����
	}

}
