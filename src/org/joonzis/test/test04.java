package org.joonzis.test;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		
		
//		Test04.java 
//		Q. 성별을 의미하는 정수 값(1,3:남자, 2,4:여자)을 입력받아 "남자", "여자"출력하기
//			* 1~4 사이의 값으로 입력 받기 
//			* 홀수-남자 짝수-여자
//		
//		int g = 2;
//		
//		// 1. Scanner 객체(인스턴스) 생성
		Scanner sc = new Scanner(System.in);
//			
//		// 2. 입력
//		System.out.println("이름 입력 >> ");
//		String name = sc.nextLine();
//		System.out.println("이름 : " + name);
//		
//		// 나이, 키(실수), 성별 입력 받아서 출력
//		System.out.println("나이 입력 >> ");
//		int age = sc.nextInt();
//		System.out.println("나이 : " + age);
		
		//int num = 1;
		//num % 2 == 0;
		
		System.out.println("성별 입력 : ");
		
		int num = sc.nextInt();
		
		/*
		String even = "남자";
		String odd = "여자";
		
		String res = (num%2==0) ? even : odd ;
		
		System.out.println("res");
		*/
		
		//System.out.println("남자");
		//System.out.println("여자");
		
		//!--짝수, 홀수 구하는 로직은 나누기 사용--!
		
		if (num % 2 == 0) {//만약 넘버를 2로나누었을때 나머지가 0이라면 
			System.out.println("여자");//짝수입니다 출력
		}

		else  { //if조건문에 해당되는것이 아닌것
			System.out.println("남자");//홀수입니다 출력

		}
//여기서 (number % 2 == 0)        ==은 같다의 의미,  a=b는 a에 b를 대입한다는 의미이다 
		
		
		
	}

}
