package lr1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {
        int raz, sloz;

        Scanner in = new Scanner(System.in);

        System.out.println("A =");
        int A = in.nextInt();

        System.out.println("B =");
        int B = in.nextInt();

        raz = A - B;
        sloz = A + B;

        System.out.println(sloz);
        System.out.println(raz);

    }
}
