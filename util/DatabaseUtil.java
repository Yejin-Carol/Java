package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() {
		// �����ͺ��̽��� ������� ����
		try {
			//String dbURL = "jdbc:mysql://localhost:3306/TUTORIAL?useSSL=false&serverTimezone=UTC";
			String dbURL = "jdbc:mysql://localhost:3306/TUTORIAL??useUnicode=true&characterEncoding=utf-8serverTimezone=UTC";

			String dbID = "root";
			String dbPassword = "0430"; //1234
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			System.out.println("AAAAAAAAAAA");
			e.printStackTrace();
		}
		return null;
	}
}

//��ó:https:// icandooit.tistory.com/104 [i can do "IT"]