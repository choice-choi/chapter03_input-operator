package org.joonzis.test_re;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// Test01.java
//		Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현
//		* 임시 변수 필요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력 >> ");
		int a = sc.nextInt();
		
		System.out.println("두 번째 정수 입력 >> ");
		int b = sc.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a + ", b : " + b);
		
		sc.close();
		
		
	
		
		
		
		

	}

}
