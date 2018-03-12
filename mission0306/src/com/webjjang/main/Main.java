package com.webjjang.main;

import com.webjjang.controller.BoardController;
import com.webjjang.util.InUtil;

public class Main {

	public static void main(String[] args) {

		
		while(true) {
			String menu = InUtil.getMenu("1.게시판 0.종료", "메뉴를 입력하세요>");
			switch (menu) {
			case "1":
				BoardController boardController = new BoardController();
				boardController.selectMenu();
				
				break;
				
			case "0":
				System.exit(0);
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			
		}

	}

}
