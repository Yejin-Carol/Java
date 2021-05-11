import java.util.Random;

public class Method_Exercise1 {

	public static void main(String[] args) {
		// 홀수, 짝수 구분하는 프로그램
		// 조건1) 10개의 숫자를 저장하기 위한 배열 생성
		// 조건2) 랜덤하게 10개의 숫자를 main()에서 배열에 저장.
		// 조건3) 랜덤한 값을 가지는 배열을 매개변수로 전달하여 홀, 짝수를 구분하는 메쏘드 작성. -> void TYPE
		int arr[] = new int[10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;// 0~99사이 (범위)
//			System.out.print(arr[i] + " ");
		}
		checkOddEven(arr);
		
		System.out.println("-------------------------");

		String strArr[] = getOddEven(arr);// 주소값 전달(포인트개념), 결합도가 낮고 응집도가 높다.
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(arr[i] + ":" + strArr[i]);
		}
	}

	public static void checkOddEven(int arr[]) {

		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + ": 짝수입니다.");
			} else {
				System.out.println(arr[i] + ": 홀수입니다.");
			}
	}
	// 매개 변수와 리턴값 사용
	public static String[] getOddEven(int arr[]) {
		String strArr[] = new String[10];
 		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				strArr[i] = "짝수";
			} 
			else {
				strArr[i] = "홀수";;
			}
	}
	return strArr;
}

}
