package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import board.util.DBUtil;

public class NadoNewsCrawlingDAO {
	private final static String address = "http://sports.khan.co.kr/news/page/entertainment.html";
	private Connection conn;
	private PreparedStatement pstmt;
	private String sql;
	private String content;
	public void nadoNewsCrawling() throws Exception {
		
		Document doc = Jsoup.connect(address).header("User-Agent", "Mozilla/5.0").get();
		ArrayList<String> myNews = new ArrayList<String>();
		ArrayList<String> title = new ArrayList<>();
		ArrayList<String> writer = new ArrayList<>();
		
		Elements link = doc.select(".txt a");
		Elements titleElements = doc.select(".listWrap");
		Elements writerElements = doc.select(".byline");
		for(Element a : link){
			String address1 = a.toString().substring(a.toString().indexOf('"')+1, 93);
			Document doc1 = Jsoup.connect(address1).header("User-Agent", "Mozilla/5.0").get();
			myNews.add(doc1.select(".content_text").text());
		}
		ArrayList<StringBuilder> sbAr = new ArrayList<>();
	
		for(int i = 0; i < myNews.size(); i++) {
			sbAr.add(new StringBuilder(myNews.get(i)));
			for(int j = 0; j < myNews.get(i).length(); j++) {
				if((j>=50) && (j%50 == 0)) {
					sbAr.get(i).insert(j, "\n");
				}
			}
		}
		
		myNews = new ArrayList<String>();
		for(int i =0 ; i < sbAr.size(); i++) {
			myNews.add(sbAr.get(i).toString());
		}
		
		for(int i =0; i < titleElements.size(); i++) {
			String a = titleElements.get(i).text();
			title.add(a.substring(0, a.lastIndexOf('스')).substring(0, 50));
		}
		
		for(int i =0; i < writerElements.size(); i++) {
			String a = writerElements.get(i).text();
			writer.add(a.substring(6, 9));
		}
		
//		for(int i = 0; i < sbAr.size(); i++) {
//			System.out.println( writer.get(i));
//		}

		try{
			for(int i = 0; i < myNews.size(); i++) {
				conn = DBUtil.getConnection();
				setSql("INSERT INTO nadoboard(no, title, content, writer, writedate) "
						+" VALUES(nadoboard_seq.nextval, ?, ?, ?, SYSDATE)");
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, title.get(i));
				pstmt.setString(2, myNews.get(i));
				pstmt.setString(3, writer.get(i));
				pstmt.executeUpdate();
			}
			
		} catch (Exception e) {
			System.out.println("기사를 쓰는 중 오류가 발생했습니다.");
			e.printStackTrace();
		} finally {
			try {
				DBUtil.close(conn, pstmt);
			} catch (SQLException e) {
				System.out.println("객체를 닫는 중 오류가 발생했습니다.");
				e.printStackTrace();
			}
		}
		
	}
	private void setSql(String string) {
		this.sql = string;
	}
}
