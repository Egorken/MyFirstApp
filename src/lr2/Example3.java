package lr2;

import java.util.Scanner;

public class Example3 {

	public static void main (String [] args) {
	 
	Scanner in = new Scanner(System.in);
	
	System.out.println("Введите целое число");
	int x = in.nextInt();
	
	int n = x % 4 ;
	System.out.println("Остаток: " + n);
	
	if (x > 10) {
		System.out.println("Число больше 10");
		
		if (n == 0) {
			System.out.println("Делится на 4");
		} else {
			System.out.println("Но, не делится на 4");
		   }
	} else {
		System.out.println("Число меньше 10!");
	   }
	}
}
