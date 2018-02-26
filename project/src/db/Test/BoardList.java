package db.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.BoardDTO;

public class BoardList {

	public static void main(String[] args) {

		// 오라클에 접속할 때 필요한 정보들
		String driver = "oracle.jdbc.driver.OracleDriver"; // 오라클사에서 제공

		// server 정보
		String server = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "JAVA00";
		String upw = "JAVA00";

		// 필요한 객체를 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//1. 드라이버 확인
			Class.forName(driver);
			
			//2. 연결
			con = DriverManager.getConnection(server, uid, upw);
			
			//3. sql작성
			String sql = "SELECT no, title, writer, writedate,"
						+ " hit FROM board ORDER BY no DESC";
			
			//4. 처리 객체
			pstmt = con.prepareStatement(sql);
			
			//5. 실행
			rs = pstmt.executeQuery();
			//6. 표시
			if(rs == null) {
				System.out.println("데이터 없음");
			} else {
				while(rs.next()) {
					//게시판의 데이터를 담는 객체 생성
					BoardDTO boardDTO = new BoardDTO();
					//게시판 데이터 담기
					boardDTO.setNo(rs.getInt("no"));
					boardDTO.setTitle(rs.getString("title"));
					boardDTO.setWriter(rs.getString("writer"));
					boardDTO.setWriteDate(rs.getString("writedate"));
					boardDTO.setHit(rs.getInt("hit"));
					System.out.println(boardDTO);
				}				
			}
			
		} catch (Exception e) {
			System.out.println("데이터를 가져오는 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				//7. 닫기
			} catch(Exception e) {
				System.out.println("객체 닫기 실패");
			}
		}

	}

}
