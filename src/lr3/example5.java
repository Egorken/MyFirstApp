package lr3;

import java.util.Scanner;
import java.util.Random;

public class example5 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме:");
        int x = id.nextInt();
        CalcNums.ForCalcNums(x);
    }
    private static class CalcNums {
        private static void ForCalcNums(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            int sum = 0;
            for (int i = 0; x > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum = sum + i;
                    x--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }
    }
}
