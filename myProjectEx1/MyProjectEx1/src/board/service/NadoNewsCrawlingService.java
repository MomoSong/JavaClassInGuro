package board.service;

import board.dao.NadoNewsCrawlingDAO;

public class NadoNewsCrawlingService {
	public void nadoNewsCrawling() {
		NadoNewsCrawlingDAO nadoNewsCrawlingDAO = new NadoNewsCrawlingDAO();
		
		try {
			nadoNewsCrawlingDAO.nadoNewsCrawling();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
