package com.cyb.set;

import java.util.*;

public class HashLotto {

	public HashLotto() {
	}
	
	public static void lotto() {
		HashSet<Integer> numbers = new HashSet<Integer>();
	
		/* 로또번호 : 6개 숫자(임의의: random)
		* 1. Math.random()
		*		0~1 사이의 실수
		*	(int)Math.random() *45 + 1
		* 2. Random.class
		* 		Random r = new Random();
		* 		r.nextInt(45) <= 0~44 정수중 임의의 정수가 반환
		*/
		
		for(int n =0; n<6; n++) {
			//int num = (int)Math.random()*45+1);
			int num = (int)(Math.random()*45+1);	//소숫점*45+1
			numbers.add(new Integer(num));
		}
		// HashSet을 LinkedList로 변환
		List<Integer>list = new LinkedList<Integer>(numbers);
		System.out.println(list);
	
		Collections.sort(list);
		System.out.println(list);
		// comparable 도 collection => 빅데이터의 플랫폼(하둡-자바언어)에서 많이 사용됨
		// LinkedList는 자료의 수가 엄청나게 많을때 빛을 발함 2만건 이하는 arrayList랑 차이 없음
	}

}
