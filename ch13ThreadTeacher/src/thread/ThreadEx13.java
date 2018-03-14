package thread;

import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {

		Thread t1 = new ThreadEx13_1();
		t1.start();
		String input = JOptionPane.showInputDialog("많은 데이터를 처리?");
		System.out.println("입력하신 값은 "+input);
		t1.interrupt(); // thread가 실행이되고 있으면 인터럽트가 발생된다.
		System.out.println("isInterrrupted():"+t1.isInterrupted());
	}
} // end of ThreadEx7 class

// 10부터 디스카운드 하는 쓰레드 프로그램
class ThreadEx13_1 extends Thread {
	public void run() {
		int i = 10;
		// i가 0이 아니고 인터럽트가 발생되지 않았으면 계속 실행한다.
		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++);// 시간지연
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}

