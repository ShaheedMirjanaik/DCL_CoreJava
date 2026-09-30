package Inheritance.Mobile;

public class Main {

    public static void main(String[] args) {

        System.out.println("||-------------------------------------------------------||");
        SmartPhone s1 = new SmartPhone();
        s1.brand = "Realme 14 pro";
        s1.ram = 8;
        s1.sms();
        System.out.println("||-------------------------------------------------------||");

        Android a = new Android();
        a.brand = "Oppo reno 9";
        a.ram = 12;
        a.price = 30246.45;
        a.playgame();
        System.out.println("||------------------------------------------------------||");

        IOS i = new IOS();
        i.brand = "Iphone 12";
        i.ram = 8;
        i.price = 87360.00;
        i.takePhoto();
        System.out.println("||------------------------------------------------------||");

        Iphone ip = new Iphone();
        ip.brand = "Iphone 18 pro max";
        ip.ram = 16;
        ip.price = 145689.50;
        ip.editing();
        System.out.println("||------------------------------------------------------||");
    }
}
