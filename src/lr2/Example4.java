package lr2;

import java.util.Scanner;

public class Example4 {

	public static void main (String [] args) {
	 
	Scanner in = new Scanner(System.in);
	
	System.out.println("Введите целое число");
	int x = in.nextInt();

	if (x >= 5 && x <= 10){
		System.out.println("В диапазоне от 5 до 10");
	} else {
		System.out.println("Вне диапазона от 5 до 10");
	   }
	}
}
