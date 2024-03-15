package com.cyb.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPClient {

	DatagramSocket dsock;
	DatagramPacket sPack, rPack; // ������ ��Ŷ, �޴� ��Ŷ
	InetAddress server;
	int port = 8888; // Ŭ���̾�Ʈ ��Ʈ ��ȣ => ���� ��Ʈ��ȣ �ٸ��⶧���� �ȵ� ���� ��Ʈ��ȣ �ٲ㺸��

	public BasicUDPClient() {

	}

	public BasicUDPClient(String ip, int port) {
		try {
			// ip �� �̿��Ͽ� INetAddress ��ü �б�
			this.server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();

			// ����ڿ��� ������ �޽���
			System.out.println(">>> ������ �����մϴ�.");
			System.out.println(">> ������ ������ �޽����� �Է� �� Enter.");
			System.out.println(">>> ������ ��� quit�� �Է� �� ����");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	} // ������ END

	// ��� �޼���
	public void comm() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String out;
			
			while((out = br.readLine()) != null) {
				this.sPack = new DatagramPacket(out.getBytes(), // �Է¹��ڸ� byte[]
									out.getBytes().length,	//byte[] ����
									this.server,	// ���۴�� �ּ�
									port);		// ���۴�� port
				this.dsock.send(sPack);	// ���� ����
				
				// ���� ����
				byte[] buffer = new byte[1024];
				this.rPack = new DatagramPacket(buffer, buffer.length);
				this.dsock.receive(rPack); // �޴� ��Ŷ�� �̿��Ͽ� ���� ���� ���
				
				String inStr = new String(this.rPack.getData(), 0, this.rPack.getData().length);
		System.out.println("�����κ��� ���۵� �޽��� "+ inStr);
			
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
