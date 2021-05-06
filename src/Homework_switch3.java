import java.util.Scanner;

public class Homework_switch3 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("담배 자판기 프로그램 v1.0");
		System.out.println("-------------------");
		System.out.println("원하는 음료수를 메뉴에서 선택하세요.");
		
		System.out.println("1. 에쎄 골든 리프		6,000원");
		System.out.println("2. 에쎄 스페셜 골드		5,000원");
		System.out.println("3. 더원 블루 		4,500원");
		System.out.println("4. 더원 오렌지 		4,500원");
		System.out.println("5. 더원 화이트 		4,500원");
		System.out.println("-------------------");
		System.out.print("담배를 선택하세요 => ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		int cig1 = 6000;
		int cig2 = 5000;
		int cig3 = 4500;
		int cig4 = 4500;
		int cig5 = 4500;
		
	
		switch (menu) {
		case 1:
			System.out.println("에쎄 골든 리프를 선택하였습니다.");
			System.out.println("------------------------");
			System.out.print("담배 금액을 투입하세요: ");
			int input1 = sc.nextInt();
			System.out.println("에쎄 골든 리프를 구매했습니다.");
			System.out.printf("거스름돈 %d원을 받으세요.\n", (input1-cig1));
			break;
			
		case 2:
			System.out.println("에쎄 골든 리프를 선택하였습니다.");
			System.out.println("------------------------");
			System.out.print("담배 금액을 투입하세요: ");
			int input2 = sc.nextInt();
			System.out.println("에쎄 골든 리프를 구매했습니다.");
			System.out.printf("거스름돈 %d원을 받으세요./n", (input2-cig2));	
			break;
		
		case 3:
			System.out.println("에쎄 골든 리프를 선택하였습니다.");
			System.out.println("------------------------");
			System.out.print("담배 금액을 투입하세요: ");
			int input3 = sc.nextInt();
			System.out.println("에쎄 골든 리프를 구매했습니다.");
			System.out.printf("거스름돈 %d원을 받으세요./n", (input3-cig3));	
			break;
			
		case 4:
			System.out.println("에쎄 골든 리프를 선택하였습니다.");
			System.out.println("------------------------");
			System.out.print("담배 금액을 투입하세요: ");
			int input4 = sc.nextInt();
			System.out.println("에쎄 골든 리프를 구매했습니다.");
			System.out.printf("거스름돈 %d원을 받으세요./n", (input4-cig4));		
			break;
			
		case 5:
			System.out.println("에쎄 골든 리프를 선택하였습니다.");
			System.out.println("------------------------");
			System.out.print("담배 금액을 투입하세요: ");
			int input5 = sc.nextInt();
			System.out.println("에쎄 골든 리프를 구매했습니다.");
			System.out.printf("거스름돈 %d원을 받으세요./n", (input5-cig5));		
			break;
			
		}
			System.out.println("-------------------");
	}

}
