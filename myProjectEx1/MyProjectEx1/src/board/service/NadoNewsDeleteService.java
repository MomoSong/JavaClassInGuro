package board.service;

import board.dao.NadoNewsBoardDAO;

public class NadoNewsDeleteService {
	public void delete(int no){
		NadoNewsBoardDAO nadoNewsBoardDAO = new NadoNewsBoardDAO();
		nadoNewsBoardDAO.delete(no);
	}
}
