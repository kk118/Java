package ch04;

// java���� �ܼ� �Է��� �ޱ� ���� Ŭ����
import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� ������ ����� �Է����ּ��� : ");
		String medal = sc.next();
		
		switch(medal) {
		case "Gold" :
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
		case "Silver" :
			System.out.println("���޴� �Դϴ�.");
			break;
		case "Bronze" :
			System.out.println("���޴� �Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
			break;
		}

	}

}
