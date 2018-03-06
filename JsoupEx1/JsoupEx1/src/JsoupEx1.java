import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupEx1 {
	private final static String address = "http://sports.khan.co.kr/news/page/entertainment.html";
	
	public static void main(String[] args) throws IOException {
		int i = 1;
		int i2 = 1;
		int i3 = 1;
		Document doc = Jsoup.connect(address).header("User-Agent", "Mozilla/5.0").get();
		ArrayList<String> myNews = new ArrayList<String>();
		
		Elements link = doc.select(".txt a");
		for(Element a : link){
			String address1 = a.toString().substring(a.toString().indexOf('"')+1, 93);
			Document doc1 = Jsoup.connect(address1).header("User-Agent", "Mozilla/5.0").get();
			myNews.add(doc1.select(".content_text").text());
			
		}
		
		for(String s: myNews){
			System.out.println(i++ + "-" + s);
			System.out.println("=========================================================");
		}
		
		Elements title = doc.select(".listWrap");
		for(Element a : title){
			System.out.println(i2++ + "-" + a.text());	
		}
		
		Elements writer = doc.select(".byline");
		for(Element a : writer){
			System.out.println(i3++ +  "-" + a.text().substring(6, 9));	
		}
	}
}
