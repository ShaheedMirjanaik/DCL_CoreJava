package Inheritance.MultiLevel;

public class Main {
    
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        System.out.println(m1.battery);
        m1.sms();
        m1.call();
        System.out.println();

        SmartMobile m2 = new SmartMobile();
        System.out.println(m2.battery);
        System.out.println(m2.ram);
        m2.call();
        m2.watchYt();
        m2.sms();
        System.out.println();

        Iphone17 m3 = new Iphone17();
        System.out.println(m3.battery=10000);
        System.out.println(m3.ram);
        System.out.println(m3.camera);
        m3.call();
        m3.takePhoto();
        m3.watchYt();
    }
}
