package ch04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
//		���� 1) for ���� ����Ͽ� ����ڰ� �Է��� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ���

		Scanner sc = new Scanner(System.in);

		int i;
		int j;
		System.out.println("����� ���� �Է��ϼ��� : ");

//		����� �Է��� ���� ������ ����
		int num = sc.nextInt();

		System.out.println("---" + num + "��---");

		for (i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
//		����� �Է��� ���� Scanner Ŭ������ �޸𸮿��� ����
		sc.close();
	}

}
