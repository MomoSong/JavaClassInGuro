


public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		if(!ctv.power) ctv.power(); 
		ctv.caption();
		ctv.channel = 10;
		System.out.println(ctv);
		ctv.channelUp();
		System.out.println(ctv);
		if(!ctv.caption) ctv.caption();
		ctv.displayCaption("안녕하세요");
		
		CaptionTv1 ctv1 = new CaptionTv1();
		ctv1.tv.power();
		System.out.println(ctv1);
	}

}

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	public String toString() {
		return "Tv[power=" + power 
				+ ", channel=" + channel +"]";
	}
}

class CaptionTv extends Tv{
	boolean caption;
	void caption() { caption = !caption; }
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	public String toString() {
		return "captionTv[caption=" + caption+", "
				+super.toString() + "]"; 
	}
}

class CaptionTv1{
	Tv tv = new Tv();
	boolean caption;
	void caption() { caption = !caption; }
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	public String toString() {
		return "captionTv1[caption=" + caption+", "
				+tv.toString() + "]"; 
	}
}