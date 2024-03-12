package com.cyb.split;

public class MemberClass {
	String name; // 이름
	String joinDate; // 가입일
	String lastVisitDate; // 최종방문일
	int numVisit; // 방문횟수
	String gender; // 성별
	int age; // 연령대

	public MemberClass() {

	}

	public void inputRecord(String raw) {		// raw: 가공이 안된 원시 데이터		메인클래스에서 매개변수 raw 받아옴
		
		String[] split =raw.split(",");			// String.split("구분자")==> String[]로 반환
		name=split[0];
		joinDate=split[1];
		lastVisitDate=split[2];
		numVisit=Integer.parseInt(split[3]);	// Integer.parseInt(”123”) ⇒ 문자열숫자를 정수로 변환!!
														//★ 암기!! → javascript에서 똑같이 사용
		gender=split[4];
		String temp=split[5].substring(0, 2);	// String.substring(시작 인덱스, 끝 인덱스)
		// age=Integer.parseInt(split[5]);		->> java.lang.NumberFormatException오류 발생 (문자열을 숫자로 변경할 때 발생)
		
		// "비공개" 데이터 처리 -> 비공개 데이터는 처리가 되지만 age에서 문제가 생김
		//							  => 문자열 비교는 equals 사용!!
//		if(temp != "20" || temp !="30" || temp != "40" || temp !="50") {
//			temp="0";
//		}
		if(temp.equals("비공")) {
			temp="0";
		}
		age=Integer.parseInt(temp);
	}
}
