import java.util.Random;

public class Array3 {

	public static void main(String[] args) {
		// 1~4 의 숫자를 랜덤으로 발생시켜 로또 프로그램 만들기.
		System.out.println("---------------------");
		System.out.println("간단한 로또 프로그램 v1.1");
		System.out.println("---------------------");
		System.out.println();
		int[] lotto = new int[6];
		Random r = new Random();// Random 클래스
		
		int i = 0;
		while (i < 6) {
			int n = r.nextInt(45) + 1; // 0~45까지만 출력! next 메서드
			for (int j = 0; j<i ; j++) {
				if (lotto[i] == n) {
					n = r.nextInt(45) + 1;
					i--;
				}
				else {
				lotto[i] = n;
			}
			System.out.print(lotto[i] + " ");
		}
	}
}
}