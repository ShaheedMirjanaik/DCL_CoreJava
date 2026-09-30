package Overriding;

public class Main1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Vehicle v = new Vehicle();
        v.start();
    }
}
