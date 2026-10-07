package Encapsulation.NonPrimitiveTypeCasting;

public class Main {
    
    public static void main(String[] args) {
        
        // Upcasting
        Father f = new Son();
        System.out.println(f.age);
        // System.out.println(f.height); Not possible
        f.eat();
        f.dowork();
        System.out.println();

        //DownCasting
        Father f1 = new Son();
        Son s = (Son) f1;
        System.out.println(s.age);
        System.out.println(s.height);
        s.eat();
        s.dowork();
    }
}
