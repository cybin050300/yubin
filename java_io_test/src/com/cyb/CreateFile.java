package com.cyb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** File Ŭ������ �̿��� ���� ���� **/
public class CreateFile {

	public static void main(String[] args) {
		// 1. ���ϻ��� ��� �� ���ϸ�.Ȯ����
		String fname = "c:/filetest/newFile2.txt";

		// 2. File ��ü ����
		File f = new File(fname);

		// 3. ������ ������ ���� ���� Ȯ��
//		if (!f.exists()) {
//			// ������ ������ ������ ����
//			System.out.println("�ش� ������ ã�� �� ����~ " + fname);
//		}	
		/** try ������ �� **/

		// 4. ���ο� ���� ���� : newFile.txt
		// ���� ������ ���������ֱ� ������ ���� ó�� �ʿ�!!!
		try {
			if (!f.exists()) { // ������ �θ� ���� ���� Ȯ��
				// ������ ������ ������ �����Ͽ� ���� ����
				f.createNewFile();

				System.out.println("�ش� ������ ����~ " + fname);
			}

			FileWriter fw = new FileWriter(f);
			fw.write("sss������");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
