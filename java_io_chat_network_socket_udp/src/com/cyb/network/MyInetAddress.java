package com.cyb.network;

import java.net.InetAddress;

// InetAddress.class
// � �����ο� ���� �ּ�, ȣ��Ʈ�� �������� �˾Ƴ�
public class MyInetAddress {
	private InetAddress ip;

	public MyInetAddress() {
	}

	public MyInetAddress(InetAddress ip) {
		this.ip = ip;
	}

	public void setIp(InetAddress ip) {
		this.ip = ip;
	}

	// InetAddress ��ü�� ���� ������ �����ϴ� �޼���
	public void info() {
		System.out.println(this.ip.getHostAddress());	// IP ��ȣ�� ����
		System.out.println(this.ip.getHostName());		// �����θ� ����
		System.out.println(this.ip.toString());			// IP, ������ ���
	}

	//main()
	public static void main(String[] args) {

		try {
			// InetAdderss.getLocalHost() ���� �� pc
			// InetAdderss : ip ��ȣ �� ������ ����� �����ϴ� ��ü(Ŭ����)
			MyInetAddress my = new MyInetAddress(InetAddress.getLocalHost());
			my.info();

			// InetAddress.getByName() : �������� ���� ip��ȣ ��� �����Ͽ� InetAddress ��ü�� ��ȯ
			my.setIp(InetAddress.getByName("www.youtube.com"));
			my.info();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
