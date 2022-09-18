package org.joonzis.test;

public class test05 {

	public static void main(String[] args) {
		
//		Test05.java
//		Q. 하이픈 없이 주민등록번호를 입력받아 (문자열) "남자","여자" 출력하기
//			* String의 메소드 이용하기
//			* ex) charAt(), substring() 등

////		어떤 특정 정수 값이 2로 나눈 값이 0 아니면 짝수
//		
//		int sn = 1;
//		*sn은 시리얼 넘버 약자
//		
//		String gender = (sn % 2 == 0) ? "여자" : "남자";
//		
//		System.out.println("성별 : " + gender);
//		

//		정수로 할지 문자로 할지 고민하기
//		중간에 자르는 건 문자열이 편리함
//		정수로 하면 문자로 바꾼 다음에 자르는게 편리
		
//		System.out.println(str1.charAt(2));			// 지정된 index의 문자 반환
//	
//		System.out.println(str1.substring(1));		// 지정한 index 부터 모든 문자열을 반환
//		System.out.println(str1.substring(1,3));		
//		// 지정한 첫 번째 index 부터 두 번째 index 직전 까지의 문자열을 반환
		// 첫번째 index는 0번부터임
		
		
//		#1) char 메소드로 할 경우
		String sn = "9999992888888";
		Char charSn = sn1.charAt(6);
				
//		System.out.println(sn.charAt(6));
		
		//>>-- java char to int 방법 --<<
//		Character.getNumericValue(ch)를 사용하여char를int로 변환
//		Java의0에서 주어진char 빼기
//		
//		public class MyClass {
//		    public static void main(String args[]) {
//		        char myChar = '5';
//		        int myInt = Character.getNumericValue(myChar);        
//		        System.out.println("Value after conversion to int: " + myInt);
//		    }
//		}
		
		int sn = Character.getNumericValue(CharSn);
		
		String gender = (sn % 2 == 0) ? "여자" : "남자";
		
		System.out.println("성별 : " + gender);
		
		
		
//		#2) 논리식 ||로 할 경우
		String sn = "9999992888888";
		Char charSn = sn1.charAt(6); // 2로 들어가 있을 것
		
		String gender = (charSn=='2' || charSn=='4') ? "여자" : "남자";
		System.out.println("성별 : " + gender);
	
		
//		#3) substring 메소드로 할 경우(String 이기 때문에 .equals로 비교)
		String sn = "9999992888888";
//		String StrSn = sn1.substring(beginIndex, endIndex)
		String StrSn = sn1.substring(6, 7);
//		System.out.println(StrSn);
		String gender = (StrSn.equals("2") || StrSn.equals("4")) ? "여자" : "남자";
		System.out.println("성별 : " + gender);
		
		
	}

}
