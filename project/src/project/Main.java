package project;

import java.util.Scanner;

import boardController.BoardController;

/*
 *
 * @author 송근모
 * 
 * 쇼핑몰
 * 1.공지사항  2.쇼핑몰  3.게시판 0.종료
 *
 */

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인사말
		System.out.println("방가방가~~~ 즐\n\n");
		
		//무한반복되는 메뉴처리
		whileLoop:
		while(true) {
			//	메뉴를 출력
			System.out.println("1.공지사항 2.쇼핑몰 3.게시판 0.종료");
			//	메뉴선택
			System.out.print("메뉴 입력 :");
			String menu = scanner.nextLine();
			//	메뉴처리
			
			switch (menu) {
			case "1":
				System.out.println("공지사항입니다.");
				break;

			case "2":
				System.out.println("쇼핑몰입니다.");
				break;
				
			case "3":
				System.out.println("게시판 입니다.");
				//게시판처리를 위해서 컨트롤러 생성, 호출
				//생성 -> new
				BoardController boardController
				 = new BoardController();
				//메서드 호출해서 실행
				boardController.selectMenu();
				break;
				
			case "0":
				System.out.println("빠이빠이 ~~~ 즐");
				//프로그램 종료
				//System.exit(0);
				//return;
				break whileLoop;
				
			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
				System.out.println("[0-3]입력하세요");
				break;
			}
		
		
		}
	}

}
