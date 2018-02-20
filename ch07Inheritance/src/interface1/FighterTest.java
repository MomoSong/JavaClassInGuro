package interface1;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		Fightable ft = new Fighter();
		f.move(10, 5);
		f.currentHp = 100;
		ft.attack(f);
		Movable mf = new Fighter();
//		mf.move(5, 10); 타입이 Movable이라 Attack()이 빠짐. Attack()사용불가
//		mf.로 Attack()하고 싶으면 casting한다. 원래 Fighter가 들어 있으므로 가능
		((Fighter) mf).attack(f);
		((Fightable) mf).attack(f);
		
		
	}

}

// Movable interface -> 추상메서드, final변수, 기본 메서드 선언가능(8버전이후)
interface Movable {
	// public Movable() {} 생성자를 가질 수 음슴
	// abstract void move(int x, int y); 기본이 abstract이므로 키워드 생략가능
	void move(int x, int y); // 기본이 abstract이므로 키워드 생략가능
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable {

}

class Unit {
	int currentHp;
	int x;
	int y;
}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x += x;
		this.y += y;
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		u.currentHp -= 10;
	}

}