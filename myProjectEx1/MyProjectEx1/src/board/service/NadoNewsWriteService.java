package board.service;

import board.dao.NadoNewsBoardDAO;

public class NadoNewsWriteService {
	NadoNewsBoardDAO boardDAO = new NadoNewsBoardDAO();
	
	public void write(String title, String content, String writer){
		boardDAO.write(title, content, writer);
	}
	
	

}
