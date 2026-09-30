package Constructer;

public class Person {
    
    int age;
    String name;

    Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    Person(){
        System.out.println("hi");
    }

    Person(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        // Person p1 = new Person();
        Person p2 = new Person(25);
        System.out.println(p2.age);
        Person p3 = new Person("Shaheed",24);
        System.out.println(p3.name+" "+p3.age);
    }
}
