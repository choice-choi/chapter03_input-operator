package org.joonzis.test_re;

public class test7 {

	public static void main(String[] args) {
//		Test07.java
//		Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
//		   BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		
		double weight = 74;
		double height = 179;
		
		System.out.println(weight);
		System.out.println(height);
		
		double bmi = weight / (height*height);
		
		String a = (bmi>=25) ? "과체중" :
						(bmi>=20) ? "정상" : "저체중";
		
		System.out.println("체질량 지수 : " + bmi + ", 체중 범위 : " + a);
		
			
		
		
		
		

	}

}
