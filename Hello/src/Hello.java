
/**
 * @author ADMIN
 *
 */
/**
 * @author ADMIN
 *
 */
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, welcome to the java world!!");

//		���� ���� �� ���
		int x = 1;
		int y = 2;
		int result = x + y;

		System.out.println(result);
//		ī�� ǥ�� �� : �̸��� ù ��° �ܾ��� ù ��° ���ڴ� �ҹ���, ������ ���ڵ� �ҹ��ڷ� ǥ����. �̾����� �ι�° �ܾ��� ù ��° ���ڸ� �빮�ڷ� ǥ���ϰ� ������ ���ڴ� �ҹ��ڷ� ǥ��
		
//		������ ������ Ÿ�� ���� ��� �Ұ�
		int num = 100;
		System.out.println(num);
//		int Ÿ������ ������ ������ �ٸ� Ÿ���� �����͸� �Է��� �� ����
//		num = "���ڿ�";
//		System.out.println(num);
		
//		���� �̸� �ϰ� ��� ���� �ʱ�ȭ �۾��� �����ϸ� ���� ���� 
		
//		value = 0; // ���߿� �ʱ�ȭ�� ���� �ϴ� ���
		int value = 0; // ����� ���ÿ� �ʱ�ȭ�� ������ ���
//		int value;�ʱ�ȭ ���� �ʰ� �ٷ� ���
		int result2 = value + 10;
		System.out.println(result2);
		
		int var1 = 10;
		System.out.println("main �Լ����� ������ ���� var1�� �� " + var1);
		
		if (true) {
			int var2 = 20;
			System.out.println("if ������ ������ ���� var2�� �� : " + var2);
		}
//		var2 �� if���� �ڵ������ ����Ǿ��� ������ if���� �ڵ�� �ۿ��� ����� �� ����, if���� �ڵ���� ����� if������ ����Ǿ��� ��� ������ �ڵ������� �޸𸮿��� ������
//		System.out.println(var2);
		
		for (int i = 0; i < 1; i++) {
			int var3 = 30;
			System.out.println("for ������ ������ ���� var3�� �� : " + var3);
		}
		
//		System.out.println(var3);
		
		
//		������ ������ �̸��� ����� �� ����
//		������ �̸��� ������ ������ �� ����
		int name = 100;
		System.out.println(name);
		name = 1000;
//		�ҽ��� ��ܿ� �̹� ������ �̸��� ������ ���� �Ǿ� �ֱ� ������ ������ �߻�
//		int name = 1000;
		
		dataType();
		dataType2();
		dataType3();
//		���� Ÿ�� ���� charEx1 ����
		charEx1();
		charEx2();
		
	}
	public static void dataType() {
		System.out.println("----------dataType---------");
		
//		byte Ÿ���� -128 ~ 127������ ���ڸ� ������ ����
//		�� ��ġ�� �Ѿ�� ���ڴ� ���������� ����Ǵ°��� �������� ����
//		Java������ ������ Ÿ���� �Ѿ�� �����͸� ����ϴ� ��� ������ ǥ������(C/C++������ ǥ������ �ʰ� �ǵ����� ���� �����Ͱ� �����)
		byte b = 127;
		System.out.println("byte ���� b: " + b);
		
//		char Ÿ���� ���ڸ� �����ϱ⵵ ������ ���ڸ� �����ϱ� ���� ������ Ÿ��, ASCII�ڵ带 �����ϱ� ���� Ÿ��
//		char Ÿ�Կ� ���ڸ� ������ ��� ' '�� ����ؾ� ��
//		Java�� ���� Ÿ�԰� ���ڿ� Ÿ���� ���� �����ϱ� ������ ''�� ���� Ÿ�Կ� ����ϰ�, " "�� ���ڿ� Ÿ�Կ� �����
		char c = 100;
		System.out.println("char ���� c : " + c);
		
		char c1 = 10;
		char c2 = (char)(c + c1);
//		char c1 = (char)(c + (char)10);
		System.out.println("char ���� c2 : " + c2);
		
		short s = 350;
		System.out.println("short ���� : " + s);
	}
	
	public static void dataType2() {
		System.out.println("---------dataType2------");
		
//	float, double �� �Ǽ��� (�ε��Ҽ���) ���ڸ� �����ϱ� ���� ������ Ÿ��
//	float Ÿ���� ������ ���� �� �ݵ�� ���̻� f�� �Է��ؾ���
		float f = 0.1f;
		System.out.println("float ���� : " + f);
		
//		double Ÿ���� �Ǽ��� ������ �⺻ Ÿ���̱� ������ ���̻縦 ������� �ʾƵ���
//		double Ÿ�԰� float Ÿ���� ���� �� double Ÿ������ ��ȯ�� �� �����
//		������ ���� �� int Ÿ������ ��ȯ �� �����

		double d = 0.1;
		System.out.println("double ���� d : " + d);
	}
	
	public static void dataType3() {
		System.out.println("-------dataType3------");
		
//		boolean Ÿ���� true, false�� ���� ������ Ÿ��
//		boolean Ÿ���� false �� false, ����0, ���ڴ� '\0', ���ڿ� "", null
//		boolean Ÿ���� true �� true, ���� 0�� �ƴ� ��� ��, ���ڿ� " " �ƴ� ��� ���ڿ�
		boolean bool = true;
		System.out.println(bool);
	}
	
	
	public static void charEx1() {
		System.out.println("--------charEx1--------");
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int)ch3);
		
//		int Ÿ���� ���� Ÿ���� �⺻ �ڷ�����
//		������ ������ int Ÿ������ ������ �����
		int i = 1000;
		System.out.println("int ���� i : " + i);
		
//		int Ÿ������ ǥ���� �� ���� ��� ����ϴ� ������ Ÿ��
//		long Ÿ�� ������ �����͸� ������ ��� �������� ���� L�� �ٿ���� ��
//		���̻� L�� ������ ���� ��� int Ÿ������ �ν�
		long l = 10000;
		System.out.println("long ���� l : " + l);
	}
	
	public static void charEx2() {
	System.out.println("----------charEx2--------");
//	Java�� char Ÿ���� �����ڵ带 ����� �� ����
	char ch1 = '��';
	char ch2 = '\ud55c';
	
	System.out.println(ch1);
	System.out.println(ch2);
	
	}
	
}
