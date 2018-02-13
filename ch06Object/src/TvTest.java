
class Tv{
	private String color;
	private boolean power;
	private int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return getClass().getName() 
				+" [color=" + color 
				+", Power= " + power 
				+ ", channel=" + channel + "]";
	}
	
}

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t;
		t = new Tv();
//		t.channel = 7;
		t.setChannel(7);
//		t.channelDown();
		System.out.println(t);
//		System.out.println(t.toString());
		t.power();
		System.out.println(t);
		t.channelDown();
		System.out.println(t);
	}

}
