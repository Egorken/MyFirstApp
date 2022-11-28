package lr1;

public class Example3 {
    public static void main(String [] args) {
        int s, d, b;
        s=10;
        d=20;
        if (s<d) {
            System.out.println("S<D");
        }
        s=s*2;
        if (s==d) {
            System.out.println("S=D");
        }
        s=s*d;
        if (s>d) {
            System.out.println("S>D");
        }
        b=s+d;
        if (b>s) {
            System.out.println("От себя пример добавил: b=s+d = " +b);
        }
    }
}
