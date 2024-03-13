package com.cyb.set;

import java.util.*;

import com.cyb.map.Student;

public class HashSetTestClass {

	public HashSetTestClass() {
	}

	public static void hsahSetTest() {
		HashSet<String> set = new HashSet<String>();
		set.add("test1");
		set.add("test1"); // ���� -> �ߺ��� ��� X
		set.add("test2");
		set.add("test3");
		set.add("test4");

		System.out.println(set.size()); // 4

		/** ��ü ������ ���� **/
		/*
		 * �����Ϳ� ���� index�� ���� Mapó�� key�� ���� ���� �ʱ� ���� �ϴ�, �����ʹ� �Ϸķ� �����ؾ� �� => Iterator �� �ʿ�
		 * *************�� �˰� �ֱ�!!! ���� ���� Iterator�� Set.iterator();�� �� �� ���� Iterator �ֿ�
		 * �޼��� => next() : ���� ���� ������ �� => hasNext() : ������ ���� �ִ����� Ȯ���� ��
		 */

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // ���� �ִ��� Ȯ��
			System.out.println(iter.next());
		}
	} // hashMapTest() END

	public static void hashMapStudent() {
		Map<String, Student> m = new HashMap<String, Student>();

		m.put("a", new Student(10, "test1"));
		m.put("b", new Student(30, "test3"));
		m.put("c", new Student(20, "test2"));
		m.put("d", new Student(40, "test4"));

		System.out.println(m);

		Set<String> s = m.keySet();
		List<String> list = new LinkedList<String>(s);
		for (String key : list) {
			System.out.println(m.get(key));
		}

	}
}
