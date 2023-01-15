package lr7.example3;

public class example3 {
    public static void main(String[] args) {
        SuperClass3 myTest0 = new SuperClass3();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        SuperClass3 myTest1 = new SuperClass3("Проверить");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClass3 myTest2 = new subClass3();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClass3 myTest3 = new  subClass3("проверьте и это тоже");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClass3 myTest4 = new  subClass3(150);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClass3 myTest5 = new  subClass3("проверьте и это", 150);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }

}