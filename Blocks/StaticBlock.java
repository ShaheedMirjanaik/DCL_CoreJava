public class StaticBlock {
    
    static int a ;
    static {
        a = 50;
        System.out.println("a value at 1st block: "+a);
    }
    
    public static void main(String[] args) {
        System.out.println(a);
        a = 150;
        System.out.println(a);
    }

    static {
        a = 100;
    }
}
