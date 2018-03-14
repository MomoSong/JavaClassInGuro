package thread;

public class ThreadEx21 {

	public static void main(String[] args) {
		Runnable r = new RunnableEx21();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}

class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int money) {
		// 잔액이 찾는 금액 보다 크거나 같아야 처리 가능
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= money;

		}
	}
}

class RunnableEx21 implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.getBalance() > 0) { //잔액이 0보다 작을 때까지 계속 인출
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalance());
		}

	}

}