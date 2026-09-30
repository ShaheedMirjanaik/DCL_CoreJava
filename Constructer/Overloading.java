package Constructer;

public class Overloading {
    

    Overloading(){
        System.out.println("I want to buy a car.");
    }

    Overloading(int a){
        System.out.println("Prince of the car: "+a );
    }

    Overloading(String brand){
        System.out.println("Brand of the car : "+brand);
    }

    Overloading(int model, String name){
        System.out.println("Model of the car is : "+model);
        System.out.println("Name of the car is : "+name);
    }
}
