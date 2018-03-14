package thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		//쓰레드를 생성하면서 Runnable을 넣어준다.
		Thread t2 = new Thread(r);
		t1.setPriority(3);
		t2.setPriority(7);
		t1.start();
		t2.start();
		
		Thread t3 = new Thread(new ThreadEx1_3());
		t3.start();
	}

}

// 쓰레드 클래스를 상속 받은 쓰레드 선언
class ThreadEx1_1 extends Thread {
	// 쓰레드는 정해진 메서드를 선언해서 실행한다. -> 실제적으로 쓰레드의 실행은 start()를 이용
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// Runnable 인터페이스를 상속 받아서 Thread를 생성할 때 넣어준다. 
// 이미 한개의 클래스를 상속 받고 있는 경우 다중 상속이 불가능하므로 Runnable 인터페이스를 상속받게 해서
// 쓰레드를 생성할 때 넣어준다.
class ThreadEx1_2 implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ThreadEx1_3 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}