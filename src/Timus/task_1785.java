package Timus;

import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a >= 1 && a <= 4) {
        	System.out.print("few");
        } else if (a >= 5 && a <= 9) {
        	System.out.print("several");
        } else if (a >= 10 && a <= 19) {
        	System.out.print("pack");
        } else if (a >= 20 && a <= 49) {
        	System.out.print("lots");
        } else if (a >= 50 && a <= 99) {
        	System.out.print("horde");
        } else if (a >= 100 && a <= 249) {
        	System.out.print("throng");
        } else if (a >= 250 && a <= 499) {
        	System.out.print("swarm");
        } else if (a >= 500 && a <= 999) {
        	System.out.print("zounds");
        } else if (a >= 1000) {
        	System.out.print("legion");
        }
        System.out.flush();
    }
}
