package thread;

import java.util.ArrayList;

public class ThreadWaitEx3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("start");
		Table3 table = new Table3(); // 테이블 한개로 운영하는 패스트 푸드점

		// 음식을 만드는 쓰레드 생성 실행
		new Thread(new Cook3(table), "COOK1").start();
		// 0번 손님 쓰레드 생성 실행
		new Thread(new Customer3(table, "donut"), "CUST1").start();
		// 1번 손님 쓰레드 생성 실행
		new Thread(new Customer3(table, "burger"), "CUST2").start();
		// 2초 후에 모든 쓰레드와 프로그램이 종료 된다.
		Thread.sleep(2000);
		System.exit(0);
	} // end of main()

} // end of ThreadWaitEx1 class

// 손님 클래스 - table, 음식리스트 가 필요하다.
class Customer3 implements Runnable {

	private Table3 table;
	private String food;

	// 손님이 들어오면 먼저 주문을 받는다. -> 손님 객체가 생성이 될 때 넣어 준다.
	public Customer3(Table3 table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() { // Thread로 실행하는 부분
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			// 자신의 쓰레드 이름을 출력한다.
			String name = Thread.currentThread().getName();
			// 손님은 음식을 먹으러 가면서 나오기를 기다림. remove() 안에 wait() 포함.
			table.remove(food);
			System.out.println(name + " ate a " + food);
		} // end of while
	} // end of run()
		// eat method 제거
} // end of Customer3 class

// Table3 객체
class Table3 {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6; // 한 테이블에 놓을 수 있는 음식의 수

	private ArrayList<String> dishes = new ArrayList<>();

	// 음식 추가 메서드
	public synchronized void add(String dish) {
		// 테이블에 음식의 갯수가 6이면(꽉 찼다.) 추가 불가능하므로 기다린다.
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is wating.");
			try {
				wait(); // notify()가 실행되기 전까지 기다린다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		// notify()로 wait()가 깨어나게 되는 경우는 음식을 먹은 경우. remove()에 notify()
		// 음식의 수가 6보다 작으면 처리된다.
		dishes.add(dish);
		// 음식이 나오면 손님들에게 음식이 나왔다록 알려줌. -> 손님들은 음식이 없으면 wait 상태
		notify();
		System.out.println("Dishes:" + dishes);
	} // end of add()

	// 음식을 치우는 메서드 - 요청한 음식은 치우면 true, 음식이 없으면 false를 리턴한다.
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();

			// 먹기를 실행했는데 음식이 없으면 기다린다.
			while (dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			while (true) { // 음식을 먹고나면 return을 실행해서 빠져나간다.
				// 요청한 음식을 치우기를 할때는 한개씩 치운다.
				for (int i = 0; i < dishes.size(); i++)
					if (dishName.equals(dishes.get(i))) {
						// 제거하고 메서드를 빠져 나간다.
						dishes.remove(i);
						notify(); // wait 상태의 쓰레드를 깨운다.
						return;
					}
				// 요청한 음식을 찾지 못했다. -> 기다린다.
				System.out.println(name+" is waiting.");
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		} // end of synchronized
	}

	// 테이블에 음식의 갯수
	public int dishNum() {
		return dishNames.length;
	}
} // end of Table3 class

// 요리하는 클래스
class Cook3 implements Runnable {

	// 음식을 하면 만들어진 음식을 제공하는 테이블 선언
	private Table3 table;

	// 음식을 만들면 어느 테이블에 갈지 미리 정한다. --> 생성자를 만든다.
	Cook3(Table3 table) {
		this.table = table;
	}

	@Override
	public void run() { // Thread로 실행할 부분 -> 음식을 만들고 테이블에 추가 반복
		// 패스트 푸드 점이라 음식을 미리 만들어 놓고(주방장이 마음대로 만든다.) 판매한다.
		while (true) {
			// 임의의 요리(donut,burger) 선택 만들어서 테이블에 추가.
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		} // end of while
	} // end of run()

} // end of Cook3 class
