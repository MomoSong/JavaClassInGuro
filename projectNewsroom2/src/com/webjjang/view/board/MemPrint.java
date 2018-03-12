package com.webjjang.view.board;

import java.util.List;

import com.webjjang.board.dto.MemberDTO;
import com.webjjang.util.OutUtil;

public class MemPrint {

	public void list(List<MemberDTO> list) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BoardPrint.list()");
		OutUtil.printMenu("아이디\t 이름\t 닉네임\t 전화\t\t 이메일\t\t 회원등급", "*", 90);
		for (MemberDTO memberDTO : list) {
			System.out.println("" + memberDTO.getId() + "\t" + memberDTO.getName() + "\t" + memberDTO.getNick() + "\t"
					+ memberDTO.getTel() + "\t" + memberDTO.getEmail() + "\t" + memberDTO.getGrade() + "\t");
		}
	}

}
