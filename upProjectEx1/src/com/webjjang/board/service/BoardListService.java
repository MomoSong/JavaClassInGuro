package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.dto.BoardDTO;

public class BoardListService {

	public List<BoardDTO> process() {
		//controller -> service -> dao
		System.out.println("BoardListService.process()");
		//전달할 객체를 선언한다.
		List<BoardDTO> list = null;
		//데이터를 DB에서 가져와서 채우기 위해 객체 생성 - 메서드 호출
		BoardDAO boardDAO = new BoardDAO();
		list = boardDAO.list();
		return list;
	}

}
