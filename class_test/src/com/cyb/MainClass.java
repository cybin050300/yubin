package com.cyb;

import com.cyb.ex.ChildClass;
import com.cyb.ex.ExtendClassOne;
import com.cyb.ex.ParentClassOne;

public class MainClass {

	public static void main(String[] args) {
		ExtendsAbstractClass eac = new ExtendsAbstartClass();
		
		// abstract Ŭ������ �����ڴ� ���� �� ������, ��ü ��ü ���� �Ұ�!
//		AbstractClass ac = new AbstractClass();
		
		// interface�� �����ڰ� ���� ������ ��ü ���� �Ұ�!!
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
		ParentClassOne eco = new ExtendClassOne();		// ���� : ParentClassOne
		ParentClassOne ect = new ExtendClassTwo();		// ���� : ParentClassOne
//		Object eco = new ExtendClassOne();		// ���� Ŭ������ ������ object
//		Object ect = new ExtendClassTwo();	
		ExtendClassTwo ect2 = (ExtendClassTwo)ect;		// ��ü �� ��ȯ�ؾ��� 
																		// �ڽ� ���� �νĽ�Ű�� ���� ���� �θ� Ÿ������ ��ȯ�ؾ���

		ParentClassOne pco = new ParentClassOne();		
		ParentClassOne cc = new ChildClass();						// ���� : ParentClassOne
		
		/**
		ExtendClassOne eco = new ExtendClassOne();		// ���� : ParentClassOne
		ExtendClassTwo ect = new ExtendClassTwo();		// ���� : ParentClassOne
		ParentClassOne pco = new ParentClassOne();
		ChildClass cc = new ChildClass();						// ���� : ParentClassOne
**/
	}

}
