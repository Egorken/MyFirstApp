package lr6.example1;

public class task1 {
    private char ch;
    private String str;

    public void SetField(char c) {
        ch = c;
        System.out.print("\n Вызов метода c аргументом char. ch ="+ch);
    }

    public void SetField(String s) {
        str = s;
        System.out.print("\n Вызов метода c аргументом string. str ="+str);
    }
    public void SetField(char [] CharArray) {
        if (CharArray.length == 1){
            ch = CharArray[0];
            System.out.print("\n Вызов метода c массивом char. ch ="+ch);
        }
        else{

            str=new String(CharArray);
            System.out.print("\n Вызов метода c массивом string. str ="+str);}
    }


}
