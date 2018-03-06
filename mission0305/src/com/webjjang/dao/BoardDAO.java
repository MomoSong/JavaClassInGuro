package com.webjjang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.webjjang.dto.BoardDTO;
import com.webjjang.util.DBUtil;

public class BoardDAO {
	List<BoardDTO> list;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public List<BoardDTO> list() {
		
		try {
			con = DBUtil.getConnection();
			String sql = "SELECT no, title, writer, to_char(writedate, 'yyyy-mm-dd') writedate, hit FROM "
					     +" board ORDER BY no DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(list == null) list = new ArrayList<>();
			while(rs.next()) {
				list.add(new BoardDTO(rs.getInt("no"), rs.getString("title"),
									rs.getString("writer"), rs.getString("writedate"),
									rs.getInt("hit")));
			}			
		} catch (Exception e) {
			System.out.println("객체를 가져오는 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				DBUtil.close(con, pstmt, rs);
			} catch (SQLException e) {
				System.out.println("객체를 닫는 중 오류 발생");
				e.printStackTrace();
			}
		}
		
		
		return list;
	}

}
