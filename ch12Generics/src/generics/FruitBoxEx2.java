package generics;

public class FruitBoxEx2 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.add(new Fruit());

	}

}

interface Eatable{} //FruitBoxEx1에서 사용

//지네릭스한 Box 클래스를 상속 -> FruitBoxEx1에서 선언 
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
