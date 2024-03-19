package com.cyb;

import java.util.ArrayList;

import com.cyb.db.CafeClass;

public class DataClass {

	public static ArrayList<CafeClass> cafe = new ArrayList<CafeClass>();

	public DataClass() {
	}


	public void InitData(ArrayList<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			cafe.add(new CafeClass(arr.get(i)));
		}
	}
}
