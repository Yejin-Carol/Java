import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		//-----------------------------
		//음료수자판기 프로그램 v1.0
		//-----------------------------
		//원하는 담배를 메뉴에서 선택하세요.
		//1. 칠성사이다: 1,200원
		//2. 코카콜라: 1,300원
		//3. 판타 포도맛: 1,500원
		//4. 판타 오렌지: 1,500원 
		//5. 밀키스: 1,200원
		//-----------------------------
		//음료수를 선택하세요: 5
		//밀키스를 선택하였습니다.
		//-----------------------------
		//해당 금액을 투입하세요: 10000
		//밀키스를 구메하엿습니다.
		//거스름돈 8800원을 받으세요.
	
		
		String bev1 = "칠성사이다";
		String bev2 = "코카콜라";
		String bev3 = "판타 포도맛";
		String bev4 = "판타 오렌지";
		String bev5 = "밀키스";
		int price1 = 1200;
		int price2 = 1300;
		int price3 = 1500;
		int price4 = 1500;
		int price5 = 1200;
		
		
		System.out.println("------------------------");
		System.out.println("음료수자판기 프로그램 v1.0");
		System.out.println("------------------------");
		System.out.println("원하는 담배를 메뉴에서 선택하세요.");
		System.out.println("1." + bev1 + ": 1,200원");
		System.out.println("2." + bev2+ ": 1,300원");		
		System.out.println("3." + bev3 + ": 1,500원");
		System.out.println("4." + bev4 + ": 1,500원");
		System.out.println("5." + bev5 + ": 1,200원");
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("음료수를 선택하세요: ");
		
		int menu  = sc.nextInt(); //String menu = sc.nextLine();
		
		switch (menu) {
			case 1:
				System.out.println(bev1 + "를 " + "선택하였습니다.");
				System.out.println("------------------------");
				System.out.print("음료수 금액을 투입하세요: ");
				int input1 = sc.nextInt();
				System.out.println(bev1 + "를 " + "구매했습니다.");
				System.out.printf("거스름돈 %d원을 받으세요.", (input1-price1));
				
				break;
			case 2: 
				System.out.println(bev2 + "를 " + "선택하였습니다.");
				System.out.print("음료수 금액을 투입하세요: ");
				int input2 = sc.nextInt();
				System.out.println(bev2 + "를 " + "구매했습니다.");
				System.out.printf("거스름돈 %d원을 받으세요.", (input2-price2));
				break;
			case 3:
				System.out.println(bev3 + "을 " + "선택하였습니다.");
				System.out.print("음료수 금액을 투입하세요: ");
				int input3 = sc.nextInt();
				System.out.println(bev3 + "를 " + "구매했습니다.");
				System.out.printf("거스름돈 %d원을 받으세요.", (input3-price3));
				break;
			case 4:
				System.out.println(bev4 + "를 " + "선택하였습니다.");
				System.out.print("음료수 금액을 투입하세요: ");
				int input4 = sc.nextInt();
				System.out.println(bev4 + "를 " + "구매했습니다.");
				System.out.printf("거스름돈 %d원을 받으세요.", (input4-price4));
				break;
			case 5:
				System.out.println(bev5 + "를" + "선택하였습니다.");
				System.out.print("음료수 금액을 투입하세요: ");
				int input5 = sc.nextInt();
				System.out.println(bev5 + "를 " + "구매했습니다.");
				System.out.printf("거스름돈 %d원을 받으세요.", (input5-price5));
				break;
		}

				
		sc.close();
	}

}



