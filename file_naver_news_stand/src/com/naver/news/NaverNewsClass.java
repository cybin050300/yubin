package com.naver.news;

// �ϳ��� �Ź��� ������ ��� Ŭ����
public class NaverNewsClass {
	private String img = "";
	private String url = "";
	// 1-1. ���� ���� : private

	// 1-2. �⺻ ������
	public NaverNewsClass() {}
	

	// 1-3. �ܺηκ��� ���޹��� �����͸� ���(�ν��Ͻ�) ������ �����ϴ� ������
	public NaverNewsClass(String img, String url) {
		this.img = img;
		this.url = url;
	}//�����ε� ������
	
	// �Ʒ� �޼���� private���������Ϳ� �����ϱ� ���� getter��
	
	public String getUrl() {
		return url;
	}
	public String getImg() {
		return img;
	}

	public NaverNewsClass(String img, int url) {
	}
	// 1-4. private ���������Ϳ� �����ϱ� ���� getter ��

}
