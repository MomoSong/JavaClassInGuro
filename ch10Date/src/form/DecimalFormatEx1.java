package form;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {

	public static void main(String[] args) {

		//숫자 정의 double형
		double num = 1234567.89;
		String compat = "#,###.000"; //자릿수에 데이터가 없으면 비어 놓는다.
		DecimalFormat df = new DecimalFormat(compat);
		System.out.println(df.format(num));

	}

}
