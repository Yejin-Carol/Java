
public class Array1 {

	public static void main(String[] args) {
		// 문제 2번
		int[] arr = new int[100]; // 0~99

		// 배열은 초기값 0이 좋음. 인덱스!
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
			// 조건 1) 5의 배수 출력
			if (arr[i] % 5 == 0) {
				System.out.println(arr[i] + " ");
			}
			// 조건2) 배열의 위치가 90번째 일때 출력을 중지함.
			if (i == 89) {
				break;
			}

		}
		
		// 문제 4번 아래의 이차원 배열을 출력하세요.
		// 조건1) 배열 초기값 -> {{1,2}, {2,4,6}, {3,6}, {4,8,10,12},{10}}
		// 조건2) 반드시 아래와 같은 형태로 출력 바람. (2중 루프 사용해도됨)
		// arr[0][0] = 1 arr[0][1] = 2

		int[][] arr2 = { { 1, 2 }, { 2, 4, 6 }, { 3, 6 }, { 4, 8, 10, 12 }, { 10 } };// 형태가 일정하지 않은 2차원 배열

		for (int a = 0; a < arr2.length; a++) {
			for (int b = 0; b < arr2[a].length; b++) {
				System.out.print("arr[" + a + "]" + "[" + b + "] = " + arr2[a][b] + " ");
			}
			System.out.println();
		}
		
		//6번 문제
		int arrGugu[][] = new int[9][8];
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				arrGugu[i-1][j-2] = j * i;
				System.out.printf("%d X %d = %d\t", j, i, arrGugu[i-1][j-2]);
			}
			System.out.println();		
		}

	}
}