package ch05;

public class StringEx1 {
	public void StringEx1() {
		System.out.println("---StringEx1---");
//		String 타입은 참조 타입으로 new 키워드를 사용하여 변수를 선언해야 한다.
//		두개의 String 변수에 동일한 값을 입력해도 String 변수가 저장하는 것은 값이 아니라 메모리의 주소이기 때문에 단순 비교 시 서로 다르다고 출력 됨
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");
		
		System.out.println("String 변수 값 : " + str1);
		System.out.println("String 변수 값 : " + str2);
		
		System.out.println("----------");
		if (str1 == str2) {
			System.out.println("str1과 str2의 값은 같습니다.");
		}
		else {
			System.out.println("str1과 str2의 값은 다릅니다.");
		}
		System.out.println("-----------");
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 값은 같습니다.");
		}
		else {
			System.out.println("str1과 str2의 값은 다릅니다.");
		}
		
		System.out.println("-----------");
		int intArr[] = new int[5];
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		
		System.out.println("배열의 4번 index의 값 출력 : " + intArr[4]);
		System.out.println("배열의 5번 index의 값을 출력 : " + intArr[3]);
		
	}
	public void StringEx2() {
		System.out.println("---StringEx2---");
//		동일한 소스내에서 String 변수에 동일한 값을 기본타입처럼 저장했을 경우 동일한 메모리 주소를 가진다.
		String name1 = ("김동완");
		String name2 = ("김동완");
		
		if(name1 == name2) {
			System.out.println("변수 name1과 name2의 값은 같다.");
		}
		else {
			System.out.println("변수 name1과 name2의 값은 다르다.");
		}
		
//		new 키워드를 사용하게 되면 동일한 값이 저장되었어도 실제 메모리 영역에서 서로 다른 메모리 위치를 가지게 되기 때문에 다른값으로 인식한다.
		String name3 = new String("김동완");
		if (name1 == name3) {
			System.out.println("변수 name1과 name3의 값은 같다.");
		}
		else {
			System.out.println("변수 name1과 name3의 값은 다르다.");
		}
	}

}
