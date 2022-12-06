package lr2;

import java.util.Scanner;

public class Example5 {

	public static void main (String [] args) {
	 
	Scanner in = new Scanner(System.in);
	
	System.out.println("Введите целое число");
	int x = in.nextInt();

	int n = x / 1000 ;
	
	if (x > 999)
	{
		System.out.println(n + " тысяч");
	} else {
		System.out.println("Меньше 1000");
	   }
	}
}
