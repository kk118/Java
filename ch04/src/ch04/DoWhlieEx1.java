package ch04;

public class DoWhlieEx1 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");

	}

}
