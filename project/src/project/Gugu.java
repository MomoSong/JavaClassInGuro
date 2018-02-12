package project;

import java.util.Scanner;

public class Gugu {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		String getNum;
		int num1;
		int num2;
		
		//num1과 num2를 사용자로 부터 입력 받는다.
		System.out.println("Number 1을 입력하세요 :" );
		getNum = scanner.nextLine();
		num1 = Integer.parseInt(getNum);
		System.out.println("Number 2를 입력하세요 :" );
		getNum = scanner.nextLine();
		num2 = Integer.parseInt(getNum);
		
		//num1이 num2보다 크면 서로 자리를 바꾼다.
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println();
		System.out.print("구구단을 출력합니다. ");
		System.out.println(num1 + "단 부터" + num2 + "단 까지...");
		//숫자 num1 로부터 구구단을 num2까지 출력한다.
		for(int i = num1; i <= num2; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%d ",i, j, i*j);
				if(j%3 == 1) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
		}
		
		System.exit(0);
	}

}
