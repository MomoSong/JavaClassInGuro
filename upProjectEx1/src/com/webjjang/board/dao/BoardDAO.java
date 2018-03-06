package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.dto.BoardDTO;
import com.webjjang.util.DBUtil;

public class BoardDAO {

	public List<BoardDTO> list() {
		System.out.println("BoardDAO.list()");
		//넘겨줄 데이터 객체를 선언만 한다.
		List<BoardDTO> list = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT no, title, writer, to_char(writedate, 'yyyy-mm-dd') writedate, "
						+ "	hit FROM "
						+ " board ORDER BY no DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(list == null) list = new ArrayList<>();
				BoardDTO boardDTO = new BoardDTO(rs.getInt("no"), rs.getString("title"), 
												rs.getString("writer"), rs.getString("writedate"), 
												rs.getInt("hit"));
				
				list.add(boardDTO);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil.close(conn, pstmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(list);
		return list;
	}

}
