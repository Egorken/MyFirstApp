package lr7.example4;

public class SuperClass4 {
    public char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    SuperClass4(char char1){
        this.setChar1(char1);
    }
    SuperClass4(SuperClass4 copy){ this.setChar1(copy.char1); }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char 1 = " + this.getChar1();
        return ClassNameAndFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}
