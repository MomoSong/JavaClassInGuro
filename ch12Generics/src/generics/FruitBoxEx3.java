package generics;

public class FruitBoxEx3 {

	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		Juice juice = Juicer.makeJuice(appleBox);
		System.out.println(juice);
	}

}

class Juice {
	String name;

	Juice(String name) {
		this.name = name + " Juice";
	}

	public String toString() {
		return name;
	}
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box){
		String tmp = ""; //과일의 수 만큼 이어 붙인다.
		for(Fruit f: box.getList()) {
			tmp += f;
		}
		System.out.println(tmp);
		return new Juice(tmp);
	}
}