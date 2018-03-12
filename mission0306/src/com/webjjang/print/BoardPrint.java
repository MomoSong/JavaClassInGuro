package com.webjjang.print;

import java.util.List;

import com.webjjang.dto.BoardDTO;

public class BoardPrint {

	public void list(List<BoardDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			BoardDTO dto = list.get(i);
			System.out.println("-------------------------------------------------");
			System.out.printf("[%3d][%10s][%10s][%10s][%3d]\n",
							dto.getNo(), dto.getTitle(), dto.getWriter(),
							dto.getWritedate(), dto.getHit());
			System.out.println("-------------------------------------------------");
		}
		
	}

}
