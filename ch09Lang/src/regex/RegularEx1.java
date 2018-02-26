package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {

		String[] datas 
		= { "bat", "baby", "c0", "car", "dcar", "count" };
		// 유효한 데이터인지 패턴에 맞는 데이인지 확인 하기 if or regex
		// 패턴 정의

		String pStr = "c[a-z]*";
		System.out.println("패턴 : " + pStr);

		// c로 시작하는 소문자 영단어
		Pattern p = Pattern.compile(pStr);
		// 위의 데이터가 패턴에 맞는지 검사.

		for (String d : datas) {
			System.out.println(d);
			Matcher m = p.matcher(d);
			if (m.matches()) {// 패턴에 맞는지 비교해서 맞으면 true가 리턴됨
				System.out.println("패턴에 맞습니다.");
			} else {
				System.out.println("패턴에 맞지 않습니다.");
			}
		}

	}

}
