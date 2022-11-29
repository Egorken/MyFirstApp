package lr1;

import java.util.Scanner;

public class Example13 {

    public static void main(String[] args) {
        int C;

        Scanner in = new Scanner(System.in);

        System.out.println("A =");
        int A = in.nextInt();

        System.out.println("B = ");
        int B = in.nextInt();

        C = A + B;
        System.out.println("C = " +C);
        in.close();
    }
}
