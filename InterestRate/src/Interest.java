import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Interest {
	static final String URL = "https://ko.tradingeconomics.com/south-korea/indicators";

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect(URL).get();
		Elements el = doc.select("tbody");

		for (int i = 0; i < el.size(); i++) {
			if (i == 5) {
				System.out.println(el.get(i).text());
			}

		}

	}

}
