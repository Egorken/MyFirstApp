package lr1;

import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {
        int year, yearnow;
        yearnow = 2022;
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько вам лет?");
        int howoldu = in.nextInt();

        year = yearnow - howoldu;
        System.out.println("Вы родились в " + year + " году.");
        in.close();
    }
}
