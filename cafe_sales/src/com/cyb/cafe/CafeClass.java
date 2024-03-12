package com.cyb.cafe;

public class CafeClass {
	String order_id, order_date, Category, item;
	int price;
	
	public CafeClass(String id, String date, String ca, String itm, int pr) {
		
		order_id=id;
//		String tempString=date.substring(0,10);
//		order_date=date;
		order_date=date.substring(0,10);
		Category=ca;
		item=itm;
		price=pr;
	}
}
