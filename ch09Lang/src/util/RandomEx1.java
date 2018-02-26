package util;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {

		Random rand1 = new Random();
		Random rand2 = new Random();
		
		System.out.println("==rand1==");
		//5개의 난수를 발생 시킨다.
		for(int i = 1; i <=5; i++) {
			System.out.println(rand1.nextInt());
		}
		for(int i = 1; i <=5; i++) {
			System.out.println(rand2.nextInt());
		}
		

	}

}
