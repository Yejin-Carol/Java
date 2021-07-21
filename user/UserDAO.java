package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DatabaseUtil;

public class UserDAO {
	Connection conn = DatabaseUtil.getConnection();

	public int join(String userID, String userPassword) {
		String SQL = "INSERT INTO USER VALUES (?,?)";
		try {
// ������ �����͸� ������ �־��ش�. 
			PreparedStatement pstmt = conn.prepareStatement(SQL);
// �������� ?�ȿ� ������ �����͸� �־��ش�. 
			pstmt.setString(1, userID);
			pstmt.setString(2, userPassword);
// ��ɾ ������ ��� ��ȯ, ��ȯ��: insert�� �� �������� ���� 
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("BBBBBBBBBBBB");
			e.printStackTrace();
		}
		return -1;
	}
}

//��ó: https://icandooit.tistory.com/104 [i can do "IT"]