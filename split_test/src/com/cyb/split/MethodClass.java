package com.cyb.split;

import java.util.ArrayList;

// ��������, �ߺ��Ǵ� �ڵ�Ʋ, ���̺귯��
public class MethodClass {

	public MethodClass() {
		
		
	}
	// ������ �޼���
		public int sum(MemberClass[] mc) {
				int sum = 0;
				for(int i=0; i<mc.length;i++) {
					sum=sum+mc[i].age;
				}
				return sum;

			} // sum() END
		
		// ��� �޼���
		public double avg(int sum, int total) {
//			double a=(double)sum/total;
//			return a;
			return (double)sum/total;
		} // avg() END
		
		// �̸� �˻� �޼���(�湮Ƚ���� ��ȯ)
		public int searchName(String name, MemberClass[] mcArray) {
			int visit=0;
			for(int i=0; i<mcArray.length; i++) {
				if(name.equals(mcArray[i].name)) {
					visit =mcArray[i].numVisit;
				}
			}
			return visit;
			
		} // searchName() END

}