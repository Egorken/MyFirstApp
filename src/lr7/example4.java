package lr7;

public class example4 {
    public static void main(String[] args) {

        SuperClass4 superClass = new SuperClass4('A');
        String className1 = superClass.toString();
        System.out.println(className1);

        SuperClass4 superClassCopy = new SuperClass4(superClass);
        String className1copy = superClassCopy.toString();
        System.out.println(className1copy);
        subClass4 FirstSubClass = new subClass4('A',"AAA");
        String className2 = FirstSubClass.toString();
        System.out.println(className2);

        subClass4 FirstSubClassTestCopy = new subClass4(FirstSubClass);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        toSubClass4 SecondSubClassTest = new toSubClass4('A',"AAA",320);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        toSubClass4 SecondSubClassTestCopy = new toSubClass4(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}
