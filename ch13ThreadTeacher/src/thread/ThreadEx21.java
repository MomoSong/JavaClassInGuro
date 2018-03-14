package thread;

public class ThreadEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new RunnabelEx21();
		new Thread(r).start();
		new Thread(r).start();
	}

} // end of ThreadEx21

// 통장 클래스
class Account{
	private int balance = 1000;
	
	public int getBalance() {return balance;}
	// 인출 메서드
	public synchronized void withdraw(int money) {
		// 잔액이 찾는 금액 보다 크거나 같아야 처리 가능
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
} // end of Account

class RunnabelEx21 implements Runnable{
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.getBalance()>0) { // 잔액이 0 보다 작을 때까지 계속 인출
			System.out.println("balance:"+acc.getBalance());
			int money = (int)(Math.random() *3+1)*100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance()
			+", account money:"+money);
		}
	}
	
}
