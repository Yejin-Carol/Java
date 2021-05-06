import java.util.Scanner;

public class Homework_if2 {

	public static void main(String[] args) {
	//3. 2개의 숫자를 입력 받아서 +,-,X,/ 연산자를 사용하는 간단한 계산기. 
		System.out.println("--------------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Num1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("Num2 입력: ");
		int num2 = sc.nextInt();
		System.out.print(" 연산자 입력(+,-,X,/): ");
		String op = sc.next();
				
		if (op.equals("+")) {
			System.out.printf("더하기: %d + %d = %d\n", num1, num2, num1+num2);
		}
		else if (op.equals("-")) {
			System.out.printf("빼기: %d + %d = %d\n", num1, num2, num1-num2);
		}
		else if (op.equals("X")) {
			System.out.println("곱하기: " + num1 + "x" + num2 + "=" +(num1*num2));
		}
		else  {
			System.out.println("나누기: " + num1 + "÷" + num2 + "=" + (num1/num2));
		}
		sc.close();
		
}
}
