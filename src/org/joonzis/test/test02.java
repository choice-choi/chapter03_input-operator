package org.joonzis.test;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		/*
		 * Test02.java
		Q. 나이를 입력받아 "성인" 또는 "미성년자" 출력
		 */
		
//		//**(조건식) ? 조건이 맞으면 T : 조건이 맞지 않으면 F ;)
//		// < 식 구하는 순서 > 
//		1) 변수 간 연산결과 다른변수에 대입
//		int num1 = 100;
//		int num2 = 200;
//		int result = num1 + num2;
		
//		2) 연산결과 'result'변수에 대입
//		System.out.println(result);
//
//		3) 결과 
//		
//				int age = 20;
//				
//				// 성인과 미성년자의 요금을 따로 측정해보자
//				// 성인 : 4000	미성년자 : 2000
//				// boolean isAdult -> 성인 유무
//				// int fee -> 성인 유무에 따른 금액
//				//**(조건식) ? 조건이 맞으면 T : 조건이 맞지 않으면 F ;)
//				
//				
//				boolean isAdult = (age >= 20) ? true : false ; //false
//				int fee = (isAdult) ? 4000 : 2000;
//				//int fee = (isAdult)?True:Fulse;
//				System.out.println("요금 : " + fee);
//
//				
//				String id = "admin";
//				// id가 admin이면 "인증성공" 아니면 "인증실패" 출력
//				// 인증 변수 String auth 이용
//				String auth = id.equals("admin") ? "인증성공" : "인증실패";
//				System.out.println(auth);

//		#1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		String isAdult = (age >= 20) ? "성인" : "미성년자" ;
		
//		#2
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("나이를 입력해주세요");
//		int age = sc.nextInt();
//		
//		boolean isAdult = (age >= 20) ? true : false ; 
//		String result = (isAdult) ? "성인" : "미성년자" ;
//		System.out.println(result);
		
		
		
	}

}
