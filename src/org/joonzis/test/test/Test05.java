package org.joonzis.test.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 하이픈 없이 주민등록번호를 입력받아 (정수, 문자열) "남자","여자" 출력하기
		
		Scanner sc = new Scanner(System.in);
			
		//System.out.println("주민등록번호 입력 >> ");
		//String num = sc.next();
		String num = "9999992111111";
		
		// 1. 문자열 자르기
		String gender = num.substring(6, 7).equals("1") ? "남자" : "여자" ;
//		String gender1 = num.substring(6, 7);
//		String gender2 = gender1.equals("1") ? "남자" : "여자" ;
		
		String gender_ = (num.charAt(6)=='1') ? "남자" : "여자";
		
		System.out.println("성별 : " + gender);
		System.out.println("성별 : " + gender_);
		
		sc.close();
	}
}
