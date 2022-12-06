package lr2;

import java.util.Scanner;

public class Example2
{
	public static void main (String [] args) {
	 
	Scanner in = new Scanner(System.in);
	
	System.out.println("Введите целое число");
	int x = in.nextInt();
	System.out.println("На сколько делим?");
	int s = in.nextInt();
	
	int n = x % s ;
	System.out.println("result = " + n);
	
	if (n == 2) {
		System.out.println("остаток 2");
	} else {
		System.out.println("остаток не 2");
	   }
	
	if (n == 1) {
		System.out.println("остаток 1");
	} else {
		System.out.println("остаток не 1");
	   }
	}
}
