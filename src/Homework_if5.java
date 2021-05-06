import java.util.Scanner;

public class Homework_if5 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력 받아서 합과 평균을 구하여 학점을 출력하는 프로그램.
		System.out.println("-------------------");
		System.out.println("학점 관리 프로그램 v1.0");
		System.out.println("100 ~ 90 : A학점");
		System.out.println("89 ~ 80 : B학점");
		System.out.println("79 ~ 70 : C학점");
		System.out.println("69 ~ 60 : D학점");
		System.out.println("59 ~ 50 : E학점");
		System.out.println("49 ~ 0 : F학점");
		System.out.println("-------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int Korean = sc.nextInt();
		System.out.print("영어 점수 입력 =>  ");
		int English = sc.nextInt();
		System.out.print("수학 점수 => ");
		int Math = sc.nextInt();
		
		int sum = Korean+English+Math;
		int avr = sum/3;
		
		System.out.println("총점 " + sum);
		System.out.println("평균 " + avr);
		if (avr >= 90 && avr <= 100) { 
			System.out.println("학점은 A입니다.");
		}
		else if(avr >= 80 && avr <= 89) {
			System.out.println("학점은 A입니다.");
		}
		else if(avr >= 70 && avr <= 79) {
			System.out.println("학점은 B입니다.");
		}
		else if(avr >= 60 && avr <= 69) {
			System.out.println("학점은 C입니다.");
		}
		else if(avr >= 50 && avr <= 59) {
			System.out.println("학점은 D입니다.");
		}
		else if(avr >= 40 && avr <= 49) {
			System.out.println("학점은 E입니다.");
		}
		else {
			System.out.println("학점은 F입니다.");
	    }
		
		sc.close();
		
	}

}
