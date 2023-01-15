package lr7.example2;


public class subClass2 extends SuperClass2 {
    private String str2;
    public int int1;

    subClass2() {
        setStr1();}
    subClass2(String str2) {
        setStr1(str2);}
    subClass2(int int1) {
        setStr1();
        this.setInt1(int1);}
    subClass2(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "здесь ничего нет";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){
        //   System.out.println(str1);
        return int1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str2;
    }

    public  int getStr1length(){
        return str2.length();
    }

    @Override
    public String toString() {
        return "subClass2{" + "str2=\"" + getStr1() + '\"' +
                " строка.длина = " +"\""+getStr1length()+"\"}"
                +"\nsubClass2{" + "int1=\"" + getInt1() + "\"}";
    }
}