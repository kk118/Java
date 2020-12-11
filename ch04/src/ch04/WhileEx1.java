package ch04;
import java.util.Scanner;
public class WhileEx1 {

	public static void main(String[] args) {
		
//		P.109 예제 및 입력한 단수의 구구단 출력하기
		System.out.println("---p.109 예제---");
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
			
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		
		
		
		System.out.println("---사용자 입력 구구단---");
		Scanner sc = new Scanner(System.in);
//		int num = 1;
		int count = 0;
		System.out.println("단수를 입력하세요 : ");
		int dan = sc.nextInt();
		while(count < 9) {
//			num++;
			count++;
			System.out.println(dan + " X " + count + " = " + (dan * count));
		}
		sc.close();

	}

}
