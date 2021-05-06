import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		//1. 1개의 숫자를 입력 받아서 짝수, 홀수인지 판단하는 프로그램. 
		System.out.println("-------------------");
		System.out.println("홀짝 판단 프로그램 v1.0");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 => ");
		int num = sc.nextInt();
		
		
		if (num%2 != 0) {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		else {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
			
		
		//2. 2개의 숫자를 입력 받아서 크다, 작다를 비교하는 프로그램
		System.out.println("-------------------");
		System.out.println("대소 비교 프로그램 v1.0");
		System.out.println("-------------------");
		
		System.out.print("num1 입력 => ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 => ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "이 " + num2 + "보다 크다");
		}
		else if (num1 < num2) {
				System.out.println(num2 + "가 "+ num1 + "보다 작다");
		}
		else {
				System.out.println(num1 + "과 " + num2 + "는 같다.");
		}

	
		
		
		sc.close();	
		}


}
