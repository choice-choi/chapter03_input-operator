package org.joonzis.test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		
//		Test06.java
//		Q. 섭씨 화씨 변환기
//		      섭씨를 입력하면 변환된 화씨, 화씨를 입력하면 변환된 섭씨 출력하기
//		★화씨 = 섭씨 * 1.8 +32
//		  섭씨 = (화씨 -32) / 1.8

		
//		화(10) -> 섭(46.4)
//		섭(46.4) -> 화(10)

		// 위 두 변수를 각각 정수 및 실수로 변환하여 출력
				int age = Integer.parseInt(strAge);
				double height = Double.parseDouble(strHeight);
			
				System.out.println("나이 : " + age + "살");
				System.out.println("키 : " + height + "cm");

				// 문자열의 비교는 "==" 으로 비교하지 않는다.
				// equals 메소드를 이용해서 비교한다.
				
				String s1 = "aaa";
				String s2 = s1;
				String s3 = new String("aaa");
				
				if(s1==s2) {
					System.out.println("같다!");	
				}else {
					System.out.println("다르다");
				}
		
			double c,f;
		 		
			Scanner sc = new Scanner(System.in);
				
			System.out.println("화씨 입력 >> ");
			double c = sc.nextDouble();
				
			String d = 
				
				
				
		double c = Double.parseDouble(strC);
		
		System.out.println("화씨 입력 >> ");
		
		f = next.inDouble();
		
		c = (f-32)/1.8;
		
		System.out.println();
		
					//답
					//섭씨 입력 ★화씨 = 섭씨 * 1.8 +32

					double c = 100;
					double f = c * 1.8 + 32;	//화씨
					System.out.println("변환된 화씨 : " + f);
					
					//섭씨 = (화씨 -32) / 1.8
					double c = (f - 32) / 1.8;  // 위 공식과 반대로 하면 됨 정답아니니까 다시 풀기
					double f = 100					//
					System.out.println("변환된 섭씨 : " + f);
					
					
					
					
		
	}

}
