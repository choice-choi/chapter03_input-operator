package org.joonzis.test;

public class text07 {

	public static void main(String[] args) {
		
//		Test07.java
//		Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
//		   BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		//scanner 없이 할 경우 변수 선언하고 값 넣기
		
		double weight = 63.5;
		double height = (165.7 / 100); //100의 자리로 나눠줘야 함
		
		double bmi = weight / (height * height);
		
//		System.out.println(bmi);
		
		//조건이 3개임 (과체중이냐 정상이냐 저체중이냐)
		String overWeight = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		
		System.out.println(bmi);
		
	}

}
