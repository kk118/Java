package ch04;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		
		
//		문제 1) 랜덤 숫자를 0 ~ 9까지의 숫자 1개를 생성하고 사용자 입력을 받아서 컴퓨터가 저장한 숫자와 같을 경우 로또 "맞췄다." 다를 경우 "꽝 다음기회를" 이라는 문장을 출력하는 프로그램을 작성하세요  
//		랜덤 숫자 : Math.random() : 0.0 ~ 0.9까지 출력
//		 (int)(math.random() * 최대값) + 최소값
//		사용자 입력 : import java.util.Scanner;
//		Scanner sc = new Scanner(System.in);
//		sc.next(); 공백문자가 나올때까지의 문자를 입력받음
//		sc.nextInt() : 공백문자가 나올때까지 숫자를 입력받음
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 지정하세요 : ");
		int num = sc.nextInt();
		int lotto = (int)(Math.random() * 10) + 1;
		
		if (lotto == num) {
			System.out.println("로또 맞았다");
		}
		else 
			System.out.println(lotto + "꽝, 다음기회에..");
		}

	}
}

