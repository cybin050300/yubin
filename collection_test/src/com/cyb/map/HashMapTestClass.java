package com.cyb.map;

import java.util.*;

public class HashMapTestClass {

	public HashMapTestClass() {

	}

	public static void hashMapTest() {
		// Map 은 키와 값이 한쌍 => <key타입, 데이터 타입>
		Map<String, Integer> m = new HashMap<String, Integer>();
		// Android에서 많이 사용됨 map은 완벽하게 알 것!!!
		m.put("a", 10);
		m.put("a", 20); // 덮어 쓰기됨
		m.put("a", 20);
		m.put("a", 20);

		// 전체 데이터 갯수
		System.out.println(m.size());// 3

		// 특정 데이터 추출 : key명으로 추출
		System.out.println(m.get("c"));// 30

		// Map의 key명들만 추출 : Map.keySet()
		// => Map.keySet()가 반환하는 타입이 Set<String>
		Set<String> s = m.keySet();
		System.out.println("LinkedList로 변환하여 출력");
		List<String> list = new LinkedList<String>(s);
		for (String key : list) {
			System.out.println(key + " : " + m.get(key));
		}
		System.out.println("Iterator로 변환하여 출력");
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + m.get(key));
		}

	}
}