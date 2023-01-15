package lr7.example5;

import lr7.example5.SuperClass5;

public class toSubClass5  extends SuperClass5 {

    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    toSubClass5(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }

    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " int1 = \"" + this.getInt1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public int getInt1() {
        return int1;
    }
}