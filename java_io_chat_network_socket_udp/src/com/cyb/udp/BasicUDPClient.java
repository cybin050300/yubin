package com.cyb.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPClient {

	DatagramSocket dsock;
	DatagramPacket sPack, rPack; // 보내는 패킷, 받는 패킷
	InetAddress server;
	int port = 8888; // 클라이언트 포트 번호 => 내부 포트번호 다르기때문에 안될 때는 포트번호 바꿔보기

	public BasicUDPClient() {

	}

	public BasicUDPClient(String ip, int port) {
		try {
			// ip 를 이용하여 INetAddress 객체 읽기
			this.server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();

			// 사용자에게 보여줄 메시지
			System.out.println(">>> 서버에 접속합니다.");
			System.out.println(">> 서버에 전송할 메시지를 입력 후 Enter.");
			System.out.println(">>> 종료할 경우 quit를 입력 후 엔터");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	} // 생성자 END

	// 통신 메서드
	public void comm() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String out;
			
			while((out = br.readLine()) != null) {
				this.sPack = new DatagramPacket(out.getBytes(), // 입력문자를 byte[]
									out.getBytes().length,	//byte[] 길이
									this.server,	// 전송대상 주소
									port);		// 전송대상 port
				this.dsock.send(sPack);	// 실제 전송
				
				// 서버 수신
				byte[] buffer = new byte[1024];
				this.rPack = new DatagramPacket(buffer, buffer.length);
				this.dsock.receive(rPack); // 받는 패킷을 이용하여 서버 수신 대기
				
				String inStr = new String(this.rPack.getData(), 0, this.rPack.getData().length);
		System.out.println("서버로부터 전송된 메시지 "+ inStr);
			
			} // while() End
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	} // comm() END

	public static void main(String[] args) {
		BasicUDPClient client = new BasicUDPClient("127.0.0.1", 7777);
		client.comm();

	}

}
