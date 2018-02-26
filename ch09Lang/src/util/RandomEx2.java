package util;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		//1부터 10까지 10개의 숫자를 랜덤으로 발생시킨다.
		
		System.out.println("Radom 클래스");
		for(int i = 0; i < 15; i++) {
			System.out.print(rand.nextInt(10)+1 + ", ");			
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		System.out.println("Math.radom()");
		for(int i = 1; i <= 15; i++){
			System.out.print((int)(Math.random()*10)+1 + ", ");
		}
		
		System.out.println();
		System.out.println("--------------------------------");

		for(int i = 0; i < 6; i++) {
			System.out.print(lotto() + ", ");
		}
		

	}
	
	public static int lotto() {
		Random r = new Random();
		return r.nextInt(45)+1;
	}

}
