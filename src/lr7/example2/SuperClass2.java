package lr7.example2;

public class SuperClass2 {
    String str1;
    SuperClass2() {
        setStr1();}
    SuperClass2 (String str1){
        setStr1(str1);}


    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }

    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }

    public int getStr1length(){
        return str1.length();
    }


    @Override
    public String toString() {
        return "SuperClass2{" + "str1=\"" + getStr1() + '\"' +
                " строка.длина = " +"\""+getStr1length()+"\"}";
    }

}