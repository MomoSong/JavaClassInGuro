package thread;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {
		ThreadEx13_1 th1 = new ThreadEx13_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		th1.interrupt();
		System.out.println("isInterrupted():" + th1.isInterrupted());

	}

}

// 10부터 0까지 디스카운트 하는 쓰레드 프로그램
class ThreadEx13_1 extends Thread {
	public void run() {
		int i = 10;
		//i가 0이 아니고 인터럽트가 발생되지 않았으면 계속 실행한다.
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0; x < 2500000000L; x++);
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}
