package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.util.DBUtil;
import dto.BoardDTO;

public class NadoNewsBoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	private BoardDTO boardDTO;
	private List<BoardDTO> list;

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}

	public List<BoardDTO> list() {

		setSql("SELECT no, title, writer, writedate, hit " + " FROM board ORDER BY no ASC");

		try {
			conn = board.util.DBUtil.getConnection();
			pstmt = conn.prepareStatement(getSql());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				if (list == null) {
					list = new ArrayList<>();
				}
				boardDTO = new BoardDTO(rs.getInt("no"), rs.getString("title"), rs.getString("writer"),
						rs.getString("writedate"), rs.getInt("hit"));

				list.add(boardDTO);
			}

		} catch (Exception e) {
			System.out.println("데이터를 가져오는 중 오류가 발생했습니다.");
			e.printStackTrace();
		} finally {
			try {
				DBUtil.close(conn, pstmt, rs);
			} catch (Exception e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}

		return list;
	}

	public BoardDTO view(int no) {
		try {
			conn = DBUtil.getConnection();
			setSql("SELECT no, title, content, writer, writedate, hit FROM board WHERE no = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				boardDTO = new BoardDTO(rs.getInt("no"), rs.getString("title"), rs.getString("content"),
						rs.getString("writer"), rs.getString("writedate"), rs.getInt("hit"));
			}

		} catch (Exception e) {
			System.out.println("데이터를 가져오는 중 오류가 발생했습니다.");
		} finally {
			try {
				DBUtil.close(conn, pstmt);
			} catch (SQLException e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}

		return boardDTO;
	}

	public void increase(int no) {
		try {
			conn = DBUtil.getConnection();
			setSql("UPDATE board set hit = hit + 1 where no = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("조회수를 업데이트 하는 중 오류가 발생했습니다.");
		} finally {
			try {
				DBUtil.close(conn, pstmt);
			} catch (Exception e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
			}
		}
	}
	
	public void write(String title, String content, String writer){
		try{
			conn = DBUtil.getConnection();
			setSql("INSERT INTO board(no, title, content, writer, writedate) "
					+" VALUES(board_seq.nextval, ?, ?, ?, SYSDATE)");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("기사를 쓰는 중 오류가 발생했습니다.");
		} finally {
			try {
				DBUtil.close(conn, pstmt);
			} catch (SQLException e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}
	}
	
	public void update(String title, String content, String writer, int no){
		try{
			conn = DBUtil.getConnection();
			setSql("UPDATE board SET title = ?, content = ?, writer = ? WHERE no = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			pstmt.setInt(4, no);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("데이터를 수정하는 중 오류가 발생했습니다.");
			e.printStackTrace();
		} finally {
			try{
				DBUtil.close(conn, pstmt);
			} catch (Exception e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}
		
	}
	
	public void delete(int no){
		try{
			conn = DBUtil.getConnection();
			setSql("DELETE FROM board WHERE no = ?");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("데이터를 지우는 중 오류가 발생했습니다.");
			e.printStackTrace();
		} finally {
			try {
				DBUtil.close(conn, pstmt);
			} catch (SQLException e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}
	}

}
