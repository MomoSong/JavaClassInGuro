package crawling.src.crawling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class APIExamSearchBlog {

    public static void main(String[] args) {
        String clientId = "sOnzbjNNnPqK2HFfZbqx";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "lIHWxpuLxj";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("그린팩토리", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/news.xml?query="+ text; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;

            ArrayList<String> arr = new ArrayList<>();
            
            inputLine = br.readLine();
                

            br.close();
            
            
//           String[] strAr = inputLine.toString().split("<title>");
//           String str = "";
//           for (String s : strAr) {
//        	   for(int i=0; i< s.length(); i++) {
//        		   if(s.charAt(i) < 44032 || s.charAt(i) > 55215) {
//        			   str += "";
//        		   }
//        		   if(s.charAt(i) > 44032 && s.charAt(i) < 55215) {
//        			   str += s.charAt(i);   
//        		   }
//        		   
//        	   }
//           }
            
            Document doc = Jsoup.parse(inputLine);
            
            Elements els = doc.select("title");
            
            
            
          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}