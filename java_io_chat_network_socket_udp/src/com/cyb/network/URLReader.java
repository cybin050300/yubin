package com.cyb.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {

	// 1. 접속 도메인 저장
	URL url;

	// 2. 읽은 데이터를 한 줄씩 빨리 처리
	BufferedReader br;

	// 3. 한줄 데이터 저장
	String line;

	public URLReader() {
	}

	// site 도메인명 전달
	public URLReader(String site) { // 도메인명 받음
		try { // 외부접속 --> try-catch
			this.url = new URL(site);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	// 1. 읽은 데이터 출력 메서드
	public void page() {
		try {
			InputStreamReader isr = new InputStreamReader(this.url.openStream()); // 인터넷에서 url
			this.br = new BufferedReader(isr);

			while ((this.line = br.readLine()) != null) {
				System.out.println(this.line);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	// 2. 읽은 데이터에 대한 기본정보 : 인코딩 / 바이트수
	public void connectInfo() {
		try {
			URLConnection conn = this.url.openConnection();// 정보 전달하기 위해 connection 필요
			System.out.println(conn.getContentEncoding());
			System.out.println(conn.getContentType());
			System.out.println(conn);
			System.out.println(conn.getURL());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		String site = "https://www.naver.com/index.html";// 접속할 주소
		URLReader url = new URLReader(site); // 주소 넘겨줄 객체
		url.page();
		url.connectInfo();
	}

}
