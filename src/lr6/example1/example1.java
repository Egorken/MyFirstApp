package lr6.example1;

public class example1 {
    public static void main(String[] args) {
        task1 task = new task1();
        task.SetField('A');
        task.SetField("B");
        char[] CharArray1 = {'п','р','и','в','е','т'};
        char[] CharArray2 = {'C'};
        task.SetField(CharArray1);
        task.SetField(CharArray2);

    }

}