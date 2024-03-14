package com.cyb;

import java.io.File;
import java.util.Date;

/** ������ ���� : File **/
public class FileInfo {

	public static void main(String[] args) {
	
		String fname = "C:/filetest";

		// 1. ������ ��� ���� File ��ü ����
		File f = new File(fname); 					// ���� �����ڿ��� � ������ � ����Ÿ�� �ְڴ�!
		System.out.println(f.getPath()); 			// �ش� ���Ͽ� ���� �̸��� ���� ReadFiels.java - ��� ��� \src\com\cyb
		System.out.println(f.getAbsolutePath());	// ���� ��� : ����̺��: \~~ - ����̺���� ���� C:\yubin\java_io_test\src\com\cyb
		
		System.out.println("����" + f.canWrite()); 			// ������ �Ӽ��� ���� Ȱ��ȭ ���� = ��� ���Ⱑ ���Ǿ��ִ���(true) �ȵǾ��ִ���
		System.out.println("�б�" + f.canRead()); 			// ������ �Ӽ��� �б� Ȱ��ȭ ����
		System.out.println(f.getParent()); 			// �θ� ���� ���
		System.out.println("����" + f.isFile());					// ������ ������ �����̸� true
		System.out.println("����"+f.isDirectory());			// ���� ������ �����̸� true
		Date date = new Date(f.lastModified());// ��¥����ϴ� Ŭ����
		System.out.println(date); 		// ������ ������ ���� ��¥ �� �ð�(������ ��ȯ)
		System.out.println(f.length()); 				// ������ ũ�� (byte)
		
		String[] fileList = f.list();	// ������ ���� ���� ���ϸ� ����Ʈ
		for(String n : fileList) { // n�� ������ ������ �� �� �� ����������
			System.out.println(n);
		}
		System.out.println(fileList.length);

	}

}
