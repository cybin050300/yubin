package com.cyb;

import com.cyb.map.HashMapTestClass;
import com.cyb.map.Student;

public class MainClass {

	public MainClass() {
	}

	public static void main(String[] args) {
		Student s = new Student(10, "test");
		System.out.println(s);
		HashMapTestClass.hashMapTest();
	}

}
