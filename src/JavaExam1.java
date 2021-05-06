import java.util.Scanner;

public class JavaExam1 {

	public static void main(String[] args) {
		// --------------------------------
		// 간단한 계산기 프로그램 v1.0
		// --------------------------------
		//1. 숫자1 입력:
		//2. 숫자2 입력:
		//3. 연산자 입력(+,-,*,/):
		//출력 형태: 20 + 10 = 30
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력: ");
		int num2 = sc.nextInt();
		System.out.print(" 연산자 입력(+,-,*,/): ");
		String op = sc.next();
				
		if (op.equals("+")) {
			System.out.printf("더하기: %d + %d = %d\n", num1, num2, num1+num2);
		}
		else if (op.equals("-")) {
			System.out.printf("빼기: %d + %d = %d\n", num1, num2, num1-num2);
		}
		else if (op.equals("*")) {
			System.out.println("곱하기: " + num1 + "x" + num2 + "=" +(num1*num2));
		}
		else  {
			System.out.println("나누기: " + num1 + "÷" + num2 + "=" + (num1/num2));
		}
		sc.close();
		
		
	}

}
