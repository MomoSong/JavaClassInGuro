package enum1;

public class EnumEx3 {

	public static void main(String[] args) {

		

	}

}


//공공 운송 수단 - enum 선언
enum Transportation {
	BUS(100) { 
		int fare(int distance) { return distance * BASIC_FARE;}
	},
	TRAIN(150) {
		int fare(int distance) { return distance * BASIC_FARE;}
	},
	SHIP(100){
		int fare(int distance) { return distance * BASIC_FARE;}
	},
	AIRPLANE(300){
		int fare(int distance) { return distance * BASIC_FARE;}
	};
		
	
	protected final int BASIC_FARE;
	
	private Transportation(int basicFare) {
		this.BASIC_FARE = basicFare;
	}
	public int getBasicFare() { return BASIC_FARE; }
	
	//교통 수단에 따라서 계산 법이 다르다고 처리하도록 하는 추상 메서드
	abstract int fare(int distance);
	
}