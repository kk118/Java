package ch04;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		
		
//		���� 1) ���� ���ڸ� 0 ~ 9������ ���� 1���� �����ϰ� ����� �Է��� �޾Ƽ� ��ǻ�Ͱ� ������ ���ڿ� ���� ��� �ζ� "�����." �ٸ� ��� "�� ������ȸ��" �̶�� ������ ����ϴ� ���α׷��� �ۼ��ϼ���  
//		���� ���� : Math.random() : 0.0 ~ 0.9���� ���
//		 (int)(math.random() * �ִ밪) + �ּҰ�
//		����� �Է� : import java.util.Scanner;
//		Scanner sc = new Scanner(System.in);
//		sc.next(); ���鹮�ڰ� ���ö������� ���ڸ� �Է¹���
//		sc.nextInt() : ���鹮�ڰ� ���ö����� ���ڸ� �Է¹���
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �����ϼ��� : ");
		int num = sc.nextInt();
		int lotto = (int)(Math.random() * 10) + 1;
		
		if (lotto == num) {
			System.out.println("�ζ� �¾Ҵ�");
		}
		else 
			System.out.println(lotto + "��, ������ȸ��..");
		}

	}
}

