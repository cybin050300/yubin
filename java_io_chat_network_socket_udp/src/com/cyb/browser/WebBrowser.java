package com.cyb.browser;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebBrowser {

	// �ڹٿ��� �� ������ ���� ����!
	public static void main(String[] args) {
		// URI : ������ �ּҸ� �ϳ��� ��ü�� ������
		try {
			Desktop.getDesktop().browse(new URI("https://www.naver.com")); // ������ �ּ� �ݵ�� http�� �����ؾ���
																			// �ܺ� �������� try-catch�ʿ�
		} catch (IOException | URISyntaxException e) {
			System.err.println(e.getMessage());
		}
		/*
		 * } catch((IOException | URISyntaxException e)�� �Ʒ��� ���� }
		 * catch ((IOException
		 * e{
		 * 
		 * }catch (URISyntaxException e ){
		 * 
		 * }
		 */
	}
	

}
