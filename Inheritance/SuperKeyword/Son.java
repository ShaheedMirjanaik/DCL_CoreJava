package Inheritance.SuperKeyword;

public class Son extends Father {
    
    int age = 22;
    void display(){
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.display();
    }
}
