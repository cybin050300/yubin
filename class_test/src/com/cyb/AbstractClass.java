package com.cyb;

// 선언부에 abstract가 반드시 필요
public abstract class AbstractClass {
	public int var = 1000;
	public final int var2 = 100;

	public AbstractClass() {
		System.out.println("Abstract() 생성자 호출됨!");
	}
	 
	public void test() {		// 일반 메서드 선언
		
	}
	public abstract void sum(); 

}
