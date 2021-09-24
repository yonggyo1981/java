package dbexam;

import java.sql.*;

public class Ex6 {
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length == 0) {
			System.out.println("����� Ȯ�� ���!");
			System.exit(0);
		}
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		
		String sql = "UPDATE Book SET bookname = ? WHERE bookid = ?";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, args[1]);
			pstmt.setInt(2, Integer.parseInt(args[0]));
			
			int rs = pstmt.executeUpdate();
			System.out.println("affected rows : " + rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
