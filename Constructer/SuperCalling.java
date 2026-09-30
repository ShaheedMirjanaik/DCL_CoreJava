package Constructer;

public class SuperCalling {
    
    public static void main(String[] args) {
        Son s = new Son();
        // Daughter d = new Daughter();
    }
}

class Father{
    // int a;
    Father(){
        // a=2;
        System.out.println(5);
    }
}

class Son extends Father{


}

// class Daughter extends Son{
//     Daughter(){
//         super(52);
//         System.out.println(3);
//     }
// }