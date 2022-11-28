package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какой сегодня день недели?");
        String dayofweek = in.nextLine() + ", ";

        System.out.println("Какой сейчас месяц?");
        String mounth = " " + in.nextLine() + ".";

        System.out.println("Какой день месяца?");
        int dayofmounth = in.nextInt();


        System.out.println(dayofweek + dayofmounth + mounth) ;
        in.close();
    }
}