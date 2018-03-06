package enum1;

public class EnumEx1 {

	public static void main(String[] args) {

		Direction d1 = Direction.EAST;
		Direction d2 = Direction.EAST;
		Direction d3 = Direction.WEST;
		System.out.println("d1 = " + d1);
		System.out.println(Direction.EAST);
		System.out.println(Direction.valueOf("EAST"));
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d1.equals(d2));
		System.out.println(d1.compareTo(d3));
	}
}
enum Direction { EAST, SOUTH, WEST, NORTH}