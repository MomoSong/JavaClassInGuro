package com.webjjang.board.main;

import com.webjjang.board.controller.BoardController;
import com.webjjang.util.InUtil;

public class Main {

	public static void main(String[] args) {

		//환영인사
		System.out.println("방가 방가 ~~\n");
		//메뉴 입력 처리 무한 반복문
		while (true) {
			//메뉴 출력 -> 입력
			//메뉴 1.공지사항, 2 쇼핑몰 , 3 게시판 , 0종료
			String menu = InUtil.getMenu("1 공지사항   2 쇼핑몰   3 게시판   0 종료", "메뉴 입력");
			
			switch (menu) {
			case "1":
				System.out.println("공지사항");
				break;
				
			case "2":
				System.out.println("쇼핑몰");
				break;
				
			case "3":
				System.out.println("게시판");
				//객체를 생성하고 메서드 호출해서 실행한다.
				BoardController boardController = new BoardController();
				boardController.selectMenu();
				break;
				
			case "0":
				System.out.println("바이바이~~!");
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			}
			
		}

	}

}
