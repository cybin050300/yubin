package com.cybmodifier;

public class DataClass {
	static int staticVar = 10; // static이 붙었더니 특별한 변수
	public int publicVar = 100;
	int defaultVar = 1000;
	private String name="dhc";
	private String category="coffee";

	static int[] test = new int[3];

	public DataClass() {
		this.initData();
	}

	private void initData() {
		test[0] = 10;
		test[1] = 10;
		test[2] = 10;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
		name=category;
	}

	public String getName() {
		return name;
	}
}
