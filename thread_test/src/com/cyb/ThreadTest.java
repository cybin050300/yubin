package com.cyb;

public class ThreadTest {

	// 주(메인) 스레드 : 이 스레드가 종료되면 보조 스레드들은 자동 종료
	public static void main(String[] args) {
//		MyThread m1 = new MyThread();
//		m1.start();								// 객체 만들었다고 스레드 생성되지 않음 => start 해줘야 생성	
//		MyThread m2 = new MyThread();
//		m2.start();	
//		MyThread m3 = new MyThread();
//		m3.start();
//		System.out.println("main()종료");	//스레드는 병렬처리기 때문에 맨 마지막에 찍히지 않음 - 별도의 스레드라고 생각
//		
//		FakeThread m1 = new FakeThread();
//		m1.start();								
//		FakeThread m2 = new FakeThread();
//		m2.start();	
//		FakeThread m3 = new FakeThread();
//		m3.start();
//		System.out.println("main()종료");	
//			
		FakeThread m1 = new FakeThread();
		m1.start();								
		FakeThread m2 = new FakeThread();
		m2.start();	
		FakeThread m3 = new FakeThread();
		m3.start();
		System.out.println("main()종료");	
		
		RunnableClass r1 = new RunnableClass();			// r1을 조작하고 싶은 경우
		Thread t1 =new Thread(r1);								// 스레드가 갖고 있는 메서드를 조작하고 싶은 경우 예) sleep(스레드 5초동안 재움), join
		t1.start();
		Thread t2 =new Thread(new RunnableClass() );	//메서드 사용하지 않고 구동만 시킬 경우 (컴퓨터 켰을 때 돌리는 경우 사용)
		t2.start();
		
		new Thread(new RunnableClass()).start();
		System.out.println("main()종료");	

	}

	
	public ThreadTest() {
	}

}
