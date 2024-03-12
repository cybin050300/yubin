package com.cyb.ex;
																		// new ParentClassOne()
public class ExtendClassOne extends ParentClassOne{	// 자식이 부모에게 자원을 물려받으려면 extends가 필요함

	public ExtendClassOne() { 	//부모클래스가 갖고 있는 자원 물려받을 것
		System.out.println("ExtendClassOne() 생성자 호출됨");
	}

}
