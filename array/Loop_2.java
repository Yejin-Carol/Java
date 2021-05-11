import java.util.Scanner;

public class Loop_2 {

	static final int MENU_FILE_WRITE = 1;
	static final int MENU_FILE_READ = 2;
	static final int MENU_FILE_MAIN_EXIT = 3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			// 문제 7번)
			// 무한루프를 사용하여 동작하는 프로그램
			// 조건1) 메뉴 선택을 잘못하면 "잘못된 입력입니다"를 출력하고
			// 다시 메뉴 선택하도록 처리.
			// 조건2) 메뉴를 선택하여 실행하더라도 메뉴는 항상 사용자에게 보여줘야 함.
			System.out.println("-----------------------");
			System.out.println("간단한 파일 관리 프로그램 v1.0");
			System.out.println("-----------------------");
			System.out.println("1. 파일 생성 및 쓰기");
			System.out.println("2. 파일 읽기");
			System.out.println("3. 종료");
			System.out.println("-----------------------");
			System.out.print("메뉴를 선택하세요: ");

			int menu = sc.nextInt();

			//hardtool
			switch (menu) {
			case MENU_FILE_WRITE:
				System.out.println("파일 생성 및 쓰기 실행됩니다.");
				break;
			case MENU_FILE_READ:
				System.out.println("파일 읽기 실행됩니다.");
				break;
			case MENU_FILE_MAIN_EXIT:
				System.out.println("프로그램이 종료됩니다.");
				sc.close();
				System.exit(0);
				break;
			}
		}

	}
}