package lr3;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите первое целое число");
        int x = id.nextInt();
        System.out.println("Ввведите второе целое число");
        int y = id.nextInt();

        SortNums.ForSortNums(x, y);
    }
    static class SortNums {
        static void ForSortNums(int x, int y) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            if (x > y) { // если x > y
                for (int y1 = y; y1 <= x; y1++) {
                    System.out.printf("%d, ", y1);
                }
            } else { // если y > x
                for (int x1 = x; x1 <= y; x1++) {
                    System.out.printf("%d, ", x1);
                }
            }
            System.out.println("конец числового ряда"); // Сообщение пользователю
        }
    }
}