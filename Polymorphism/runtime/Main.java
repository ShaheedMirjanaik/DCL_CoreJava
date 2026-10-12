package Polymorphism.runtime;

public class Main {
    /*Three things are must to happen runtime ploymorphism.
     *1. IS-A Relationship.
     *2. Method overriding.
     *3. Upcasting.
     */
    public static void main(String[] args) {
        Car t = new Toyota();
        Car b = new BMW();
        t.type();
        b.type();
    }
}
