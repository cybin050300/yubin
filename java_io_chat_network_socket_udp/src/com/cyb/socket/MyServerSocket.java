package com.cyb.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServerSocket {
	int port = 7070; // port no
	ServerSocket server; // ���� ����
	BufferedReader in;
	Socket socket;
	PrintWriter out;

	public MyServerSocket() {
	}

	public MyServerSocket(int port) {
		this.port = port;
		System.out.println("���� ����~!!");

		try {
			this.server = new ServerSocket(7070);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	} // ������ END

	// Ŭ���̾�Ʈ ���� ���
	public void waitClient(){
		System.out.println(">>Ŭ���̾�Ʈ�� �����ϱ� ��ٸ�~~");
		try {
			this.socket = this.server.accept();	//Ŭ���̾�Ʈ ��û ����!!!
			printInfo();
			
			// Ŭ���̾�Ʈ ���Ͽ� ��Ʈ�� ����
			this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			this.out = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	} // wait END

	// ���� �޼���
	public void receive() {
		try {
			// Ŭ���̾�Ʈ �������κ��� ���� �޽��� ���
			System.out.println("[Ŭ���̾�Ʈ �޽���1]" + in.readLine());

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// �۽� �޼���
	public void send(String msg) {
		// Ŭ���̾�Ʈ ���Ͽ� �޽��� ����
		this.out.println(msg);
		this.out.flush();
		System.out.println("[���� �޽���] " + msg);
	}

	// ���� ���� �޼���
	public void close() {
		try {
			this.socket.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// ��� �޼��� : MyServerSocket() �����ڳ����� ȣ��
	private void printInfo() {
		System.out.println(">>> Ŭ���̾�Ʈ ���� ����");
		System.out.println(">>> Ŭ���̾�Ʈ ��Ʈ��ȣ : " + this.socket.getLocalPort());
		System.out.println(">>> ���� �ּ� : " + this.socket.getInetAddress());
		System.out.println(">>> ���� ��Ʈ : " + this.socket.getPort());
	}

	public static void main(String[] args) {
	 int port = 7070;
	 MyServerSocket myServer = new MyServerSocket(port);
	 myServer.waitClient();
	 myServer.receive();
	 myServer.send("������ ���� ȯ��~!~!");
	 myServer.close();
	 
		// ���� �ּҿ� ��Ʈ��ȣ�� ����, ������ ����

		System.out.println("");
		System.out.println();

	}

}
