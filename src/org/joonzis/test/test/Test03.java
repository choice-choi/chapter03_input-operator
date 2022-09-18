package org.joonzis.test.test;

import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 매출액과 등급("VIP", "일반")을 입력받아 
//		등급이 "VIP"이면 매출액에서 20%를 할인하고
//		   "일반"이면 매출액에서 5%를 할인하는 프로그램 구현 
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("매출액 입력 >> ");
		int money = sc.nextInt();
		sc.nextLine();	// nextInt()의 개행 삭제 용도
		System.out.println("등급 입력 >> ");
		String grade = sc.nextLine();
		
		int totalMoney = grade.equalsIgnoreCase("VIP") ? 
							(int)(money * 0.8) :
								(int)(money * 0.95);
							
							
		System.out.println("할인 받은 매출액은 : " + totalMoney);
		
		sc.close();
	}
}
