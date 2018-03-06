package com.webjjang.board.controller;

import java.util.List;

import com.webjjang.board.dto.BoardDTO;
import com.webjjang.board.service.BoardListService;
import com.webjjang.util.InUtil;
import com.webjjang.view.board.BoardPrint;

public class BoardController {

	public void selectMenu() {
		
		System.out.println("BoardController.selectMenu()");
		//메뉴 출력  -> 입력, 처리 무한반복
		
		while (true) {
			//메뉴 출력 -> 입력
			//메뉴 - 1.리스트  2.글보기  3.글쓰기  4.글수정  5.글삭제  0.이전메뉴
			String menu = InUtil.getMenu("1.리스트  2.글보기  3.글쓰기  4.글수정  "
					+ "5.글삭제  0.이전메뉴", "메뉴를 선택하세요 >");
			
			switch (menu) {
			case "1":
				System.out.println("리스트");
				//service를 호출해서 데이터 가져오기.
				BoardListService boardListService = new BoardListService();
				List<BoardDTO> list 
				= boardListService.process();
				BoardPrint boardPrint = new BoardPrint();
				boardPrint.list(list);
				//가져온 데이터 출력
				break;
				
			case "2":
				System.out.println("글보기");
				break;
				
			case "3":
				System.out.println("글쓰기");
				break;
				
			case "4":
				System.out.println("글수정");
				break;
				
			case "5":
				System.out.println("글삭제");
				break;
			
			case "0":
				System.out.println("이전 메뉴");
				return;

			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			
		}
		
	}
	
}
