public class NonStatic {

    static int a;
    int b;

    {
        b =10;
        System.out.println(b);
    }
    public static void main(String[] args) {
        NonStatic ns = new NonStatic();
        ns.b = 52;
        System.out.println(ns.b);
        NonStatic ns1 = new NonStatic();
        System.out.println(ns1.b);
        //System.out.println(a);
    }

    static {
        a=50;
        //System.out.println(a);

    }
}
