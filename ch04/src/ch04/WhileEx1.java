package ch04;
import java.util.Scanner;
public class WhileEx1 {

	public static void main(String[] args) {
		
//		P.109 ���� �� �Է��� �ܼ��� ������ ����ϱ�
		System.out.println("---p.109 ����---");
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
			
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		
		
		
		
		System.out.println("---����� �Է� ������---");
		Scanner sc = new Scanner(System.in);
//		int num = 1;
		int count = 0;
		System.out.println("�ܼ��� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		while(count < 9) {
//			num++;
			count++;
			System.out.println(dan + " X " + count + " = " + (dan * count));
		}
		sc.close();

	}

}
