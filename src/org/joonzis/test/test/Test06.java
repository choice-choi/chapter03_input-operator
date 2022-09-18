package org.joonzis.test.test;

import java.util.Scanner;


public class Test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 섭씨 화씨 변환기
//		      섭씨를 입력하면 변환된 화씨, 화씨를 입력하면 변환된 섭씨 출력하기
//		★화씨 = 섭씨 * 1.8 +32
//		  섭씨 = (화씨 -32) / 1.8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨 입력 >> ");
		double inputData = sc.nextDouble();
		double outputData = inputData * 1.8 + 32;
		System.out.println("변환된 화씨 : " + outputData);
		
		
		System.out.println("화씨 입력 >> ");
		inputData = sc.nextDouble();
		outputData = (inputData-32) / 1.8;
		System.out.println("변환된 섭씨 : " + outputData);
		
		
		sc.close();
	}
}
