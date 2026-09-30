package Constructer;

public class Kangaroo {
    
    double height = 4.4;

    void m1(){
        double height = 5.8;
        System.out.println(height);
        System.out.println(this.height);
    }
    public static void main(String[] args) {
        Kangaroo k1 = new Kangaroo();
        k1.m1();

        Kangaroo k2 = new Kangaroo();
        k2.m1();
    }
}
