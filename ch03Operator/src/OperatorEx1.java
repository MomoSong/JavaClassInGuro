import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 5;
//		i = i + 1;
//		
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자 입력 -->");
//		String data1 = scanner.nextLine();
//		int num1 = Integer.parseInt(data1);
//		System.out.println("두번째 숫자 입력 -->");
//		String data2 = scanner.nextLine();
//		int num2 = Integer.parseInt(data2);
//		
//		if(num1>num2) {
//			System.out.println(num1-num2);
//		}else {
//			System.out.println(num2-num1);
//		}
				//나이를 입력 받아서 요금을 계산하는 프로그램 작성
		//18세
		
		System.out.println("나이를 입력하시오 : ");
		int cost = 1300;
		int age = scanner.nextInt();
	
		if(age >= 18) {
			System.out.printf("%d원 입니다.", cost);
		}else {
			System.out.printf("%d원 입니다.", cost/2);
		}
		
		scanner.close();
		
	}
}
