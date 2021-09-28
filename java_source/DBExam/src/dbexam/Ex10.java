package dbexam;

import java.sql.*;

public class Ex10 {
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length != 4) {
			System.err.println("���� Ȯ�� ���!");
			System.exit(1);
		}
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		// Statement, PreparedStatement, CallableStatement
		/**
		 * ResultSet executeQuery() - SELECT -> ������ ��ȸ -> �����Ͱ� ������ ��
		 * 			ResultSet -> next() -> ���� ������ ������ true ��ȯ -> ���� ���÷� �̵�
		 * 							-> getXxx(���� - �Ӽ��� ����(1���� ����));
		 *  					    -> getXxx("�÷���");
		 *  
		 * int executeUpdate() - INSERT, UPDATE, DELETE
		 * 					�ݿ��� ������ ����  
		 */
		String sql = "CALL InsertBook2(?, ?, ?, ?)";
		String sql2 = "SELECT * FROM Book";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				CallableStatement cstmt = conn.prepareCall(sql);
				PreparedStatement pstmt = conn.prepareStatement(sql2)) {
			
			cstmt.setInt(1, Integer.parseInt(args[0]));
			cstmt.setString(2, args[1]);
			cstmt.setString(3, args[2]);
			cstmt.setInt(4, Integer.parseInt(args[3]));
			int rs = cstmt.executeUpdate();
			System.out.println("affected rows : " + rs);
			
			ResultSet rs2 = pstmt.executeQuery();
			// next() -> ���� ������ ������ true -> ���� ���÷� �̵�
			while(rs2.next()) {
				int bookid = rs2.getInt("bookid");
				String bookname = rs2.getString("bookname");
				String publisher = rs2.getString("publisher");
				int price = rs2.getInt("price");
				
				System.out.println("bookid = " + bookid + ", bookname = " + bookname + ", publisher = " + publisher + ", price = " + price);
			}
			
			rs2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
