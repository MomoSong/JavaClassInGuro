package com.webjjang.controller;

import java.util.List;

import com.webjjang.dto.BoardDTO;
import com.webjjang.print.BoardPrint;
import com.webjjang.service.BoardListService;
import com.webjjang.util.InUtil;

public class BoardController {
	List<BoardDTO> list;
	
	public void selectMenu() {
		
		while (true) {
			String menu = InUtil.getMenu("1.글리스트 2.글보기 0.종료", "메뉴를 선택하세요>");
			
			switch (menu) {
			case "1":
				BoardListService boardListService = new BoardListService();
				list = boardListService.process();
				BoardPrint boardPrint = new BoardPrint();
				boardPrint.list(list);
				
				break;
			case "2":
				System.out.println("개발중입니다...");
				break;
			case "0":
				return;
				

			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			
		}
		
	}

}
