package lr3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи\n");
        int x = id.nextInt();

        Fib.ForFib(x);
    }

    static class Fib {
        static void ForFib(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            long k = 0;
            long l = 1;
            long m = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
            }
            System.out.println("\nконец цикла");
        }
    }
}
