package com.cyb;

public class ThreadTest {

	// ��(����) ������ : �� �����尡 ����Ǹ� ���� ��������� �ڵ� ����
	public static void main(String[] args) {
//		MyThread m1 = new MyThread();
//		m1.start();								// ��ü ������ٰ� ������ �������� ���� => start ����� ����	
//		MyThread m2 = new MyThread();
//		m2.start();	
//		MyThread m3 = new MyThread();
//		m3.start();
//		System.out.println("main()����");	//������� ����ó���� ������ �� �������� ������ ���� - ������ �������� ����
//		
//		FakeThread m1 = new FakeThread();
//		m1.start();								
//		FakeThread m2 = new FakeThread();
//		m2.start();	
//		FakeThread m3 = new FakeThread();
//		m3.start();
//		System.out.println("main()����");	
//			
		FakeThread m1 = new FakeThread();
		m1.start();								
		FakeThread m2 = new FakeThread();
		m2.start();	
		FakeThread m3 = new FakeThread();
		m3.start();
		System.out.println("main()����");	
		
		RunnableClass r1 = new RunnableClass();			// r1�� �����ϰ� ���� ���
		Thread t1 =new Thread(r1);								// �����尡 ���� �ִ� �޼��带 �����ϰ� ���� ��� ��) sleep(������ 5�ʵ��� ���), join
		t1.start();
		Thread t2 =new Thread(new RunnableClass() );	//�޼��� ������� �ʰ� ������ ��ų ��� (��ǻ�� ���� �� ������ ��� ���)
		t2.start();
		
		new Thread(new RunnableClass()).start();
		System.out.println("main()����");	

	}

	
	public ThreadTest() {
	}

}
