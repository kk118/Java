package ch02;

public class ExplicitConversion {
	public void explicitConversion( ) {
		System.out.println("------���� Ÿ�� ��ȯ-------");
		
		double dNum1 = 1.2; // �Ǽ����� �⺻
		float fNum2 = 0.9f; // �Ǽ��� ���� 
		
//		���� Ÿ�� ��ȯ�� ���ؼ� int Ÿ������ ��ȯ��
//		dNum1 �ϰ� fNum2�� int Ÿ������ ��ȯ��, �Ҽ��� �ڸ��� �����͸� �Ұ� ��
		int iNum3 = (int)dNum1 + (int)fNum2;
// 		1.2 + 0.9 -> 1 + 0(����int Ÿ������ ����) = ����� 1
//		iNum3�� ��ȯ ���� �߻��ϰ� ������ �̷����
		int iNum4 = (int)(dNum1 + fNum2);
//		1.2 + 0.9 = 2.1 -> 2.1�� ������ ���� ��ȯ ����� 2
//		iNum4�� ������ �����ϰ� ��ȯ�� �̷����
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
