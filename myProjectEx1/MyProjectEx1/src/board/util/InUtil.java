package board.util;

import java.util.Scanner;

public class InUtil {
	public static Scanner scanner = new Scanner(System.in);
	
	public static String getString(){
		return scanner.nextLine();
	}
	
	public static String getMenu(String str){
		System.out.print(str);
		return getString();
	}
	
	public static String getMenu(String menu, String str){
		System.out.println(menu);
		return getMenu(str);
	}
	
	public static int getInt(String str){
		while(true){
			try{
				return Integer.parseInt(getMenu(str));
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요. ");
			}
		}
	}
	
}
