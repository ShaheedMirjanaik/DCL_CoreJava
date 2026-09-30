package Inheritance.Heirachical;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        System.out.println("Weight of animal is " + a1.weight);
        a1.drink();
        System.out.println("/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/");

        Wild w1 = new Wild();
        System.out.println("Weight of the animal is: " + w1.weight);
        System.out.println("Age of the Wild animal is: " + w1.age);
        w1.drink();
        w1.sleep();
        System.out.println("/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/");

        Domestic d1 = new Domestic();
        System.out.println("Weight of the Domestic Animal is: " + d1.weight);
        System.out.println("Name if the Domestic animal is: " + d1.name);
        d1.drink();
        d1.playing();
        System.out.println("/--/--/--/--/--/--/--/--/--/--/--/--/--/--/--/");

    }

}
