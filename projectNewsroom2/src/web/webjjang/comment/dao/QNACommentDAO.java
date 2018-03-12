package web.webjjang.comment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.webjjang.comment.dto.QNACommentDTO;
import com.webjjang.util.DBUtil;

public class QNACommentDAO {

	// 댓글을 보여주는 메서드를 작성한다.
	public QNACommentDTO view(int no) {
//		System.out.println("QNACommentDAO.view()");
		
		QNACommentDTO qnaCommentDTO = null;
		// RDBMS에서 데이터를 가져오는 프로그램을 작성한다.
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
				
		// 댓글을 보여주는 메서드를 작성한다.
		try {
			// 드라이버 확인 및 연결
			con = DBUtil.getConnection();
			// 처리할 명령과 관련된 sql을 작성한다.
			String sql = "select no, content, writer, writedate"
					+ "  from QNAComment where qno = ? ";
			// 처리문 객체를 작성한다.
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			// 실행한다.
			rs = pstmt.executeQuery();
			// 결과 출력 (rs에서 꺼내어 DTO에 담는다)
			if(rs.next()) {
				qnaCommentDTO = new QNACommentDTO
						(rs.getInt("no"),
						rs.getString("content"),
						rs.getString("writer"),
						rs.getString("writedate"));
					
			}
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	return qnaCommentDTO;	
	}
	
	// 댓글을 작성하는 메서드를 작성한다.
	public void write(QNACommentDTO qnaCommentDTO) {
//		System.out.println("QNACommentDAO.write()");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 연결 하기
			con = DBUtil.getConnection();
			// SQL 작성하기
			String sql = "insert into QNAComment(no, content, writer)"
					+ "  values(QNACommnet_seq.nextval, ? , ? ";
			// 처리문 객체를 작성한다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, qnaCommentDTO.getContent());
			pstmt.setString(2, qnaCommentDTO.getWriter());
			// 처리 수행
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	// 댓글을 수정하는 메서드를 작성한다.
	public void update(String content, String writer, int no) {
//		System.out.println("QNACommentDAO.update()");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 연결하기
			con = DBUtil.getConnection();
			// sql 작성하기
			String sql = "update QNAComment"
					+ "  set content = ? , writer = ? where no = ?";
			// 처리문 객체를 작성한다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, content);
			pstmt.setString(2, writer);
			pstmt.setInt(3, no);
			// 처리 및 실행
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int no) {
//		System.out.println("QNAComment.delete()");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 연결
			con = DBUtil.getConnection();
			// sql 작성
			String sql = "delete from QNAComment where no = ? ";
			// 처리문 작성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			// 처리 완료
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
