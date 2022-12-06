package lr2;

import java.util.Scanner;

public class Example1 {

	public static void main (String [] args) {
	 
	Scanner in = new Scanner(System.in);
	
	System.out.println("Число:");
	
	int x = in.nextInt();
	
	int result = x % 3;
	
	if (result == 0) {
		System.out.println("Делится на три");
	} else {
		System.out.println("Не делится на три");
	   }
	}
}
