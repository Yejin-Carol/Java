import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
	static final int MENU_FILE_WRITE = 1;
	static final int MENU_FILE_READ = 2;
	static final int MENU_FILE_MAIN_EXIT = 3;
	public static void main(String[] args) {
				
		//7. 다음 메뉴를 가지는 프로그램 작성하기
		//조건1) 1차원 배열 초기값
		//이름의 1번째 --> "김", "박", "이", "최", "장"
		//이름의 2번째 --> "바", "사", "아", "자", "차"
		//이름의 3번째 --> "가", "나", "다", "라", "마"
		String firstName[] = {"김", "박", "이", "최", "장"};
		String midName[] = {"바", "사", "아", "자", "차"};
		String lastName[] = {"가", "나", "다", "라", "마"};
		//조건2) 위의 값을 각각 랜덤하게 발생하도록 하여 50개의 풀네임을 생성하여 배열에 저장.
		Random r = new Random();
		String fullName[] = new String[50];
		Scanner sc = new Scanner(System.in);	
		while (true) {
			System.out.println("-----------------------");
			System.out.println("파일 제어 프로그램 v1.5");
			System.out.println("-----------------------");
			System.out.println("1.이름 생성하여 파일에 저장");
			System.out.println("2.파일에서 이름 읽어오기");
			System.out.println("3.프로그램 종료");
			System.out.println("-----------------------");
			System.out.print("메뉴를 선택하세요: ");
			int menu = sc.nextInt();
			switch (menu) {
			//조건3) 생성된 풀네임 50개를 파일에 저장.
			//조건4) 파일에 저장된 이름들을 읽어서 출력할때는 라인별로 출력 바람.
			case MENU_FILE_WRITE:
				try {
						FileOutputStream output
							= new FileOutputStream("testJava.txt");
						for (int i=0; i<50; i++) {
							fullName[i] = firstName[r.nextInt(5)] +  midName[r.nextInt(5)] + lastName[r.nextInt(5)];			
							System.out.println("번호" + (i+1) + ": " + fullName[i]);
							fullName[i] += "\n";
							output.write(fullName[i].getBytes());//write type 
						}
						output.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}				
				break;
			case MENU_FILE_READ:
					try  {
						BufferedReader br =
					new BufferedReader(
							new FileReader("testJava.txt"));
				while (true) {
						String line = br.readLine();
						if (line == null) break;
						System.out.println(line);
				}
					br.close();
				} catch (FileNotFoundException e) {
						e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
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



