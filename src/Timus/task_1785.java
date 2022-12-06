package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        if (a >= 1 && a <= 4) {
        	System.out.print("Few");
        } else if (a >= 5 && a <= 9) {
        	System.out.print("Several");
        } else if (a >= 10 && a <= 19) {
        	System.out.print("Pack");
        } else if (a >= 20 && a <= 49) {
        	System.out.print("Lots");
        } else if (a >= 50 && a <= 99) {
        	System.out.print("Horde");
        } else if (a >= 100 && a <= 249) {
        	System.out.print("Throng");
        } else if (a >= 250 && a <= 499) {
        	System.out.print("Lots");
        } else if (a >= 500 && a <= 999) {
        	System.out.print("Zounds");
        } else if (a >= 1000) {
        	System.out.print("Legion");
        }
        out.flush();
    }

}
