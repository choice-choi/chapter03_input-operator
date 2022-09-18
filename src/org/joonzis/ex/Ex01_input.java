package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_input {
	public static void main(String[] args) {
		
	// 1. Scanner 객체(인스턴스) 생성
	Scanner sc = new Scanner(System.in);
		
	// 2. 입력
	System.out.println("이름 입력 >> ");
	String name = sc.nextLine();
	System.out.println("이름 : " + name);
	
	// 나이, 키(실수), 성별 입력 받아서 출력
	System.out.println("나이 입력 >> ");
	int age = sc.nextInt();
	System.out.println("나이 : " + age);
	
	System.out.println("키 입력 >> ");
	double height = sc.nextDouble();
	System.out.println("키 : " + height);
	
	sc.nextLine(); //nextInt, nextDouble에 개행 문자 삭제
	
	System.out.println("성별 입력 >> ");
	String gender = sc.nextLine();
	System.out.println("성별 : " + gender);
	
	
	
	
	}
}
