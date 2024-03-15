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
    public CafeClass(String order_id, String order_date, String category, String item, int price) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.category = category;
        this.item = item;
        this.price = price;
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
