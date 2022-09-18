package org.joonzis.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/*
		 * Test01.java
		Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현
		 * 임시 변수 필요
		 */
		

		//Scanner sc = new Scanner(System.in);
		
		int a = 10;
		int b = 20;
		
		int tmp;
		System.out.println("a:" + a + "b:" + b); 
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a:" + a + "b" + b);
		
		
		/*
		int x = 10, y = 20;
		int tmp; // x값을 임시로 저장할 변수

		System.out.println("x:" + x + "y:" + y);

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x:" + x + "y:" + y);
		*/
		
		/*
		a=10
		b=20
		c=b;
		
		b=a;
		a=c
		*/
		
		//다른 해답. 아래 참조
		
		int a = 10;
		int b = 20;

		int tmp = a;	// 데이터 임시 저장
		a = b;			// a의 값을 저장해놓았기 때문에 변경 가능
		b = tmp;		// 저장한 a의 값을 b에 저장
		
		System.out.println("a:" + a + "b" + b);
		
	}

}
