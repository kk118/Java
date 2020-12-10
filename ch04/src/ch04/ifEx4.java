package ch04;

public class ifEx4 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random() * 20) + 81;
//		Math.random() : 자바 수학 관련 클래스에서 0.0 ~ 1.0미만의 임의의 숫자를 반환하는 메서드
//		Math.random() * 20 은 0 ~ 20까지의 임의의 숫자 출력
		System.out.println(score);
		
		String grade;
		
		if (score >= 90) {
			if (score > 95) {
				grade = "A+";
			}
			else {
			grade = "A";
		}
		}
		else {
			if (score > 85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		
		System.out.println("당신의 학점은 " + score + "이고, 등급은 " + grade);

	}

}
