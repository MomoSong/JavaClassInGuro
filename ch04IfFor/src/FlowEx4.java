import java.util.Scanner;

/*
 * 점수를 하나 받아서 평점을 내는 프로그램
 * 2018.2.7
 * 송근모
 * 
 * */

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			int score = 0;
			char grade = ' ';

			System.out.print("점수를 입력하세요 > ");
			String tmp = scanner.nextLine();
			score = Integer.parseInt(tmp);

			if (score > 100) {
				grade = 'O';
			} else if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'U';
			}
			
			System.out.println("당신의 점수는 " + score + " 입니다.");
			if (grade == 'O')
				System.out.println("Error:100점보다 높습니다.");
			else if (grade == 'U')
				System.out.println("Error:점수가 0보다 낮습니다.");
			else {
				System.out.println("당신의 학점은 '" + grade + "'입니다.");
			}
			
			scanner.close();
		}catch(Exception e){
			System.out.println("데이터 처리 중 오류가 발생되었습니다.");
		}
	}
}
