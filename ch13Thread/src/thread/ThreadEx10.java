package thread;

//Thread로 만들어서 사용해보자.
public class ThreadEx10 implements Runnable{
	static boolean autoSave =  false;
	
	public static void main(String[] args) {
		//Thread가 시작하기 전에 데몬으로 돌릴 것을 셋팅한다.
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true);
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}

	}
	
	//쓰레드에서 처리되는 run()메소드
	public void run() {
		while(true) {
			try {
				//3초 동안 재운다.
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동 저장되었습니다.");
	}

}

