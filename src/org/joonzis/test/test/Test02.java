package org.joonzis.test.test;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
//		Test02.java
//		Q. 나이를 입력받아 
		// "성인" 또는 "미성년자" 출력
		
		Scanner sc = new Scanner(System.in);	// 스캐너 객체 생성

		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		String adult = (age >= 20) ? "성인" : "미성년자";
		System.out.println(adult);
		//System.out.println((age >= 20) ? "성인" : "미성년자");
		
		
		sc.close(); // 스캐너 객체 소멸
	}
}
