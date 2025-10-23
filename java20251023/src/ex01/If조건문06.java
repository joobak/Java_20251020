package ex01;

public class If조건문06 {

	public static void main(String[] args) {

		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세이상 : 무료
		 * 20 ~ 64 : 할인율 0%
		 * 15 ~ 19 : 할인율 20%
		 * 7 ~ 14 : 할인율 50%
		 * 6 미만 : 무료
		 */

		/*
		 * int number = 65;
		 * 
		 * if(number >= 65 ) { System.out.println("나이 65세 이상은 무료 입니다."); }else if(number
		 * >= 64) { System.out.println("나이 64세 이하는 2000* 원입니다"); }else if(number >= 19)
		 * { System.out.println("나이 19세 이하는 1600원입니다"); }else if(number >= 14) {
		 * System.out.println("나이 14세 이하는 1000원입니다"); }else if(number >= 5) {
		 * System.out.println("나이 6세 미만는 무료입니다"); }
		 * System.out.println("------ㅡ프로그램 종료--------");
		 */

		int age = 19; //나이
		int fee = 2000; // 요금
		double rate = 0; //할인율

		if(age>65) {
			fee = 0;
		}else if(age>=20 & age<65) { //20~64
			rate = 0;
		}else if(age>=15 & age<20) { //15~19
			rate = 0.2;
		}else if(age>=7 & age<15) { //7~14
			rate = 0.5;
		}else {
			fee = 0;
		}

		if(fee != 0) {
			fee = (int)(fee * (1 - rate));
		}
		System.out.println("나이" + age + "세는" + "요금" + fee + "원입니다." );
		System.out.println("------ㅡ프로그램 종료--------");
	}
}
