package ch04;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---일반적인 break 사용---");
		Scanner sc = new Scanner(System.in);

		System.out.println("출력을 멈출 단수를 입력하세요 : ");
		int dan = sc.nextInt();

		for (int i = 2; i < 10; i++) {
			System.out.println("----" + i + "단 출력 ----");
			for (int j = 1; j < 10; j++) {
				if (dan == i) {
					break;
				}
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}

		System.out.println("---label을 활용한 break 사용---");

		label:for (int i = 2; i < 10; i++) {
			System.out.println("----" + i + "단 출력 ----");
			for (int j = 1; j < 10; j++) {
				if (dan == i) {
					break label;
				}
				System.out.println(i + " X " + j + " = " + i * j);
			}

		}
	}
}
