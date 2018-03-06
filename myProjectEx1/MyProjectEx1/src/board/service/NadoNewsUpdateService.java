package board.service;

import board.dao.NadoNewsBoardDAO;

public class NadoNewsUpdateService {
	public void update(String title, String content, String writer, int no){
		NadoNewsBoardDAO nadoNewsBoardDAO = new NadoNewsBoardDAO();
		nadoNewsBoardDAO.update(title, content, writer, no);
	}
}
