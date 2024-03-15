package com.cyb.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServerSocket {
	int port = 7070; // port no
	ServerSocket server; // 서버 소켓
	BufferedReader in;
	Socket socket;
	PrintWriter out;

	public MyServerSocket() {
	}

	public MyServerSocket(int port) {
		this.port = port;
		System.out.println("서버 시작~!!");

		try {
			this.server = new ServerSocket(7070);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	} // 생성자 END

	// 클라이언트 접속 대기
	public void waitClient(){
		System.out.println(">>클라이언트가 접속하길 기다림~~");
		try {
			this.socket = this.server.accept();	//클라이언트 요청 감지!!!
			printInfo();
			
			// 클라이언트 소켓에 스트림 연결
			this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			this.out = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	} // wait END

	// 수신 메서드
	public void receive() {
		try {
			// 클라이언트 소켓으로부터 받은 메시지 출력
			System.out.println("[클라이언트 메시지1]" + in.readLine());

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// 송신 메서드
	public void send(String msg) {
		// 클라이언트 소켓에 메시지 전송
		this.out.println(msg);
		this.out.flush();
		System.out.println("[서버 메시지] " + msg);
	}

	// 소켓 종료 메서드
	public void close() {
		try {
			this.socket.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// 출력 메서드 : MyServerSocket() 생성자내에서 호출
	private void printInfo() {
		System.out.println(">>> 클라이언트 접속 성공");
		System.out.println(">>> 클라이언트 포트번호 : " + this.socket.getLocalPort());
		System.out.println(">>> 서버 주소 : " + this.socket.getInetAddress());
		System.out.println(">>> 서버 포트 : " + this.socket.getPort());
	}

	public static void main(String[] args) {
	 int port = 7070;
	 MyServerSocket myServer = new MyServerSocket(port);
	 myServer.waitClient();
	 myServer.receive();
	 myServer.send("서버에 접속 환영~!~!");
	 myServer.close();
	 
		// 서버 주소와 포트번호를 설정, 서버에 접속

		System.out.println("");
		System.out.println();

	}

}
