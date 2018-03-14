package thread;

// Thread로 만들어서 사용해 보자.
public class ThreadEx10 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {

		Thread t = new Thread(new ThreadEx10());
		// Thread가 시작하기 전에 데몬으로 돌릴 것을 셋팅한다.
		t.setDaemon(true);
		t.start();
		for(int i =1; i<=10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			// 5초가 지나면 자동 저장을 시작한다.
			if(i==5) autoSave = true;
		}
	} // end of main()
	
	// 쓰레드에서 처리는 run()
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);//3동안 재운다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(autoSave){
				autoSave();
			}
			
		}
	} // end of run()
	
	public void autoSave() {
		System.out.println("작업파일이 자동 저장되었습니다.");
	}
} // end of ThreadEx10 class


