package com.cyb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public MyInputStreamReader() {
	}

	public static void MyStreamReader() {
		// MyInputStreamReader.java�� �� ������ �б�
		String line; // �� ���� ����
		String fname = "src/com/cyb/MyInputStreamReader.java";

		try {
			// FileInputStream => fname
			FileInputStream fis = new FileInputStream(fname);

			// InputStreamReader => FileInputStream
			InputStreamReader isr = new InputStreamReader(fis);

			// BufferedInputStream => InputStreamReader => readLine()
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Encoding: " + isr.getEncoding());

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			isr.close();
			fis.close();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
