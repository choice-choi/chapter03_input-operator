package org.joonzis.test.test;

import java.util.Scanner;


public class Test04 {
	public static void main(String[] args) {
//		Test04.java 
//		Q. 성별을 의미하는 정수 값(1,3:남자, 2,4:여자)을 입력받아
//		"남자", "여자"출력하기
//			* 홀수-남자 짝수-여자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별 입력(1~4) >> ");
		int num = sc.nextInt();
		
		String gender = (num % 2 == 1) ? "남자" : "여자";
		
		System.out.println("성별 : " + gender);
		
		sc.close();
	}
}
