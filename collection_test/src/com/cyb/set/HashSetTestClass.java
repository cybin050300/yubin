package com.cyb.set;

import java.util.*;

import com.cyb.map.Student;

public class HashSetTestClass {

	public HashSetTestClass() {
	}

	public static void hsahSetTest() {
		HashSet<String> set = new HashSet<String>();
		set.add("test1");
		set.add("test1"); // 오류 -> 중복값 허용 X
		set.add("test2");
		set.add("test3");
		set.add("test4");

		System.out.println(set.size()); // 4

		/** 전체 데이터 추출 **/
		/*
		 * 데이터에 대한 index가 없다 Map처럼 key도 존재 하지 않기 때문 일단, 데이터는 일렬로 나열해야 함 => Iterator 가 필요
		 * *************꼭 알고 있기!!! 많이 나옴 Iterator는 Set.iterator();로 얻어낼 수 있음 Iterator 주요
		 * 메서드 => next() : 실제 값을 추출할 때 => hasNext() : 추출할 값이 있는지를 확인할 때
		 */

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // 값이 있는지 확인
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
