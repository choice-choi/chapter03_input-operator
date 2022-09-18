package org.joonzis.ex;

public class Ex03_operator02 {

	public static void main(String[] args) {
		
		// 증감
		int num = 10;
		System.out.println(num);
		num++;
		num = num + 1;
		num += 1;
		System.out.println(num);

		// 시프트
		int num2 = 8;
		System.out.println("왼쪽 시프트 : " + (num2<<1));
		System.out.println("오른쪽 시프트 : " + (num2>>1));
		
	}

}
