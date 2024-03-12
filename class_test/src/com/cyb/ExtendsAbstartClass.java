package com.cyb;

// abstract 클래스는 상속에서만 사용 가능!
public class ExtendsAbstartClass extends AbstractClass{

	public ExtendsAbstartClass() {
		System.out.println("ExtendsAbstartClass() 생성자 호출됨");
	}

	@Override
	public void sum() {
		// AbstractClass 내의 추상메서든느 반드시 재정의가 필요!!!
	
	}	
	// 메서드 재정의 : 메서드 선언부를 수정할 수 없고, 재정의된 메서드의 {} 내부만 수정 가능!!
		public void sum(int a) {
			
		
	}

}
