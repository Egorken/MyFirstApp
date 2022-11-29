package lr1;

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {
        int year, yoursyears;
        year = 2022;
        Scanner in = new Scanner(System.in);

        System.out.println("Как ваз зовут?");
        String name = in.nextLine();

        System.out.println("Какого вы года рождения?");
        int yearY = in.nextInt();

        yoursyears = year - yearY;
        System.out.println(name + ", вам сейчас " + yoursyears + " years!");
        in.close();
    }
}