package Inheritance.SingleLevel;

public class Main {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.age);
        p1.eat();
        System.out.println();

        Student p2 = new Student();
        System.out.println(p2.age);
        System.out.println(p2.name);
        p2.eat();
        p2.attend();
    }
}
