package ch04;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		���� 1) ���� ������ ����Ͽ� ȭ�� UI�� �Ź� ��µ� �� �ֵ��� �ϰ� ������� �Է¿� ���ؼ� ���α׷��� ����Ǵ� ����� ������ �ִ� ������ ��� ���α׷� �ۼ��ϼ���
//		1. ���� ���� �Է�
//		2. ����� �ܼ� �Է�
//		3. nextLine() : ����Ű�� �Էµɶ����� �Էµ� �����͸� ���ڿ��� �Է¹���.
//		4. ���ڿ� �� : ���ڿ�.equals("���� ���ڿ�")
		Scanner sc = new Scanner(System.in);
		boolean r = true;
		
//		���α׷� ���� �� �ѹ� ����ϴ� ����
		System.out.println("������ ���α׷��Դϴ�.");
//		���α׷� ���� �κ�
		while (r) {
//			������ ����� ���� ����
			System.out.println("����� ���� �Է��ϼ��� : ");
			int dan = sc.nextInt(); // ����� �Է�(����) �κ�

			for (int count = 1; count < 10; count++) {
				System.out.println(dan + " X " + count + " = " + (dan * count));

			}
			
//			���α׷��� ���� �ϱ� ���� ����
			System.out.println("���� �Ͻðڽ��ϱ�? y/n ");
			String a = sc.next(); // ����� �Է� "y"
			
//			 equals() : ������ ���ڿ��� ��� true ���, �ٸ� ��� false ���
			if (a.equals("y")) {
				System.out.println("���α׷��� �����մϴ�.");
				r = false;
//				break; 
			}

		}
		sc.close();
	}
}
