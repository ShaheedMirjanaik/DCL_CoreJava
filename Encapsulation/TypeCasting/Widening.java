package Encapsulation.TypeCasting;

public class Widening {
    
    public static void main(String[] args) {
        byte a = 20;
        float b = a;
        System.out.println(a);
        System.out.println(b);

        int c = 45;
        double d = c;
        System.out.println(c);
        System.out.println(d);

        char e ='a';
        int f = e;
        double g = e;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    
}
