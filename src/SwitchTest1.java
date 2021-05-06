import java.util.Random;

public class SwitchTest1 {

	public static void main(String[] args) {
		// 0~3 랜덤 숫자 발생
		//int time = (int)(Math.random()*4); //Math 클래스 안에 random 메서드 있음
		Random r = new Random();//Random 클래스 
//		int time = r.nextInt(4); //0~3까지만 출력! next 메서드
		int time = r.nextInt(4) + 8; //11까지 출력
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("출근");
			break;
		case 9: 
			System.out.println("회의 시작");
			break;
		case 10:
			System.out.println("업무 시간");
			break;
		default:
			System.out.println("외근중");
			break;
		}
		
	}

}
