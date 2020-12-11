package ch04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
//		문제 1) for 문을 사용하여 사용자가 입력한 숫자의 구구단을 출력하는 프로그램을 작성하세요

		Scanner sc = new Scanner(System.in);

		int i;
		int j;
		System.out.println("출력할 단을 입력하세요 : ");

//		사용자 입력을 받을 데이터 저장
		int num = sc.nextInt();

		System.out.println("---" + num + "단---");

		for (i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
//		사용자 입력을 위한 Scanner 클래스를 메모리에서 해제
		sc.close();
	}

}
