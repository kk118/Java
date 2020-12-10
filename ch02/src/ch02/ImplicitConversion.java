package ch02;

public class ImplicitConversion {
	public void implicitConversion() {
		System.out.println("------타입변환--------");
		
		byte bNum = 10;
		int iNum = bNum; // byte -> int 자동 타입 변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20; // 4byte 정수형
		float fNum = iNum2;	// 4byte 실수형
//		정수형 보다 실수형이 더 큰 데이터 타입
//		int -> float 으로 자동 타입 변환 됨
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // 큰 데이터 타입과 작은 데이터 타입을 연산할 경우 큰데이터 타입으로 자동 타입 변환됨
//		연산된 결과 값은 float 타입이지만 저장될 변수가 double 타입 이므로 double 타입으로 자동 타입 변환됨
		System.out.println(dNum);
	}
}
