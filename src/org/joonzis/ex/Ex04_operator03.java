package org.joonzis.ex;

public class Ex04_operator03 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a == 10 && a < 100); //true
		System.out.println(a != 10 || a == 10); //true
		System.out.println(!(a==10));			//false

		int b = 10;
		++b;
		boolean result = (a == 100) && (b > 10);
		// result : false
		// b : 10 -> short evaluate, 앞에 (a==100)이 이미 false 이므로
		// 뒤 (++b > 10)은 확인도 안함
		System.out.println(" result : " + result + ", b :" + b);
		
		//**(조건식) ? 조건이 맞으면 T : 조건이 맞지 않으면 F ;)
		
		int age = 20;
		
		// 성인과 미성년자의 요금을 따로 측정해보자
		// 성인 : 4000	미성년자 : 2000
		// boolean isAdult -> 성인 유무
		// int fee -> 성인 유무에 따른 금액
		//**(조건식) ? 조건이 맞으면 T : 조건이 맞지 않으면 F ;)
		
		
		boolean isAdult = (age >= 20) ? true : false ; //false
		int fee = (isAdult) ? 4000 : 2000;
		//int fee = (isAdult)?True:Fulse;
		System.out.println("요금 : " + fee);

		
		String id = "admin";
		// id가 admin이면 "인증성공" 아니면 "인증실패" 출력
		// 인증 변수 String auth 이용
		String auth = id.equals("admin") ? "인증성공" : "인증실패";
		System.out.println(auth);
		
		
		
		
		
	}

}
