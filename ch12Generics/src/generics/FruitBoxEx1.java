package generics;

import java.util.ArrayList;

public class FruitBoxEx1 {

	public static void main(String[] args) {

		Box<Fruit> fruitBox = new Box<>();
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		for (int i = 0; i < fruitBox.size(); i++) {
			System.out.println(fruitBox.get(i));
		}
		Box<Apple> appleBox = new Box<>();
		appleBox.add(new Apple());
//		appleBox.add(new Fruit()); //부모 클래그가 더 큰 개념으로 Aplle에 넣을 수 없다.
		System.out.println(appleBox);
		Box<Toy> toyBox = new Box<>();
		toyBox.add(new Toy());
	}

}

class Fruit implements Eatable //Eatable은 FruiBoxEx2에 선언
{@Override public String toString() {return "Fruit";}}
class Apple extends Fruit{@Override public String toString() {return "Apple";}}
class Grape extends Fruit{@Override public String toString() {return "Grape";}}
class Toy{@Override public String toString() {return "Toy";}}

class Box<T> {
	private ArrayList<T> list = new ArrayList<>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	ArrayList<T> getList(){return list;} //향상된 for문 사용시 필요
	public String toString() { return list.toString(); }
}