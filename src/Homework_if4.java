import java.util.Scanner;

public class Homework_if4 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("년도별 윤년 구분 프로그램 v1.0");
		System.out.println("-----------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구하려는 년도 입력: ");
		int year = sc.nextInt();

		if ((year%4 == 0 && year%100 != 0) || (year%400==0)) {
			System.out.println(year+"는 윤년입니다.");
		}
		
		else {
			System.out.println(year+"는 윤년이 아닙니다.");
			//System.out.printf("%d는 윤년이 아닙니다.", year);
		}
	
		sc.close(); 
	}

}
