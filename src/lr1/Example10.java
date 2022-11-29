package lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        int d;
        Scanner in = new Scanner(System.in);

        System.out.println("Год вашего рождения?");
        int you = in.nextInt();

        System.out.println("Какой сейчас год?");
        int yearnow = in.nextInt();

        d = yearnow - you;
        System.out.println("Вам сейчас " +d + " лет");
        in.close();
    }
}
