
public class Method3 {

	public static void main(String[] args) {
		// 타입 메쏘드 이름()
		System.out.println("나이: " + getAge());
		System.out.println("이름: " + getName());
//		getAge();
//		getName();
	}
	
	public static int getAge() {
		int age = 100;
		return age;
	}
	
	public static String getName() {
		String name = "홍길동";
		return name;//매소드 안에 사용되는 지역변수들은 메인메소드 종료되면서 소멸
	}
//	
//	public static int getAge(int age) {
//		return age + 100;
//	}
	
	public static String getName(String lastName) {
		return lastName + "길동";
	}
	
	public static int getAge(int age) {
		return age + 100;
	}
	
}
