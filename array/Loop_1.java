import java.util.Random;
import java.util.Scanner;

public class Loop_1 {

	public static void main(String[] args) {
		// 숙제 확인

		// 2번 문제) 5의 배수
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("5의 배수: " + i);

			}
		}
			
		// 3번 문제) 로또 번호 생성
		// 1~4 의 숫자를 랜덤으로 발생시켜 로또 프로그램 만들기.
		System.out.println("---------------------");
		System.out.println("간단한 로또 프로그램 v1.0");
		System.out.println("---------------------");

		for (int i = 0; i < 6; i++) {
			Random r = new Random();// Random 클래스
			int lotto = r.nextInt(45) + 1; // 0~45까지만 출력! next 메서드
			System.out.printf("%d  ", lotto);
			
			// 중복 되므로 중복 빼는 처리는 배열 써야함 -> sorting 알고리즘
		}
		System.out.println();
		
		
		// 4번 문제
		int start = 0;
		int sum = 0;
		int end = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 첫번째 숫자 입력 => ");
		start = sc.nextInt();
		for (;;) { //(while (true)
			System.out.print("1. 두번째 숫자 입력 => ");
			end = sc.nextInt();
			if (start >= end) {
			System.out.println("두번째 숫자를 큰 수로 입력하세요.");
		}
			else {
				break;
			}
		}
		
		for (int i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
	}

}
