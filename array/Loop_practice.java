import java.util.Scanner;

public class Loop_practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Num1 입력 => ");
		int num1 = sc.nextInt();

		for (int i = 0; i < 100; i++) {
			System.out.print("2. Num2 입력 => ");
			int num2 = sc.nextInt();

			if (num2 <= num1)
				continue;
			else {
				int j = num1;
				int sum = 0;
				while (j <= num2) {
					sum += j;
					j++;
				}
				System.out.printf("%d ~ %d 까지의 합: %d", num1, num2, sum);
				break;
			}
		}
		sc.close();
		
	}
}
