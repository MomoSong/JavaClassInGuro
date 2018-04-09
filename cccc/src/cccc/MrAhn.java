package cccc;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MrAhn {
	static final String url = "http://finance.daum.net/quote/all.daum?nil_profile=stockprice&nil_menu=siseleftmenu23&nil_stock=refresh";

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect(url).get();
		Elements els = doc.select("td");

		for (Element e : els) {
			System.out.println(e.text());
		}

	}

}
