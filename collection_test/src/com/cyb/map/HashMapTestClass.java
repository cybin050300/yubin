package com.cyb.map;

import java.util.*;

public class HashMapTestClass {

	public HashMapTestClass() {

	}

	public static void hashMapTest() {
		// Map �� Ű�� ���� �ѽ� => <keyŸ��, ������ Ÿ��>
		Map<String, Integer> m = new HashMap<String, Integer>();
		// Android���� ���� ���� map�� �Ϻ��ϰ� �� ��!!!
		m.put("a", 10);
		m.put("a", 20); // ���� �����
		m.put("a", 20);
		m.put("a", 20);

		// ��ü ������ ����
		System.out.println(m.size());// 3

		// Ư�� ������ ���� : key������ ����
		System.out.println(m.get("c"));// 30

		// Map�� key��鸸 ���� : Map.keySet()
		// => Map.keySet()�� ��ȯ�ϴ� Ÿ���� Set<String>
		Set<String> s = m.keySet();
		System.out.println("LinkedList�� ��ȯ�Ͽ� ���");
		List<String> list = new LinkedList<String>(s);
		for (String key : list) {
			System.out.println(key + " : " + m.get(key));
		}
		System.out.println("Iterator�� ��ȯ�Ͽ� ���");
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + m.get(key));
		}

	}
}