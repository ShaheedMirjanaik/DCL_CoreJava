package Constructer;

public class Chaining {

    int age;
    
    Chaining(){
        System.out.println(1);
    }

    Chaining(int a){
        this();
        this.age = 22;
        System.out.println(age);
    }

    Chaining(String s){
        this(10);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Chaining c1= new Chaining("Shaheed");
    }
}
