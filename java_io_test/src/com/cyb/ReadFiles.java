package com.cyb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/** stream ������� ���� �б� **/
// stream ��� : byte ������ ���ڸ� �б�(��, �� ���ڸ� �����ڵ� ������ �о�� ���)
// int (����) ���·� ���� �� , char�� ��ȯ�Ͽ� ���
// �����ڵ�� ���� �ٱ��� ������ ���� �� ���
public class ReadFiles {

	public static void main(String[] args) {
		int data; // byte ���� ���ڸ� ����

		// ���� ������ ���
		String fname = "src/com/cyb/ReadFiles.java";

		try {
			// File�� ��Ʈ������ �б� : FileInputStream ��ü ����
			FileInputStream fis = new FileInputStream(fname);
			
			while ((data = fis.read()) != -1) {	// ���̻� ���� ���ڰ� ������ -1�� ��ȯ
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
