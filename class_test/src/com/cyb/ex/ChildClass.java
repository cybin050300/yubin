package com.cyb.ex;

public class ChildClass extends ParentClassOne{
	
	int pVar =10;
	public String pString="child";
	private boolean pBool = true;
	protected float pFloat = 0.0003F;

	public ChildClass() {
		System.out.println("ChildClass() ������ ȣ���!");
	}
	
	public void cMethod() {
		System.out.println("ChildMethod() ������ ȣ���!");
		
	}
	

}
