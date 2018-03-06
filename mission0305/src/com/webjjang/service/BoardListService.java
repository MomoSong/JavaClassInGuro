package com.webjjang.service;

import java.util.List;

import com.webjjang.dao.BoardDAO;
import com.webjjang.dto.BoardDTO;

public class BoardListService {

	public List<BoardDTO> process() {
		List<BoardDTO> list;
		
		BoardDAO boardDAO = new BoardDAO();
		list = boardDAO.list();
		
		return list;
		
	}

}
