package interface2;

/*
 * 파일로 부터 데이터를 가져오는 프로그램 작성
 * XML, HTML 파일을 모두 지원한다.
 */
public class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable parser = ParserManager.getParser(args[0]);
		parser.parse(args[1]);
		
//		parser = ParserManager.getParser("HTML");
//		parser.parse("아리가또");

	}

}

// parse()가 있는 인터페이스 -> 추상메서드, final변수, 기본메서드(8)
interface Parseable {
	public void parse(String fileName);
}

// XML에서 데이터를 가져오는 parser - parseable을 상속받아서
class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(fileName + " - XML parsing completed.");
	}
}

// HTML에서 데이터를 가져오는 parser - parseable을 상속받아서
class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
		System.out.println(fileName + " - HTML parsing completed.");
	}

}

// 문자열을 받아서 XML 들어오면 XMLParser를 생성해서 넘겨준다.
// HTML이 들어오면 HTMLParser를 생성해서 넘겨준다. if문 구현
// -->Manager : 객체를 선택해서 받아 오는 프로그램
class ParserManager {
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}
