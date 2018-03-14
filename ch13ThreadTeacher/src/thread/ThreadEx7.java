package thread;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {

		Thread t1 = new ThreadEx7_1();
//		Thread t2 = new ThreadEx7_2();
		Thread t2 = new ThreadEx7_2(t1);
		t1.start();
		t2.start();
	}
} // end of ThreadEx7 class

// 10부터 디스카운드 하는 쓰레드 프로그램
class ThreadEx7_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("시간 초과입니다.");
	}
}

// 문제를 푸는 쓰레드 프로그램
class ThreadEx7_2 extends Thread{
	Thread t;
	public ThreadEx7_2(Thread t) { this.t = t; }
	public void run() {
		String input = JOptionPane.showInputDialog("401호 강사 쌤이름은?");
		System.out.println("입력하신 값은 "+input+"입니다.");
		System.out.println(
				(input.equals("이영환")?"정답입니다.":"틀리셨습니다."));
		t.stop();
	}
}
