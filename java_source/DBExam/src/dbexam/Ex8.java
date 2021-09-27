package dbexam;

import java.sql.*;

public class Ex8 {
	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 *  1. Class.forName("mysql ����̹� - ��Ű��.Ŭ�����̸�")
		 *  2. DB ���� DriverManager - getConnection -> Connection 
		 *  3. SQL ���� - ������ ���� �ν��Ͻ�
		 *  	(Statement - Connection  - createStatement(), 
		 *      PreparedStatement - Connection - prepareStament(String sql)
		 *      CallableStatement - Connection.prepareCall(String sql) 
		 */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		
		String sql = "CALL InsertBook(?, ?, ?, ?)";
		try (Connection conn = DriverManager.getConnection(url, user, password);
			CallableStatement cstmt = conn.prepareCall(sql)) {
			cstmt.setInt(1, Integer.parseInt(args[0]));
			cstmt.setString(2, args[1]);
			cstmt.setString(3, args[2]);
			cstmt.setInt(4, Integer.parseInt(args[3]));
			int rs = cstmt.executeUpdate();
			System.out.println("affected rows : " + rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
