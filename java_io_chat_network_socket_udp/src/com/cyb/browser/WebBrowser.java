package com.cyb.browser;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebBrowser {

	// 자바에서 웹 브라우저 실행 가능!
	public static void main(String[] args) {
		// URI : 접속할 주소를 하나의 객체로 생성시
		try {
			Desktop.getDesktop().browse(new URI("https://www.naver.com")); // 접속할 주소 반드시 http로 시작해야함
																			// 외부 접속으로 try-catch필요
		} catch (IOException | URISyntaxException e) {
			System.err.println(e.getMessage());
		}
		/*
		 * } catch((IOException | URISyntaxException e)는 아래와 동일 }
		 * catch ((IOException
		 * e{
		 * 
		 * }catch (URISyntaxException e ){
		 * 
		 * }
		 */
	}
	

}
