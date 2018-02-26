package util;

import java.util.Arrays;
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

		
		int[] result = lotto();
		for(int i : result) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//로또 번호 발생기 선생님 답안
		
		int[] lotto  = new int[5];
		for(int i = 0; i < lotto.length; i++) { 
			lotto[i] = rand.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}
	
	//중복되지 않는 로또 번호 발생기
	public static int[] lotto() {
		Random r = new Random();
		int[] myLotto = new int[5];
		boolean flag = true;
		
		for(int i = 0; i < myLotto.length; i++) {
			myLotto[i] = r.nextInt(45)+1;
		}
		
		while(flag){
			Arrays.sort(myLotto);
			
			for(int i = 0; i < myLotto.length-1; i++) {
				if(myLotto[i] == myLotto[i+1]) {
					flag = true;
					myLotto[i+1] = r.nextInt(45)+1;
				}else {
					flag = false;
				}
			}
		}
		
		Arrays.sort(myLotto);
		return myLotto;
	}

}
