package com.cyb.db;

public class CafeClass {
	private String order_id;
	private String order_date;
	private String category;
	private String item;
	private int price;

	public CafeClass() {
		// 기본 생성자
	}

	// 생성자
	public CafeClass(String raw) {
		raw = raw.replace("\"", "");
		String[] split = raw.split(", ");
		this.order_id = split[0];
		this.order_date = split[1];
		this.category = split[2];
		this.item = split[3];
		this.price = Integer.parseInt(split[4]);
	}

	// getter 메서드
	public String getOrder_id() {
		return order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public String getCategory() {
		return category;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}
}
