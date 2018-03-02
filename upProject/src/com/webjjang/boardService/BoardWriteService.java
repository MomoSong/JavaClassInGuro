package com.webjjang.boardService;

import com.webjjang.boardDao.BoardDAO;
import com.webjjang.dto.BoardDTO;


public class BoardWriteService {
	public void process(BoardDTO boardDTO){		
		//list에 데이터를 가져와서 채우는 프로그램 작성
		//객체를 생성하고 호출한다.
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.write(boardDTO);

	}
}
