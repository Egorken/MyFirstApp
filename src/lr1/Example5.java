package lr1;

import java.util.Scanner;

public class Example5 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Как вас зовут?");
        String name = in.nextLine();

        System.out.println("Сколько вам лет?");
        int age = in.nextInt ();

        System.out.println("Какой у вас рост?");
        Float height = in.nextFloat();

        System.out.println("Имя: " +name);
        System.out.println("Возраст: " +age + " лет");
        System.out.println("Рост: " +height + " м");
        in.close();
    }
}
