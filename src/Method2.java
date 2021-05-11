import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 항 입력: ");
		int num1 = s.nextInt();
		System.out.print("두번째 항 입력: ");
		int num2 = s.nextInt();
		System.out.print("연산자 입력(+,-,*,/): ");
		String op = s.next();//nextLine 하면 안됨!
		calcu(num1, num2, op);//매개변수 순서 맞춰서, 
		calcu(100, 200, op);
	}
	//간단한 사칙연산 계산기
	public static void calcu(int num1, int num2, String op)//지역변수 main있는 int num1, num2와 다른 것 (다른 메모리 사용)
	{
//		switch (op) {
//		case "+":
//			System.out.println(num1 + num2); 
//			break;
//		case "-":
//			System.out.println(num1 - num2); 
//			break;
//		case "*":
//			System.out.println(num1 * num2); 
//			break;
//		case "/":
//			System.out.println(num1 / num2); 
//			break;
		
//		}
		if (op.equals("+")) 
		{ 
			System.out.println("더하기: " + (num1 + num2)); 
		}
		else if (op.equals("-")) 
		{
			System.out.println("빼기: " + (num1 - num2)); 
		}
		else if (op.equals("*"))
		{
			System.out.println("곱하기: " + (num1 * num2)); 
		}
		else if (op.equals("/"))
		{
			System.out.println("나누기: " + (num1 / num2)); 
		}			
	}

}

