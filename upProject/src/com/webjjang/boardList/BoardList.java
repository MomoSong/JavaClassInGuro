package com.webjjang.boardList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.dto.BoardDTO;
import com.webjjang.util.DBUtil;

public class BoardList {

	// 오라클에 접속할 때 필요한 정보들
	// 드라이버는 오라클사에서 제공한다 -> 찾아서 인식시켜야한다 : ojbdc6.jar

	// 글리스트를 가져오는 메서드
	public List<BoardDTO> list() {
		System.out.println("BoardDAO.list");
		List<BoardDTO> list = null;
		// RDBMS에서 데이터를 가져오는 프로그램 작성 할것

		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		ResultSet rs = null; // 결과

		try {
			// 1. 드라이버확인

			// 2. 연결
			con = DBUtil.getConnection();

			// 3. sql
			String sql = "SELECT no, title, writer, writedate," + " hit FROM board ORDER BY no DESC";

			// 4. 처리문 객체
			pstmt = con.prepareStatement(sql);

			// 5. 실행
			rs = pstmt.executeQuery();

			// 6. 표시 -> 데이터 담기
			while (rs.next()) {
				// 데이터가 있는데 list가 null이면 생성해서 담는다
				if (list == null) {
					list = new ArrayList<>();
				}
				// 데이터 하나를 담을 수 있는 BoardDTO 객체를 생성한다.
				BoardDTO boardDTO = new BoardDTO();
				// 데이터를 rs에서 꺼내서 BoardDTO에 담는다.
				boardDTO.setNo(rs.getInt("no"));
				boardDTO.setTitle(rs.getString("title"));
				boardDTO.setWriter(rs.getString("writer"));
				boardDTO.setWriteDate(rs.getString("writedate"));
				boardDTO.setHit(rs.getInt("hit"));

				// list에 boardDTO를 담는다.
				list.add(boardDTO);
			}

		} catch (Exception e) {
			System.out.println("객체를 가져오는 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				// 7. 객체 닫기
				DBUtil.close(con, pstmt, rs);

			} catch (Exception e) {
				System.out.println("객체를 닫는 중 오류 발생");
				e.printStackTrace();
			}
		}

		return list;
	}

	// 글번호에 맞는 글보기 데이터를 가져오는 메서드
	public BoardDTO view(int no) {
		System.out.println("BoardDAO.view() - " + no);
		BoardDTO boardDTO = null;

		// 오라클에서 데이터를 가져와서 채우는 프로그램 작성 할것

		return boardDTO;
	}
}
