package com.naver.news;

// 하나의 신문사 정보를 담는 클래스
public class NaverNewsClass {
	private String img = "";
	private String url = "";
	// 1-1. 변수 선언 : private

	// 1-2. 기본 생성자
	public NaverNewsClass() {}
	

	// 1-3. 외부로부터 전달받은 데이터를 멤버(인스턴스) 변수에 대입하는 생성자
	public NaverNewsClass(String img, String url) {
		this.img = img;
		this.url = url;
	}//오버로딩 생성자
	
	// 아래 메서드는 private변수데이터에 접근하기 위한 getter들
	
	public String getUrl() {
		return url;
	}
	public String getImg() {
		return img;
	}

	public NaverNewsClass(String img, int url) {
	}
	// 1-4. private 변수데이터에 접근하기 위한 getter 들

}
