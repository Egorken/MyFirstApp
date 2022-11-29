package lr1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {
        int C, B;

        Scanner in = new Scanner(System.in);

        System.out.println("A =");
        int A = in.nextInt();

        C = A - 1;
        B = A + 1;

        System.out.println(A);
        System.out.println(C);
        System.out.println(A);
        System.out.println(B);
        in.close();
    }
}
