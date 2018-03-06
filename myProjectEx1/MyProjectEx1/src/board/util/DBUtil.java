package board.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil{
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String server = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String uid = "JAVA00";
	private static String upw = "JAVA00";
	
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("객체를 등록하는 중 오류 발생");
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(server, uid, upw);
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) throws SQLException{
			close(conn, pstmt);
			if(rs != null) rs.close();
	}
	public static void close(Connection conn, PreparedStatement pstmt) throws SQLException{
		if(conn != null) conn.close();
		if(pstmt != null) pstmt.close();
	}
	
	
	
}
