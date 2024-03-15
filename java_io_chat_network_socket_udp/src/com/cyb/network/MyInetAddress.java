package com.cyb.network;

import java.net.InetAddress;

// InetAddress.class
// 어떤 도메인에 대한 주소, 호스트가 누구인지 알아냄
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

	// InetAddress 객체를 통해 정보를 추출하는 메서드
	public void info() {
		System.out.println(this.ip.getHostAddress());	// IP 번호만 추출
		System.out.println(this.ip.getHostName());		// 도메인명만 추출
		System.out.println(this.ip.toString());			// IP, 도메인 출력
	}

	//main()
	public static void main(String[] args) {

		try {
			// InetAdderss.getLocalHost() 현재 내 pc
			// InetAdderss : ip 번호 및 도메인 명등을 포함하는 객체(클래스)
			MyInetAddress my = new MyInetAddress(InetAddress.getLocalHost());
			my.info();

			// InetAddress.getByName() : 도메인을 통해 ip번호 등ㅇ르 추출하여 InetAddress 객체로 반환
			my.setIp(InetAddress.getByName("www.youtube.com"));
			my.info();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
