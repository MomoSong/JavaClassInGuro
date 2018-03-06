package com.webjjang.view.board;

import java.util.List;

import com.webjjang.board.dto.BoardDTO;

public class BoardPrint {

	public void list(List<BoardDTO> list) {

		System.out.println("BoardPrint.list()");
		//제목 출력
		System.out.println("\n\n *** 게시판 리스트 ***");
		System.out.println("-------------------------------------");
		System.out.println(" 번호       제목        작성자       작성일        조회수");
		System.out.println("-------------------------------------");
		//데이터 출력
		for(BoardDTO boardDTO : list)
			System.out.println(boardDTO.getNo() + "    "
							+ boardDTO.getTitle() + "    "
							+ boardDTO.getWriter() + "    "
							+ boardDTO.getWritedate() + "    "
							+ boardDTO.getHit() + "    " );
		System.out.println("-------------------------------------");
		
	}

}
