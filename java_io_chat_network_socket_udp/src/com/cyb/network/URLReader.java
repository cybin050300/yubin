package com.cyb.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {

	// 1. ���� ������ ����
	URL url;

	// 2. ���� �����͸� �� �پ� ���� ó��
	BufferedReader br;

	// 3. ���� ������ ����
	String line;

	public URLReader() {
	}

	// site �����θ� ����
	public URLReader(String site) { // �����θ� ����
		try { // �ܺ����� --> try-catch
			this.url = new URL(site);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// 1. ���� ������ ��� �޼���
	public void page() {
		try {
			InputStreamReader isr = new InputStreamReader(this.url.openStream()); // ���ͳݿ��� url
			this.br = new BufferedReader(isr);

			while ((this.line = br.readLine()) != null) {
				System.out.println(this.line);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	// 2. ���� �����Ϳ� ���� �⺻���� : ���ڵ� / ����Ʈ��
	public void connectInfo() {
		try {
			URLConnection conn = this.url.openConnection();// ���� �����ϱ� ���� connection �ʿ�
			System.out.println(conn.getContentEncoding());
			System.out.println(conn.getContentType());
			System.out.println(conn);
			System.out.println(conn.getURL());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		String site = "https://www.naver.com/index.html";// ������ �ּ�
		URLReader url = new URLReader(site); // �ּ� �Ѱ��� ��ü
		url.page();
		url.connectInfo();
	}

}
