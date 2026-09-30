public class MethodOverloading {
    
    void demo(){
        System.out.println("hi!");
    }

    void demo(int a){
        System.out.println("Value of a is: "+a);
    }

    void demo(String a,int b){
        System.out.println(a+" "+b);
    }

    String demo(String a){
        return a;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.demo();
        mo.demo(2);
        mo.demo("KGF", 3);
        System.out.println(mo.demo("hi! Shaheed"));
    }
}
