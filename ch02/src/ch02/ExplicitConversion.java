package ch02;

public class ExplicitConversion {
	public void explicitConversion( ) {
		System.out.println("------강제 타입 변환-------");
		
		double dNum1 = 1.2; // 실수형의 기본
		float fNum2 = 0.9f; // 실수형 변수 
		
//		강제 타입 변환을 통해서 int 타입으로 변환됨
//		dNum1 하고 fNum2는 int 타입으로 변환됨, 소수점 자리의 데이터를 잃게 됨
		int iNum3 = (int)dNum1 + (int)fNum2;
// 		1.2 + 0.9 -> 1 + 0(정수int 타입으로 변경) = 결과값 1
//		iNum3는 변환 먼저 발생하고 연산이 이루어짐
		int iNum4 = (int)(dNum1 + fNum2);
//		1.2 + 0.9 = 2.1 -> 2.1을 정수로 강제 변환 결과값 2
//		iNum4는 연산을 먼저하고 변환이 이루어짐
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
