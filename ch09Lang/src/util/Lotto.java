package util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		// array[] 사용했으나 set을 사용해보자. Collection
		// Set은 중복을 허용하지 않는 자료 구조형 객체
		Set<Integer> set = new HashSet<>();
		while (set.size() != 6) {//set에 있는 데이터가 6이 아니면 반복
			set.add(r.nextInt(45) + 1);
		}
		System.out.println(set);

	}

}
