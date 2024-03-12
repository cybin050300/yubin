package com.naver.news;

public class NaverMainClass {

	public static void main(String[] args) {
		final String uri = "c:/yubin/file_test/naver_news_stand_data_edit.txt";
		// final 붙이면 uri 값 변경 불가!-> 마지막으로 uri가 가지고 있는 값이라고 알려줌
		NaverMethodClass.readData(uri);
		NaverMethodClass.makeHTML("c:/yubin/file_test/html.html");
		System.out.println(NaverDataClass.news.get(0).getImg());
		System.out.println(NaverDataClass.news.get(0).getUrl());
		
		

	}

}
