package ch04;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		문제 1) 무한 루프를 사용하여 화면 UI가 매번 출력될 수 있도록 하고 사용자의 입력에 의해서 프로그램이 종료되는 기능을 가지고 있는 구구단 출력 프로그램 작성하세요
//		1. 종료 여부 입력
//		2. 출력할 단수 입력
//		3. nextLine() : 엔터키가 입력될때까지 입력된 데이터를 문자열로 입력받음.
//		4. 문자열 비교 : 문자열.equals("비교할 문자열")
		Scanner sc = new Scanner(System.in);
		boolean r = true;
		
//		프로그램 시작 시 한번 출력하는 문구
		System.out.println("구구단 프로그램입니다.");
//		프로그램 메인 부분
		while (r) {
//			구구단 출력을 위한 로직
			System.out.println("출력할 단을 입력하세요 : ");
			int dan = sc.nextInt(); // 사용자 입력(숫자) 부분

			for (int count = 1; count < 10; count++) {
				System.out.println(dan + " X " + count + " = " + (dan * count));

			}
			
//			프로그램을 종료 하기 위한 로직
			System.out.println("종료 하시겠습니까? y/n ");
			String a = sc.next(); // 사용자 입력 "y"
			
//			 equals() : 동일한 문자열일 경우 true 출력, 다를 경우 false 출력
			if (a.equals("y")) {
				System.out.println("프로그램을 종료합니다.");
				r = false;
//				break; 
			}

		}
		sc.close();
	}
}
