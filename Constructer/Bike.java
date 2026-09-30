package Constructer;

public class Bike {
    
    // public Bike(int a){
    //     System.out.println("hi");
    // }


    /**
     * Default Constructor
     * 
     * public Bike(){
     * 
     * }
     */

    int age;

    Bike(int a){
        age = a;
    }
    public static void main(String[] args) {
        Bike b = new Bike(45);
        Bike c = new Bike(50);
        System.out.println(b.age);
        System.out.println(c.age);
    }
}
