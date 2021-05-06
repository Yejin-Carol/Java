import java.util.Scanner;

public class JavaExam2 {

	public static void main(String[] args) {
		//-------------------
		//윤년 구하는 프로그램 v1.0
		//-------------------
		//윤년을 구하는 년도 입력: 2020
		//출력결과: 2020년도는 윤년입니다.
		
		//1. 입력한 년도를 4로 나누면 나머지가 0이고, 
		//   100으로 나누면 0이 아님.
		//2. 입력한 년도를 400으로 나누면 나머지가 0. 
		//3. 1번 또는 2번 조건 만족시에 윤년이 구해짐.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구하려는 년도 입력: ");
		int year = sc.nextInt();

		if (year%4 == 0 && year%100 != 0) {
			System.out.printf("%d는 윤년입니다.", year);
		//System.out.println(year+"는 윤년입니다.");
		}
		//or if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) 
		
		
		else if (year%400 == 0) {
			System.out.printf("%d는 윤년입니다.", year);
			
		}
		
		else {
			System.out.println(year+"는 윤년이 아닙니다.");
			//System.out.printf("%d는 윤년이 아닙니다.", year);
		}
	
		sc.close(); 
	}

}
