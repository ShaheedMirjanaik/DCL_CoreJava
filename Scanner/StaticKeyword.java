public class StaticKeyword {
    
    static int a = 234;

    static void display(){
        System.out.println("Hi!, Shaheed");
    }
    public static void main(String[] args) {
        
        System.out.println(StaticKeyword.a);
        StaticKeyword.display();
        
        System.out.println(a);
        display();
    }
}
