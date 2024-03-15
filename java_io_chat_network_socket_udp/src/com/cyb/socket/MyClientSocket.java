package com.cyb.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {
	Socket socket;
	BufferedReader in;
	PrintWriter out;

	public MyClientSocket() {
	}

	public MyClientSocket(String ip, int port) {
		try {
			this.socket = new Socket(ip, port); // 서버소켓
			// 서버 소켓에 스트림 연결
			this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			this.out = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));

			// 출력 메서드 호출
			printInfo();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	} // 생성자 END

	// 메시지 전송 메서드
	public void receive() {
		try {
			// 서버 소켓으로부터 받은 메시지 출력
			System.out.println("[서버 : ] + this.in.readLine()");

		} catch (Exception e) {
			System.err.println();
		}
	}

	// 메시지 전송 메서드
	public void send(String msg) {
		// 서버 소켓에 메시지 전송
		this.out.println(msg);
		this.out.flush();
		System.out.println("[클라이언트 : " + msg);
	}

	// 소켓 종료 메서드
	public void close() {
		try {
			this.socket.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		// 생성자에서 호출
	}

	// 출력 메서드 : MyServerSocket() 생성자내에서 호출
	private void printInfo() {
		System.out.println(">>> 서버 접속 성공");
		System.out.println(">>> 서버 주소 : " + this.socket.getInetAddress());
		System.out.println(">>> 서버 포트번호 : " + this.socket.getPort());
		System.out.println(">>> 클라이언트 포트번호 : " + this.socket.getLocalPort());
	}

	public static void main(String[] args) {
		// 서버 주소와 포트번호를 설정, 서버에 접속
		MyClientSocket client = new MyClientSocket("127.0.0.1", 7070);

		System.out.println(">>> 서버에 보낼 메시지 입력 후 엔터");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		client.send(msg);
		client.receive(); // 송신
		client.close(); // 수신 대기
		System.out.println();// 종료

	}

}
