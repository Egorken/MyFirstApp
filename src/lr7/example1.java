package lr7;

public class example1 {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new subClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        subClassTest subClassOdject =
                new subClassTest("передал в конструктор подкласса");
        String subClassName = subClassOdject.toString();
        System.out.println(subClassName);

        subClassTest subClassObject2 =
                new subClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}