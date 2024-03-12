package com.cyb.ex;

public class ChildClass extends ParentClassOne{
	
	int pVar =10;
	public String pString="child";
	private boolean pBool = true;
	protected float pFloat = 0.0003F;

	public ChildClass() {
		System.out.println("ChildClass() 생성자 호출됨!");
	}
	
	public void cMethod() {
		System.out.println("ChildMethod() 생성자 호출됨!");
		
	}
	

}
