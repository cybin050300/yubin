package com.naver.news;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�۾��� ���� �޼���� : Ŭ������.�޼���()
public class NaverMethodClass {

	// 3-1. ��ü News ������ ���� ��ü : static, private

	// 3-2. �⺻ ������
	public NaverMethodClass() { // �⺻ ������
	} // ������ end

	// 3-3. ��ü News ������ ���� ��ü ���� �޼���

	// 3-4. FileReader�� BufferedReader�� �̿��Ͽ� txt ������ �о���̴� �޼���
	public static void readData(String uri) {
		// 1. ���� ��� : uri (�޼ҵ� ������ ��� �� ���� - >"; �Ѱܹ���)

		// 2. ���� ��θ� �̿��� FileReader��ü
		FileReader fr = null;

		// 3. BufferedReader��ü
		BufferedReader br = null;

		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String one ="";
			while((one = br.readLine()) !=null)  {
				 
				String[] temp = one.split("\", \"");

				// �ϳ��� ��ü�� ���� =>"; NaverNewsClass
				NaverNewsClass news = new NaverNewsClass(temp[1], temp[2]);
//				System.out.println(temp[0]); // �̹��� �̸�
//				System.out.println(temp[1]); // ��ũ�ּ�

				// ��ü ������ ����ҿ� �߰�
				NaverDataClass.news.add(news);

				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// 4. while(){}
	}

	// 3-5. String�� �̿��Ͽ� HTML �±׵��� �����ϴ� �޼���
	public static void makeHTML(String uri) {
		String tags = "<!doctype html>";
		tags = tags + "<html>";
		tags = tags + "<head>";
		tags = tags + "<meta charset=\"utf-8\">";
		tags = tags + "<title>�ؽ�Ʈ ����</title>";
		tags = tags + "</head>";
		tags = tags + "<body>";
		tags = tags + "<h1 style=\"color:red\">NEWS</h1>";
		
		for(int i=0; i<NaverDataClass.news.size();i++) {
				tags = tags + "<a href= https://" + NaverDataClass.news.get(i).getUrl()+">";
				tags = tags + "<img src=./newsImages/" + NaverDataClass.news.get(i).getImg() +" />";
		}
		tags = tags + "</a>";
		tags = tags + "</body>";
		tags = tags + "</html>";

				FileWriter fw = null;
				
				try {
					fw = new FileWriter(uri);
					fw.write(tags);
					fw.close();
					
				System.out.println("HTML ���� ���� �Ϸ�!");
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
	}
}
