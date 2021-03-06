package ch05;

import java.util.Arrays;

public class ArrEx2 {
	public void arrEx2() {
		System.out.println("---arrEx2---");

//	배열을 미리 선언 
		int[] arr1;
//		필요시에 모든 데디터를 한번에 입력하여 사용하기 
		arr1 = new int[] { 1, 2, 3, 4, 5 };

//		빈 배열을 먼저 선언하고 필요시에 모든 데이터를 한번에 입력하여 사용할 경우 반드시 new 키워드를 사용하는 방식을 사용해야함
//		코드블럭과 데이터 만 대입해서 사용하는 방식은 변수 선언과 동시에 입력할 경우에만 사용이 가능함.
//		arr1 = {1, 2, 3, 4, 5} 안되는 방식

		System.out.println("배열 arr1의 크기 : " + arr1.length);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}

	public void arrEx3() {
		System.out.println("---arrEx3---");
//	배열을 선언과 동시에 데이터를 입력하여 사용하기 1
//	int[] arr1 = new int[] {1, 2, 3, 4, 5};

//	배열을 선언과 동시에 데이터 입력하여 사용하기 2
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println("배열 arr1의 크기 : " + arr1.length);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[ " + i + "] : " + arr1[i]);
		}
	}

	public void arrEx4() {
		System.out.println("---arrEx4---");

//	배열을 미리 선언하고 필요 시에 배열의 크기만 설정 
		int[] arr1;
		arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;

		int[] arr2 = null;
		arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;

//	가장 많이 사용, 배열을 선언 시 new 키워드를 사용하고, 배열의 총 크기를 설정하는 방식
//	

		int[] arr3 = new int[5];
		arr3[0] = 1;
		System.out.println("arr1 의 크기 : " + arr1.length);

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

	public void arrEx5() {
		System.out.println("---arrEx5---");

		char[] alphabets = new char[26];
		char ch = 'A';
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + " : " + (int) alphabets[i]);
		}
	}

	public void twoDimension1() {
		System.out.println("---twoDimension1---");

//		배열의 첫번째 대괄호 밖에 있는 배열을 뜻함
//		배열의 두번째 대괄호는 안에 배열을 뜻함
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

//		arr[0][0]의 첫번째 대괄호의 인덱스번호 0은 밖의 대괄호의 0번 요소를 뜻함.

		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
	}

	public void twoDimension2() {
		System.out.println("---twoDimension2---");

		int[][] arr = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);

	}

	public void twoDimension3() {
		System.out.println("---twoDimension3---");

//		문제 1) 2차원 배열을 선언과 동시에 1 ~ 25 까지의 숫자를 저장하는 2차원 배열을 생성하세요
		int[][] arr1 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };

//		문제 2) 2차원 배열을 선언하고, 1 ~ 25까지의 숫자를 나중에 입력하는 형태의 배열을 생성하세요
//		데이터 추가 부분까지 입력 
		int[][] arr2 = new int[5][5];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;

		arr2[1][0] = 6;
		arr2[1][1] = 7;
		arr2[1][2] = 8;
		arr2[1][3] = 9;
		arr2[1][4] = 10;

		arr2[2][0] = 11;
		arr2[2][1] = 12;
		arr2[2][2] = 13;
		arr2[2][3] = 14;
		arr2[2][4] = 15;

		arr2[3][0] = 16;
		arr2[3][1] = 17;
		arr2[3][2] = 18;
		arr2[3][3] = 19;
		arr2[3][4] = 20;

		arr2[4][0] = 21;
		arr2[4][1] = 22;
		arr2[4][2] = 23;
		arr2[4][3] = 24;
		arr2[4][4] = 25;

//	문제 3) 2차원 배열을 선언하고 1 ~ 25까지의 숫자를 반복문을 통하여 입력하고 출력하는 프로그램을 작성하세요 

		int[][] arr3 = new int[5][5];
		int count = 1;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println("arr3[" + i + "][" + j + "] : " + arr3[i][j]);
			}
		}
//	문제 4) 문제 3번을 활용하여 1 ~ 25까지의 숫자의 합을 계산하는 프로그램을 작성하세요.
		System.out.println("---문제 4)---");

		int total = 0;

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				total += arr3[i][j];
			}

		}
		System.out.println("arr3의 총합은 : " + total);
	}

	public void arrayCopy1() {
		System.out.println("---배열 복사 1---");

		int[] arr1 = new int[] { 1, 2, 3, };
		int[] arr2 = null;

		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		arr2 = arr1;
		System.out.println("배열arr2에 배열arr1의 값을 대입");
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("배열 arr1[0]의 데이터 변경");
		arr1[0] = 100;

		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("배열 arr2[2]의 값 변경");
		arr2[2] = 3000;
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

	}

	public void arrayOutput(int[] array, String name) {
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(name + "array[" + i + "] : " + array[i]);
			}
		} else {
			System.out.println(name + "배열이 비었습니다.");
		}
	}

	public void arrayCopy2() {
		System.out.println("\n---arrayCopy2---\n");
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = null;

		System.out.println("복사 전의 원본 배열");
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("for문을 통한 복사");
		arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("배열 arr1[0]의 값 변경");
		arr1[0] = 100;
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("배열 arr2[2]의 값 변경");
		arr2[2] = 3000;
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
	}

	public void arrayCopy3() {
		System.out.println("\n---arrayCopy3---\n");

//		System.arraycopy() 메소드를 이용하여 배열을 복사 
//		System.arraycopy(원본, 복사시작지점, 사본, 복사지점, 복사할길이);
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[10];
		System.out.println("복사 전 원본 배열");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");

		System.out.println("복사 후 배열");
		System.arraycopy(arr1, 0, arr2, 0, 5);
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("배열 arr1[0]의 값 변경");
		arr1[0] = 100;
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("배열 arr2[2]의 값 변경");
		arr2[8] = 9000;
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

	}

	public void arrayCopy4() {
		System.out.println("\n---arrayCopy4---\n");

//		Arrays 클래스 : 해당 배열에 여러가지 기능을 사용할수 있도록 도와주는 클래스 
//		copyOf(원본, 복사할길이) :  원본 배열의 0 index 에서 지정한 길이만큼 테이터 복사
//		copyOfRange(원본, 시작 index, 끝index) :원본 배열에서 지정한 시작 index부터 지정한 끝 index까지 데이터를 복사.

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[10];

		System.out.println("원본 배열");
		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");

		System.out.println("Arrays.copyof 복사 후 배열");

		arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println("배열 arr1의 데이터");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터");
		arrayOutput(arr2, "arr2");
	}
	public void adFor() {
		System.out.println("향상된 For문");
		
		int[] scores = new int[] {95, 71, 84, 93, 87};
		
		int total = 0;
		System.out.println("일반 적인 for문을 사용하여 총합 구하기");
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
//		원본배열의 요소를 직접사용
		}
		System.out.println("total의 값 : " + total);
		
		System.out.println("향상된 for문을 사용하여 총합구하기");
		total = 0;
		for(int value:scores) {//배열의 시작부터 끝까지
			total += value;
		}
		System.out.println("total의 값 : " + total);
	
	}
}