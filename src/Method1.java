
public class Method1 {

	public static void main(String[] args) {
	
		//메소드 반드시 호출(사용) 해야함! 
		method1();
		showName();
		showAge();
	}
	
	//메소드의 정의
	// main 메소드 밖에 있어야함. 하지만 클래스 안에 존재해야함!
	public static void method1() {
		for (int i = 0; i < 5; i++) {
		System.out.println("method1() 호출");
		}
		showName();
		showName("김길동", 200);
	}
	
	//카멜 방식, C# ShowName 파스탈, show_name 
	public static void showName() {
		String name = "홍길동";//지역변수
		System.out.println(name);
	}

	public static void showAge() {
		System.out.println("100");
	}

	//객체 지향의 특징: 오버로딩(중복 정의) 
	//조건 1) 매개변수 타입 다름
    //조건 2) 매개변수 개수 다름.
	public static void showName(String name)
	// 위에 매개변수 없고, 여기에는 1개 있음. 조건 2) 만족! 
	{
		System.out.println(name);
	}
	
	public static void showName(String name, int age) {
		System.out.println("이름:" + name + "나이: " + age);
	}
	
	public static void showName (int age) {
		System.out.println("이름:전우치" + ", 나이: " + age);
	}
	
	}
