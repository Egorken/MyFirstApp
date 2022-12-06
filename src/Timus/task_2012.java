package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberOfTasks = in.nextInt();
        
        int difference = 12 - numberOfTasks;
        
        int time = difference * 45;
        
        String result = time <=240 ? "Yes" : "No";	
        
        out.println(result);
        out.flush();
    }
}
