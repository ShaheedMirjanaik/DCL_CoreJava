// package methods;
public class MethodExample4 {
    
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        MethodExample4 me4 = new MethodExample4();
        System.out.println(me4.add(24, 78));
    }
}
