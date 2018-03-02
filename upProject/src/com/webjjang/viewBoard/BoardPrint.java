package com.webjjang.viewBoard;

import java.util.List;

import com.webjjang.dto.BoardDTO;



public class BoardPrint {
	public void list(List<BoardDTO> list) {
		System.out.println("BoardPrint.list()");
		System.out.println("**게시판 리스트**");
		try {
			for(BoardDTO boardDTO : list) {
				System.out.println(boardDTO);
			}			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("데이터가 존재하지 않습니다.");
		}
	}
	
	public void view(BoardDTO boardDTO) {
		System.out.println("BoardPrint.view()");
		System.out.println("** 게시판 글보기 **");
		try {
			System.out.println(boardDTO.toString());
		}catch(Exception e) {
			System.out.println("데이터가 존재하지 않습니다.");
		}
	}
}
