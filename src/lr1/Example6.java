package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ваша фамилия?");
        String Familyname = in.nextLine() + " ";

        System.out.println("Ваше имя?");
        String Name = in.nextLine() + " " ;

        System.out.println("Ваше Отчество?");
        String FatherName = in.nextLine() + "!";

        System.out.println("Привет, " +Familyname  +Name  +FatherName);
        in.close();
    }
}
