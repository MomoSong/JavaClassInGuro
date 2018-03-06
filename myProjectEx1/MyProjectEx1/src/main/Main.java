package main;

import java.util.Scanner;

import board.controller.NadoNewsController;
import board.util.InUtil;
import board.util.OutUtil;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
	
			OutUtil.printTitle("방가방가~~~ 즐");
			
//			String mainMenu = "1.도전 나도 기자	0.종료";
//			OutUtil.printMenu(mainMenu, "-", 40);
			String menu = InUtil.getMenu("1.도전 나도 기자	0.종료", "메뉴를 입력하세요 >" );
	
			switch (menu) {
			case "1":
				NadoNewsController nadoNewsController = new NadoNewsController();
				nadoNewsController.selectMenu();
				break;
				
			case "0":
				OutUtil.printTitle("빠이빠이~~~즐");
				return;
			
			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
				break;
			}
			
			
		}
	
	}

}
