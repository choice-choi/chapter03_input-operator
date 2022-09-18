package org.joonzis.test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		
		/*
		 * Test03.java
		Q. 매출액과 등급("VIP", "일반")을 입력받아 등급이 "VIP"이면 매출액에서 20%를 할인하고
   			"일반"이면 매출액에서 5%를 할인하는 프로그램 구현 
		 */
		
//		// 변수 간 연산결과 다른변수에 대입
//		int num1 = 100;
//		int num2 = 200;
//		int result = num1 + num2;
//
//		// 연산결과 'result'변수에 대입
//		System.out.println(result);
//
//		// 결과 
//		300

		
		
		//		필요한 변수 : 매출액을 담을 변수(숫자 int) /  등급을 받을 변수(문자열 String)
		//		VIP -> 80 / 곱0.8 사용
		//		일반 -> 95 / 곱0.95 사용
				
				int p = 100; // 매출액 변수
				String g = "VIP"; // 등급액 변수
				
//				문자열 비교할 거라서 equals 사용(문자열은 대소문자 확실하게 해야 함)
//				아래 식은 VIP이면 20% 할인, 그렇지 않으면 5% 할인을 의미 함 
//				(조건식) ? 조건이 맞으면 T : 조건이 맞지 않으면 F ;
				int result = g.equals("VIP") ? (int)(p*0.8) : (int)(p*0.95); 
				//조건식에서 나온거 숫자로 담을 예정, 문자로 담아도 됨(돈을 소수점으로 표시하지 않기 때문에 double로 안 함), 
				//0.0같은 소수점은 double이기 때문에 정수로 바꿔주기 위해 앞에 (int)붙임
				
				
				//int result = g.equalsIgnoreCase("vip") ? (int)(p*0.8) : (int)(p*0.95); 
				//대소문자 구분 안 할 시엔 .equalsIgnoreCase 사용
				
				
				System.out.println("할인된 금액 : " + result);
				

				
		
//		// 1. Scanner 객체(인스턴스) 생성
//				Scanner sc = new Scanner(System.in);
//					
//				// 2. 입력
//				// 매출액 입력 받아서 출력
//				
//				int price = 
//				String grade1 = "VIP";
//				String grade2 = "일반";
//				
//				
//				System.out.println("매출액 && 등급 >> ");
//				double price = sc.nextDouble();
//				System.out.println(price > );
//				System.out.println("VIP");
//				int price2 = sc.nextInt();
//				System.out.println( price <  );
//				System.out.println("일반");
//				
//				
////				System.out.println("나이 입력 >>");
////				int age = sc.nextInt();
////				System.out.println("나이 : " + age);
//				
////				public static void main(String[] args) {
////					
////					System.out.println(5/3);
////					System.out.println(5%3);
////					
////					int num = 81;
////					int front = num / 10;
////					int back = num % 10;
////					
////					System.out.println(front + "/" + back);
////				
////
////					int num2 = 3025;
////					int front2 = num2 / 100;
////					int back2 = num2 % 100;
////					
////					System.out.println(front2 + "/" + back2);
//
//		
	}

}
