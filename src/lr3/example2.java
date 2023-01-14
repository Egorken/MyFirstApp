package lr3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день недели(кириллица, нижний регистр)");
        String day = id.nextLine();
        WeekDay.IfMethod(day);
    }

    static class WeekDay {

        static void IfMethod(String d) {
            String day = d;
            int dayN = 0;
            if (day.equals("понедельник")) {
                dayN = 1;
            } else if (day.equals("вторник")) {
                dayN = 2;
            } else if (day.equals("среда")) {
                dayN = 3;
            } else if (day.equals("четверг")) {
                dayN = 4;
            } else if (day.equals("пятница")) {
                dayN = 5;
            } else if (day.equals("суббота")) {
                dayN = 6;
            } else if (day.equals("воскресенье")) {
                dayN = 7;
            } else {
                System.out.println(day + " некорректное значение дня недели");
            }
            if (dayN != 0) {
                System.out.printf("%s это %s-й день недели\n", day, dayN);
            }
            return;
        }

    }
}