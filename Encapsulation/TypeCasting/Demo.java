package Encapsulation.TypeCasting;

public class Demo {

    /*Flaot 
     *float datatype - by default decimal values are terated as double 
     *                  types in java
     * So, we need to cast it to flaot int either of the 3 follwing ways.
     *
     * 
     *
     * Long 
     * long datatype - will be consider as int if the value is under the range of int.
     * If the value is beyond the range of int, we need to suffix with L or l to treat it as a long type.
     * 
     * 
     * For byte, short and char, int is automatically type casted to the res
     */
    
    public static void main(String[] args) {
        float f1 = 14.64f;
        float f2 = 145.5f;
        float f3 = (float) 14.65;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
