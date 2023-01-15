package lr7;

public class subClass3 extends SuperClass3 {
    private String str2;
    public int int1;

    subClass3() {setStr1();}
    subClass3(String str2) {setStr1(str2);}
    subClass3(int int1) {setStr1(); this.setInt1(int1);}
    subClass3(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

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
        return int1;
    }

    public String getStr1(){
        return str2;
    }

    public int getStr1length(){
        return str2.length();
    }

    @Override
    public String toString() {
        return " subClass3{" + "str2=\"" + getStr1() + '\"' + " строка.длина = " +"\""+getStr1length()+"\"}"
                +"\nsubClass3"+ "int1=\"" + getInt1() + "\"}";
    }

}