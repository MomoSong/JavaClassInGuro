package com.webjjang.member.controller;

import com.webjjang.main.ControllerInterface;
import com.webjjang.util.InUtil;
import com.webjjang.util.OutUtil;

public class MemberController implements ControllerInterface {

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		System.out.println("MemberController.selectMenu()");
		while (true) {

			OutUtil.printTitle("회원 관리");
			// 로그인이 되어 있으면 로그인 정보를 출력한다.
			if (Login.id != null)
				OutUtil.printMenu(Login.name + "님 환영합니다.", "-", 40);
			String menuList = "1.로그인 2.로그아웃 0.이전메뉴";
			OutUtil.printMenu(menuList, "-", 40);
			String menu = InUtil.getMenu("메뉴 입력 ");

			switch (menu) {
			case "1":
				System.out.println("로그인 처리");
				// id와 비밀번호를 받는다.
				// db에 where 문장을 이용해서 데이터를 select해서 가져온다.
				// 가져와지면 로그인 처리(Login.id 등 데이터 넣기)를 한다.
				if (menu.equals("1")) { // 가져온 데이터가 null이 아니다.
					Login.id = "test";
					Login.name = "jjang";
					Login.grade = 1;
				} else {
					System.out.println("아이디와 비밀번호 확인");
				}
				break;

			case "2":
				System.out.println("로그아웃 처리");
				// 가져와지면 로그인 처리(Login.id 등을 null 또는 0)를 한다.
				if (menu.equals("2")) { // 가져온 데이터가 null이 아니다.
					Login.id = null;
					Login.name = null;
					Login.grade = 1;
				} else {
					System.out.println("이미 로그아웃되어 있습니다.");
				}
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
