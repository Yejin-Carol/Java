import java.util.Scanner;

public class Homework_switch2 {

	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("--------------------");
		
	Scanner sc = new Scanner(System.in);
	System.out.print("1. Num1 입력 => ");
	int num1 = sc.nextInt();
	System.out.print("2. Num2 입력 => ");
	int num2 = sc.nextInt();
	System.out.print("3. 연산자 입력 => ");
	String op = sc.next();
	
	switch(op) {
	
	case "+":
		System.out.println(num1 + " + " + num2 + "= " + (num1+num2));
	case "-":
		System.out.println(num1 + " - " + num2 + "= " + (num1-num2));
	case "X":
		System.out.println(num1 + " X " + num2 + "= " + (num1*num2));
	case "/":
		System.out.println(num1 + " / " + num2 + "= " + (num1/num2));
	
	}
	sc.close();
}

}
