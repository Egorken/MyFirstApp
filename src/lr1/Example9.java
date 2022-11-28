package lr1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Название месяца?");
        String mounth = "" + in.nextLine() +"";

        System.out.println("Сколько дней в этом месяце?");
        int dayofmounth = in.nextInt();


        if (dayofmounth>30) {
            System.out.println("Месяц "+mounth +" имеет " +dayofmounth +" день") ;}
            else {
                System.out.println("Месяц "+mounth +" имеет " +dayofmounth +" дней") ;
        in.close();}
    }
}