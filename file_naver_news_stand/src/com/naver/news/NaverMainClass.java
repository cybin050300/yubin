package com.naver.news;

public class NaverMainClass {

	public static void main(String[] args) {
		final String uri = "c:/yubin/file_test/naver_news_stand_data_edit.txt";
		// final ���̸� uri �� ���� �Ұ�!-> ���������� uri�� ������ �ִ� ���̶�� �˷���
		NaverMethodClass.readData(uri);
		NaverMethodClass.makeHTML("c:/yubin/file_test/html.html");
		System.out.println(NaverDataClass.news.get(0).getImg());
		System.out.println(NaverDataClass.news.get(0).getUrl());
		
		

	}

}
