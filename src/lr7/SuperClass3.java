package lr7;

public class SuperClass3 {
    private String str1;

    SuperClass3() {setStr1();}

    SuperClass3 (String str1){setStr1(str1);}

    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }

    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        return str1;
    }

    public int getStr1length(){

        return str1.length();
    }


    @Override
    public String toString() {
        return "SuperClass3{" + "str1=\"" + getStr1() + '\"' + " строка.длина = " +
                "\""+getStr1length()+"\"}";
    }
}
