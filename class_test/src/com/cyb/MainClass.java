package com.cyb;

import com.cyb.ex.ChildClass;
import com.cyb.ex.ExtendClassOne;
import com.cyb.ex.ParentClassOne;

public class MainClass {

	public static void main(String[] args) {
		ExtendsAbstractClass eac = new ExtendsAbstartClass();
		
		// abstract 클래스는 생성자는 가질 수 있지만, 자체 객체 생성 불가!
//		AbstractClass ac = new AbstractClass();
		
		// interface는 생성자가 없기 때문에 객체 생성 불가!!
		InterfaceClassOne om1 = new InterfaceClassOne() {
			
			@Override
			public void test(int a, int b) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void test(int a) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};
		ParentClassOne eco = new ExtendClassOne();		// 조상 : ParentClassOne
		ParentClassOne ect = new ExtendClassTwo();		// 조상 : ParentClassOne
//		Object eco = new ExtendClassOne();		// 원래 클래스의 조상은 object
//		Object ect = new ExtendClassTwo();	
		ExtendClassTwo ect2 = (ExtendClassTwo)ect;		// 객체 형 변환해야함 
																		// 자식 변수 인식시키기 위해 원래 부모 타입으로 변환해야함

		ParentClassOne pco = new ParentClassOne();		
		ParentClassOne cc = new ChildClass();						// 조상 : ParentClassOne
		
		/**
		ExtendClassOne eco = new ExtendClassOne();		// 조상 : ParentClassOne
		ExtendClassTwo ect = new ExtendClassTwo();		// 조상 : ParentClassOne
		ParentClassOne pco = new ParentClassOne();
		ChildClass cc = new ChildClass();						// 조상 : ParentClassOne
**/
	}

}
